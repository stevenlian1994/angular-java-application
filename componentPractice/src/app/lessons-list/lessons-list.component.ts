import {Component, OnInit, Input, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-lessons-list',
  templateUrl: './lessons-list.component.html',
  styleUrls: ['./lessons-list.component.css']
})
export class LessonsListComponent implements OnInit {
  @Input ()
  lessons: any;

  constructor() { }

  ngOnInit() {
    console.log('inside lessonslist comp', this.lessons)
  }

}
