import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Game} from "../../dto/game";

@Component({
  selector: 'app-game-search',
  templateUrl: './game-search.component.html',
  styleUrls: ['./game-search.component.css']
})
export class GameSearchComponent implements OnInit {
  searchText: string;
  games: Observable<Game[]>;

  constructor() { }

  ngOnInit(): void {
  }


  searchForGames(value: string) {

  }
}
