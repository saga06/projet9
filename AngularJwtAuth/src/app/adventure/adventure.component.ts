import { Component, OnInit } from '@angular/core';
import {Adventure} from '../model/Adventure';
import {AdventureService} from '../services/adventure.service';
import {ActivatedRoute} from '@angular/router';
import {Observable} from 'rxjs';
import {CommentService} from '../services/comment.service';
import {HttpErrorResponse} from '@angular/common/http';


@Component({
  selector: 'app-adventure',
  templateUrl: './adventure.component.html',
  styleUrls: ['./adventure.component.scss'],
})
export class AdventureComponent implements OnInit {
  adventure: Adventure;
  comments: Observable<Comment>;
  id: any;
  addCommentStatus: Boolean;
  comment: Comment;
  errorMessage: string;

  constructor(private service: AdventureService, private commentService: CommentService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.adventure = new Adventure();
    this.id = this.route.snapshot.paramMap.get('id');
    this.getById();
    this.getComments();
    this.addCommentStatus = false;
    this.comment = new Comment();
  }
  getById() {
    this.service.getByID(this.id).subscribe(adventure => this.adventure = (adventure as Adventure));
  }

  getComments() {
    this.commentService.getCommentByAdventure(this.id).subscribe(
      data => {this.comments = data;
      });
  }

  newComment(model: Comment) {
    this.commentService.addComment(this.comment).subscribe((data: any) => {
      this.ngOnInit();
    }, (error: HttpErrorResponse) => {
      this.errorMessage
        = error.error.message;
    });
  }

  addComment(): void {
    this.addCommentStatus = true;
}

}
