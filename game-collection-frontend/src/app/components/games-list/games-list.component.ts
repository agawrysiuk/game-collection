import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-games-list',
  templateUrl: './games-list.component.html',
  styleUrls: ['./games-list.component.css']
})
export class GamesListComponent implements OnInit {
  searchText: string;
  games = [
    { name: 'Stronghold', released: '2002' },
    { name: 'Alien: Isolation', released: '2014' },
    { name: 'Borderlands', released: '2009' },
    { name: 'The Witcher 3: Wild Hunt', released: '2015' },
    { name: 'Fallout', released: '1997' },
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
