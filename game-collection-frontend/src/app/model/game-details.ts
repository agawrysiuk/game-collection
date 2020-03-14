import {Platform} from "./platform";

export class GameDetails {
  slug: string;
  name: string;
  description: string;
  released: string;
  background_image: string;
  website: string;
  platforms: Platform[];
  genres: Genre[];
  tags: Tag[];
}

export class ScreenShot {
  id: number;
  image: string;
}

export class Genre {
  id: number;
  name: string;
}

export class Tag {
  id: number;
  name: string;
}
