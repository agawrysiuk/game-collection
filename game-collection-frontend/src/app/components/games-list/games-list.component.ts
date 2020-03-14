import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Game} from '../../model/game';
import {InitService} from '../../service/init.service';

@Component({
  selector: 'app-games-list',
  templateUrl: './games-list.component.html',
  styleUrls: ['./games-list.component.css']
})
export class GamesListComponent implements OnInit {
  searchText: string;
  $games: Observable<Game[]>;

  constructor(private initService: InitService) {
    this.$games = initService.$games;
    console.log(this.$games);
  }

  ngOnInit(): void {
  }

}
