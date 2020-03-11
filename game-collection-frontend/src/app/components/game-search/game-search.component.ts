import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Game} from "../../dto/game";
import {GameDownloaderService} from "../../service/game-downloader.service";
import {GameCollection} from "../../dto/game-collection";

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
    this.gameDownloaderService.getGamesFromString(value).subscribe((result: GameCollection) => {
      this.games = result.results;
      console.log(this.games);
      return this.games;
    });
  }
}
