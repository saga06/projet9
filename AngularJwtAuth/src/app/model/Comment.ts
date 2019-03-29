export class Comment {
  id: number;
  commentaire: string;
  dateComment: Date;
  idAdventure: number;
  idUser: number;

  constructor() {
    this.id = 0;
    this.commentaire = '';
    this.dateComment = new Date();
    this.idAdventure = 0;
    this.idUser = 0;
  }

}
