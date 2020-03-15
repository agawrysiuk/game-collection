import { BrowserModule } from '@angular/platform-browser';
import {APP_INITIALIZER, NgModule} from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { GameSearchComponent } from './components/game-search/game-search.component';
import { GamesListComponent } from './components/games-list/games-list.component';
import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule} from '@angular/common/http';
import {InitService} from "./service/init.service";
import {NgbTooltipModule} from "@ng-bootstrap/ng-bootstrap";
import { PickRandomGameComponent } from './components/pick-random-game/pick-random-game.component';
import { ButtonTileComponent } from './shared/components/button-tile/button-tile.component';
import {SHARED_DECLARATIONS} from "./shared/app.shared-declarations";

export function initData(initService: InitService) {
  return () => initService.init();
}

@NgModule({
  declarations: [
    AppComponent,
    GameSearchComponent,
    GamesListComponent,
    PickRandomGameComponent,
    SHARED_DECLARATIONS
  ],
  imports: [
    BrowserModule,
    FormsModule,
    Ng2SearchPipeModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgbTooltipModule
  ],
  providers: [
    { provide: APP_INITIALIZER,
    useFactory: initData,
    deps: [InitService],
    multi: true
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
