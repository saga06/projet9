import { Component, OnInit } from '@angular/core';

import {Adventure} from '../model/Adventure';
import {Observable} from 'rxjs';
import {AdventureService} from '../services/adventure.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-all-adventure',
  templateUrl: './all-adventure.component.html',
  styleUrls: ['./all-adventure.component.css'],
})
export class AllAdventureComponent implements OnInit {
  adventures: Observable<Adventure[]>;
  adventure: any;

  constructor(private service: AdventureService, private router: Router) { }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.service.getAll().subscribe(data => {
      this.adventures = data;
    });
  }

  getById(id: string) {
    this.service.getByID(id).subscribe(this.adventure);
  }

  navigateTodDetail(id: any) {
    this.router.navigate(['aventure/', id]);
  }

}
