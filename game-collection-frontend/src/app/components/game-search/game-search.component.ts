import { Component, OnInit } from '@angular/core';
import {Game} from "../../dto/game";
import {GameDownloaderService} from "../../service/game-downloader.service";
import {GameCollection} from "../../dto/game-collection";
import {FormControl, Validators} from "@angular/forms";
import {InitService} from "../../service/init.service";


@Component({
  selector: 'app-game-search',
  templateUrl: './game-search.component.html',
  styleUrls: ['./game-search.component.css']
})
export class GameSearchComponent implements OnInit {
  games: Game[];
  searchText = new FormControl('', Validators.required);
  select = new FormControl('PC');
  selectOptions;
  platformMap;

  constructor(private gameDownloaderService: GameDownloaderService,
              private initService: InitService) {
  }

  ngOnInit(): void {
    this.selectOptions = this.initService.selectOptions;
    this.platformMap = this.initService.platformMap;
  }


  searchForGames() {
    const platformNumber = this.platformMap.get(this.select.value);
    this.gameDownloaderService.getGamesFromString(this.searchText.value, platformNumber).subscribe((result: GameCollection) => {
      this.games = result.results;
      return this.games;
    });
  }
}
