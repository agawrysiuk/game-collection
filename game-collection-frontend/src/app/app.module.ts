import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './components/app.component';
import {FormsModule} from '@angular/forms';

import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { GameSearchComponent } from './components/game-search/game-search.component';

@NgModule({
  declarations: [
    AppComponent,
    GameSearchComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
