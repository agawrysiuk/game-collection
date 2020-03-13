import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {GamesListComponent} from './components/games-list/games-list.component';
import {GameSearchComponent} from './components/game-search/game-search.component';
import {PickRandomGameComponent} from './components/pick-random-game/pick-random-game.component';

const routes: Routes = [
  { path: '', component: GamesListComponent },
  { path: 'games-list', component: GamesListComponent },
  { path: 'game-search', component: GameSearchComponent },
  { path: 'pick-random', component: PickRandomGameComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
