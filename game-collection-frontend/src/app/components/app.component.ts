import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'game-collection-frontend';
  searchText: string;
  games = [
    { name: 'Stronghold', released: '2002' },
    { name: 'Alien: Isolation', released: '2014' },
    { name: 'Borderlands', released: '2009' },
    { name: 'The Witcher 3: Wild Hunt', released: '2015' },
    { name: 'Fallout', released: '1997' },
    ];
}
