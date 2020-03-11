import { Component, OnInit } from '@angular/core';
import {Game} from "../../dto/game";
import {GameDownloaderService} from "../../service/game-downloader.service";
import {GameCollection} from "../../dto/game-collection";
import {FormControl, Validators} from "@angular/forms";
import {GamePlatformsService} from "../../service/game-platforms.service";
import {Platforms} from "../../dto/platforms";


@Component({
  selector: 'app-game-search',
  templateUrl: './game-search.component.html',
  styleUrls: ['./game-search.component.css']
})
export class GameSearchComponent implements OnInit {
  games: Game[];
  searchText = new FormControl('', Validators.required);
  select = new FormControl('PC');
  selectOptions = [];
  platformMap = new Map();

  constructor(private gameDownloaderService: GameDownloaderService,
              private platformsService: GamePlatformsService) {
    this.platformsService.getAllPlatforms().subscribe(result => {
      console.log(result.results);
      result.results.forEach(platform => {
        this.platformMap.set(platform.name, platform.id);
        this.selectOptions.push(platform.name);
      });
    });
  }

  ngOnInit(): void {
  }


  searchForGames() {
    const platformNumber = this.platformMap.get(this.select.value);
    this.gameDownloaderService.getGamesFromString(this.searchText.value, platformNumber).subscribe((result: GameCollection) => {
      this.games = result.results;
      return this.games;
    });
  }
}
