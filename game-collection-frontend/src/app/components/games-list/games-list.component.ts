import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Game} from "../../dto/game";
import {GameDatabaseService} from "../../service/game-database.service";

@Component({
  selector: 'app-games-list',
  templateUrl: './games-list.component.html',
  styleUrls: ['./games-list.component.css']
})
export class GamesListComponent implements OnInit {
  searchText: string;
  $games: Observable<Game[]>;

  constructor(private databaseService: GameDatabaseService) {
    this.$games = databaseService.getAllGames();
    console.log(this.$games);
  }

  ngOnInit(): void {
  }

}
