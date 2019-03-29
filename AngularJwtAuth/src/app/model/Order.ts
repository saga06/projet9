export class Order {

  order_id: number;
  user_id: number;
  adventure_id: number;
  date: Date;

  constructor() {
    this.order_id = 0;
    this.user_id = 0;
    this.adventure_id = 0;
    this.date = new Date();
  }
}
