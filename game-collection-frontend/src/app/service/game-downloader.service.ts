import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs";
import {GameCollection} from "../dto/game-collection";

@Injectable({
  providedIn: 'root'
})
export class GameDownloaderService {

  private readonly allGamesUrl;
  private readonly searchGameUrl;

  constructor(private http: HttpClient) {
    this.allGamesUrl = 'https://api.rawg.io/api/games';
    this.searchGameUrl = 'https://api.rawg.io/api/games?search=';
  }

  public getAllGames(): Observable<GameCollection[]> {
    return this.http.get<GameCollection[]>(this.allGamesUrl);
  }

  public getGamesFromString(gameName: string): Observable<GameCollection> {
    return this.http.get<GameCollection>(this.searchGameUrl + gameName);
  }
}
