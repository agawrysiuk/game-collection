import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Game} from "../../dto/game";
import {GameDownloaderService} from "../../service/game-downloader.service";

@Component({
  selector: 'app-game-search',
  templateUrl: './game-search.component.html',
  styleUrls: ['./game-search.component.css']
})
export class GameSearchComponent implements OnInit {
  searchText: string;
  games: Game[];

  constructor(private gameDownloaderService: GameDownloaderService) { }

  ngOnInit(): void {
  }


  searchForGames(value: string) {
    this.games = this.gameDownloaderService.getGamesFromString(value);
  }
}
