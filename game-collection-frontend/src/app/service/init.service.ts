import { Injectable } from '@angular/core';
import {GamePlatformsService} from "./game-platforms.service";
import {GameDatabaseService} from "./game-database.service";
import {Observable} from "rxjs";
import {Game} from "../dto/game";

@Injectable({
  providedIn: 'root'
})
export class InitService {

  public selectOptions = [];
  public platformMap = new Map();
  public $games: Observable<Game[]>;

  constructor(private platformsService: GamePlatformsService,
              private databaseService: GameDatabaseService) { }

  init() {
    this.platformsService.getAllPlatforms().subscribe(result => {
      console.log(result.results);
      result.results.forEach(platform => {
        this.platformMap.set(platform.name, platform.id);
        this.selectOptions.push(platform.name);
      });
    });
    this.$games = this.databaseService.getAllGames();
  }
}
