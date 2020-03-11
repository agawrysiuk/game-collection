import { Component, OnInit } from '@angular/core';
import {Game} from "../../dto/game";
import {GameDownloaderService} from "../../service/game-downloader.service";
import {GameCollection} from "../../dto/game-collection";
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-game-search',
  templateUrl: './game-search.component.html',
  styleUrls: ['./game-search.component.css']
})
export class GameSearchComponent implements OnInit {
  games: Game[];
  searchText = new FormControl('', Validators.required);

  constructor(private gameDownloaderService: GameDownloaderService) { }
  ngOnInit(): void {
  }


  searchForGames(value: string) {
    this.gameDownloaderService.getGamesFromString(value).subscribe((result: GameCollection) => {
      this.games = result.results;
      console.log(this.games);
      return this.games;
    });
  }
}
