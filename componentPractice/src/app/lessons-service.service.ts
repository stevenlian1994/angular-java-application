import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LessonsService {
  listOfLessons:any
  constructor() {
   }
  getLessons():any{
    this.listOfLessons = [1,3,5]
    return this.listOfLessons
  }
}
