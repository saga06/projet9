import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {User} from '../model/User';
import {configURLApi} from '../config';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl = 'http://localhost:8080/api/test/user';
  private pmUrl = 'http://localhost:8080/api/test/pm';
  private adminUrl = 'http://localhost:8080/api/test/admin';
  private aventureUrl = 'http://localhost:8080/api/test/aventure';

  constructor(private http: HttpClient) { }

  getUserBoard(username: string) {
    return this.http.get(configURLApi.userById(username));
  }

  getPMBoard(): Observable<string> {
    return this.http.get(this.pmUrl, { responseType: 'text' });
  }

  getAdminBoard(): Observable<string> {
    return this.http.get(this.adminUrl, { responseType: 'text' });
  }

  getAventureBoard(): Observable<string> {
    return this.http.get(this.aventureUrl, { responseType: 'text' });
  }
}
