export class Game {
  // displayed in a table
  name: string;
  released: string;
  background_image: string;


  // slug is an id
  slug: string;
}

export class GameCollection {
  count: number;
  next?: string;
  previous?: string;
  results: Game[];
}
