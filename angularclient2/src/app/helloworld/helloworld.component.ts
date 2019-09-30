import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { User } from '../user';

@Component({
  selector: 'app-helloworld',
  templateUrl: './helloworld.component.html',
  styleUrls: ['./helloworld.component.css']
})
export class HelloworldComponent implements OnInit {
  userList: User[];

  constructor(private service: UserServiceService ) { }

  ngOnInit() {
    this.service.getHttp().subscribe(data => {
      // console.log('data:', data)
      this.userList = data;
      console.log('userList:', this.userList)
    })
  }

}
