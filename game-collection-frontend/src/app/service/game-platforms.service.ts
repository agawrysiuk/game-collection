import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs";
import {PlatformCollection} from "../model/platform";

@Injectable({
  providedIn: 'root'
})
export class GamePlatformsService {

  private readonly allPlatformsUrl;

  constructor(private http: HttpClient) {
    this.allPlatformsUrl = 'https://api.rawg.io/api/platforms';
  }

  public getAllPlatforms(): Observable<PlatformCollection> {
    return this.http.get<PlatformCollection>(this.allPlatformsUrl);
  }

}
