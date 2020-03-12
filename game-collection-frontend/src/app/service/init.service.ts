import { Injectable } from '@angular/core';
import {GamePlatformsService} from "./game-platforms.service";

@Injectable({
  providedIn: 'root'
})
export class InitService {

  public selectOptions = [];
  public platformMap = new Map();

  constructor(private platformsService: GamePlatformsService) { }

  init() {
    this.platformsService.getAllPlatforms().subscribe(result => {
      console.log(result.results);
      result.results.forEach(platform => {
        this.platformMap.set(platform.name, platform.id);
        this.selectOptions.push(platform.name);
      });
    });
  }
}
