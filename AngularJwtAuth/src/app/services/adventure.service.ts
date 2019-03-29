import { Injectable } from '@angular/core';
import {HttpClient} from '../../../node_modules/@angular/common/http';
import {Observable} from 'rxjs';
import {configURLApi} from '../config';

@Injectable({
  providedIn: 'root'
})
export class AdventureService {

  constructor(private http: HttpClient) {}
  getAll(): Observable<any> {
    return this.http.get(configURLApi.allAdventures);
  }

  getByID(id: string) {
    return this.http.get(configURLApi.adventure(id));
  }

  getAdventuresByCategory(id: string): Observable<any> {
    return this.http.get((configURLApi.allAdventuresByCategory(id)));
  }
}
