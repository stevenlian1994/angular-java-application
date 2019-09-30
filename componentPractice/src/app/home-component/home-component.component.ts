import { Component, OnInit } from '@angular/core';
import { LessonsService } from '../lessons-service.service';

@Component({
  selector: 'app-home-component',
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.css']
})
export class HomeComponentComponent implements OnInit {

  lessons:any;
  count: number = 5;
  title = 'app';

  constructor(private lessonService: LessonsService) { }

  ngOnInit() {
    this.getLessons()
  }
  getLessons(){
    this.lessons = this.lessonService.getLessons()
  }
  changeList(){
    this.lessons = [2,2,2]
    this.title = "hello world"
  }

}
