import { Component, OnInit } from '@angular/core';
import {CategoryService} from '../services/category.service';
import {Category} from '../model/Category';
import {ActivatedRoute, Router} from '@angular/router';
import {Observable} from 'rxjs';
import {Adventure} from '../model/Adventure';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  category: Category;
  adventures: Observable<Adventure>
  id: any;

  constructor(private service: CategoryService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.category = new Category();
    this.id = this.route.snapshot.paramMap.get('id');
    this.getAdventures();
    this.service.CategoryById(this.id).subscribe(category => this.category = (category as Category));
  }

  getAdventures() {
    this.service.AdventuresByCategory(this.id).subscribe(data => {this.adventures = data;
    });
  }

  navigateTodDetail(id: any) {
    this.router.navigate(['aventure/', id]);
  }

}
