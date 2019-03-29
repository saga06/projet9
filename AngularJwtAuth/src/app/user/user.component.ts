import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import {User} from '../model/User';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  user: User;
  username: string;

  constructor(private userService: UserService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.user = new User;
    this.username = this.route.snapshot.paramMap.get('username');
    this.userService.getUserBoard(this.username).subscribe( user => this.user = (user as User));
  }
}
