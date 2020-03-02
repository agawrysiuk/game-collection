import {Game} from './game';

export class GameCollection {
  count: number;
  next?: string;
  previous?: string;
  results: Game[];
}
