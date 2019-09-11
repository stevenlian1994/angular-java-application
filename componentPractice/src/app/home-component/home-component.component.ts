import { Component, OnInit } from '@angular/core';
import { LessonsService } from '../lessons-service.service';

@Component({
  selector: 'app-home-component',
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.css']
})
export class HomeComponentComponent implements OnInit {

  lessons:any;

  constructor(private lessonService: LessonsService) { }

  ngOnInit() {
    this.getLessons()
  }
  getLessons(){
    this.lessons = this.lessonService.getLessons()
    console.log(this.lessons)
  }

}
