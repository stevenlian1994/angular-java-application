import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http: HttpClient) {
   }
  public getHttp(): Observable<User[]>{
    return this.http.get<User[]>('http://localhost:8080/users')
  }
}
