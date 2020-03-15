import {Component, EventEmitter, Input, Output} from '@angular/core';
import {GameDetails} from "../../../model/game-details";

@Component({
  selector: 'button-tile',
  templateUrl: './button-tile.component.html',
  styleUrls: ['./button-tile.component.css']
})
export class ButtonTileComponent {

  @Input() title: string;
  @Input() image: string;
  @Input() buttonText: string = 'Check out';
  @Input() gameDetails: GameDetails;
  @Output() buttonClicked: EventEmitter<GameDetails> = new EventEmitter<GameDetails>();

  constructor() { }

  clicked() {
    this.buttonClicked.emit(this.gameDetails);
  }
}
