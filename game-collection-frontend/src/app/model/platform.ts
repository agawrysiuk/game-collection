export class Platform {
  id: number;
  name: string;
}

export class PlatformCollection {
  count: number;
  next?: string;
  previous?: string;
  results: Platform[];
}
