import { Injectable } from '@angular/core';
import {Game} from "../dto/game";
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class GameDatabaseService {

  private readonly saveGameUrl;

  constructor(private http: HttpClient) {
    this.saveGameUrl = 'http://localhost:8080/save';
  }

  saveGame(game: Game) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };
    console.log(game);
    this.http.post<Game>(this.saveGameUrl, game,  httpOptions).subscribe(data => console.log(data));
  }
}
