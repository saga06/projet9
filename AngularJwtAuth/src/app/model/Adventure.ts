import {Picture} from './Picture';
import {Category} from './Category';

export class Adventure {

  adventure_id: number;
  date_end: Date;
  date_start: Date;
  description: string;
  category = Category;
  name: string;
  number_of_participants: number;
  price: number;
  pictures: Picture[];

  constructor() {
    this.adventure_id = 0;
    this.date_end = new Date();
    this.date_start = new Date();
    this.description = '';
    this.name = '';
    this.number_of_participants = 0;
    this.price = 0;
    this.pictures = [];
    this.category = Category;
  }
}
