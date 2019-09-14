import {Component, OnInit, Input, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-lessons-list',
  templateUrl: './lessons-list.component.html',
  styleUrls: ['./lessons-list.component.css']
})
export class LessonsListComponent implements OnInit {
  @Input ('lessons')
  lessons: any = [0,5,10];
  

  constructor() { }

  ngOnInit() {
    console.log('inside lessonslist comp', this.lessons)
  }

}
