import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from "./list/list.component";


const routes: Routes = [
  { path: '', redirectTo: '/shops', pathMatch: 'full' },
  { path: 'shops', component: ListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
