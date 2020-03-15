import {Component, Input} from '@angular/core';

@Component({
  selector: 'button-tile',
  templateUrl: './button-tile.component.html',
  styleUrls: ['./button-tile.component.css']
})
export class ButtonTileComponent {

  @Input() title: string;
  @Input() image: string;
  @Input() buttonText: string = 'Check out';

  constructor() { }
}
