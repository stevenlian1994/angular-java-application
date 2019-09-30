import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponentComponent } from './home-component/home-component.component';
import { LessonsListComponent } from './lessons-list/lessons-list.component';

const routes: Routes = [
  {path:'home', component:HomeComponentComponent, children:[
    {path:'list', component:LessonsListComponent },
  ]
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
