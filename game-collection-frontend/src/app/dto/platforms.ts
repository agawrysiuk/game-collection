export class Platforms {
  id: number;
  name: string;
}

export class PlatformCollection {
  count: number;
  next?: string;
  previous?: string;
  results: Platforms[];
}
