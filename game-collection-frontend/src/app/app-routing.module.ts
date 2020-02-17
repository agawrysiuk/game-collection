import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {GamesListComponent} from './components/games-list/games-list.component';
import {GameSearchComponent} from './components/game-search/game-search.component';

const routes: Routes = [
  { path: '', component: GamesListComponent },
  { path: 'games-list', component: GamesListComponent },
  { path: 'game-search', component: GameSearchComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
