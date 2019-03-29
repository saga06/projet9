import { Component, OnInit } from '@angular/core';
import {CategoryService} from '../services/category.service';
import {Observable} from 'rxjs';
import {Category} from '../model/Category';
import {Router} from '@angular/router';

@Component({
  selector: 'app-all-category',
  templateUrl: './all-category.component.html',
  styleUrls: ['./all-category.component.css']
})
export class AllCategoryComponent implements OnInit {
  categories: Observable<Category>;

  constructor(private service: CategoryService, private router: Router) { }

  ngOnInit() {
    this.getAllCategories();
  }

  getAllCategories() {
    this.service.getAll().subscribe(data => {this.categories = data;
    });
  }

  navigateTodDetail(id: any) {
    this.router.navigate(['categories/', id]);
  }
}
