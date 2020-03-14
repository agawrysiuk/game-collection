import { Injectable } from '@angular/core';
import {GamePlatformsService} from "./game-platforms.service";
import {GameDatabaseService} from "./game-database.service";
import {Observable} from "rxjs";
import {Game} from "../model/game";
import {GameDetails} from "../model/game-details";

@Injectable({
  providedIn: 'root'
})
export class InitService {

  public selectOptions = [];
  public platformMap = new Map();
  public $games: Observable<GameDetails[]>;

  constructor(private platformsService: GamePlatformsService,
              private databaseService: GameDatabaseService) { }

  init() {
    this.platformsService.getAllPlatforms().subscribe(result => {
      result.results.forEach(platform => {
        this.platformMap.set(platform.name, platform.id);
        this.selectOptions.push(platform.name);
      });
    });
    this.$games = this.databaseService.getAllGames();
  }
}
