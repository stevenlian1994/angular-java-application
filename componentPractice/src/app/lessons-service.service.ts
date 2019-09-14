import { Injectable, Input } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LessonsService {
  @Input('innerText')
  listOfLessons:any
  constructor() {
   }
  getLessons():any{
    this.listOfLessons = [1,3,5]
    return this.listOfLessons
  }
}
