import { Injectable } from '@angular/core';
import {Game} from "../model/game";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {GameDetails} from "../model/game-details";

@Injectable({
  providedIn: 'root'
})
export class GameDatabaseService {

  private readonly saveGameUrl;
  private readonly getAllGamesUrl;

  constructor(private http: HttpClient) {
    this.saveGameUrl = 'http://localhost:8080/save';
    this.getAllGamesUrl = 'http://localhost:8080/games';
  }

  saveGame(game: Game) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };
    this.http.post<Game>(this.saveGameUrl, game,  httpOptions).subscribe(data => console.log(data));
  }

  getAllGames(): Observable<GameDetails[]> {
    return this.http.get<GameDetails[]>(this.getAllGamesUrl);
  }
}
