import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Game} from "../dto/game";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class GameDownloaderService {

  private readonly allGamesUrl;
  private

  constructor(private http: HttpClient) {
    this.allGamesUrl = 'https://api.rawg.io/api/games';
  }

  public getAllGames(): Observable<Game[]> {
    return this.http.get<Game[]>(this.allGamesUrl);
  }
}
