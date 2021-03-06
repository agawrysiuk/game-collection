import { Component, OnInit } from '@angular/core';
import {InitService} from "../../service/init.service";
import {Game} from "../../model/game";
import {GameDetails} from "../../model/game-details";

@Component({
  selector: 'app-pick-random-game',
  templateUrl: './pick-random-game.component.html',
  styleUrls: ['./pick-random-game.component.css']
})
export class PickRandomGameComponent implements OnInit {

  games: GameDetails[] = [];
  pickedGame: GameDetails = new GameDetails();

  constructor(private initService: InitService) {
    this.initService.$games.subscribe(result => {
      this.games = result;
      this.pickRandomGame();
    });
  }

  ngOnInit(): void {
  }

  pickRandomGame() {
    this.pickedGame = this.games[Math.floor(Math.random() * this.games.length)];
  }

}
