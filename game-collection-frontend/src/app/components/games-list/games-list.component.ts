import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {InitService} from '../../service/init.service';
import {GameDetails} from "../../model/game-details";

@Component({
  selector: 'app-games-list',
  templateUrl: './games-list.component.html',
  styleUrls: ['./games-list.component.css']
})
export class GamesListComponent implements OnInit {
  searchText: string;
  $games: Observable<GameDetails[]>;

  constructor(private initService: InitService) {
    this.$games = initService.$games;
    console.log(this.$games);
  }

  ngOnInit(): void {
  }

  getDetails(event) {
    const gameDetails: GameDetails = event;
    alert('Someone clicked game ' + gameDetails.name);
  }
}
