import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {configURLApi} from '../config';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommentService {

  constructor(private http: HttpClient) { }
  getCommentByAdventure(adventure_id: string): Observable<any> {
    return this.http.get(configURLApi.commentsByAdventure(adventure_id));
  }
  addComment(comment: Comment) {
    return this.http.post(configURLApi.createComment, comment);
  }
}
