import {ScreenShot} from "./screenshot";

export class Game {
  // displayed in a table
  name: string;
  released: string;
  background_image: string;
  short_screenshots: ScreenShot[];


  // slug is an id
  slug: string;
}
