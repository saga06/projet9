import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {configURLApi} from '../config';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(configURLApi.allCategories);
  }

  AdventuresByCategory(category_id: string): Observable<any> {
    return this.http.get(configURLApi.adventuresByCategory(category_id));
  }

  CategoryById(category_id: string) {
    return this.http.get(configURLApi.categoryById(category_id));
  }
}
