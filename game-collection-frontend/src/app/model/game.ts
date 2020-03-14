export class Game {
  // displayed in a table
  name: string;
  released: string;
  background_image: string;
  short_screenshots: ScreenShot[];
  genres: Genre[];


  // slug is an id
  slug: string;
}

export class GameCollection {
  count: number;
  next?: string;
  previous?: string;
  results: Game[];
}

export class ScreenShot {
  id: number;
  image: string;
}

export class Genre {
  id: number;
  name: string;
}
