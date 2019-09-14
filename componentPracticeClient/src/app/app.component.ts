import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'componentPracticeClient';
  initialCount: number = 10;

  changeTitle(){
    this.title="hello world"
  }
}
