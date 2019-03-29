import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import {User} from '../model/User';
import {ActivatedRoute} from '@angular/router';
import {TokenStorageService} from '../auth/token-storage.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  user: User;
  username: string;
  info: any;

  constructor(private userService: UserService, private route: ActivatedRoute, private token: TokenStorageService) { }

  ngOnInit() {
    this.user = new User;
    this.username = this.route.snapshot.paramMap.get('username');
    this.userService.getUserBoard(this.username).subscribe( user => this.user = (user as User));
    this.info = {
      token: this.token.getToken(),
      username: this.token.getUsername(),
      authorities: this.token.getAuthorities()
    };
  }

  logout() {
    this.token.signOut();
    window.location.reload();
  }
}
