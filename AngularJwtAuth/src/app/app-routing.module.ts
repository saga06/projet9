import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { PmComponent } from './pm/pm.component';
import { AdminComponent } from './admin/admin.component';
import {AllAdventureComponent} from './all-adventure/all-adventure.component';
import {AdventureComponent} from './adventure/adventure.component';
import {AllCategoryComponent} from './all-category/all-category.component';
import {CategoryComponent} from './category/category.component';

const routes: Routes = [
    {
        path: 'home',
        component: HomeComponent
    },
    {
        path: 'user',
        component: UserComponent
    },
    {
        path: 'pm',
        component: PmComponent
    },
    {
        path: 'admin',
        component: AdminComponent
    },
    {
        path: 'auth/login',
        component: LoginComponent
    },
    {
        path: 'signup',
        component: RegisterComponent
    },
    {
        path: '',
        redirectTo: 'home',
        pathMatch: 'full'
    },
  {path: 'aventures', component: AllAdventureComponent},
  {path: 'aventure/:id', component: AdventureComponent},
  {path: 'categories', component: AllCategoryComponent},
  {path: 'categories/:id', component: CategoryComponent}


  /*{path: '', component: HomeComponent},
  {path: 'login', component: AuthentificationComponent},
  {path: 'categorie', component: CategoryComponent},
  {path: 'categories', component: AllCategoryComponent},
  {path: 'commande', component: OrderComponent},
  {path: 'nouvelle-commande', component: CreateOrderComponent},
  {path: 'commandes', component: AllOrderComponent},
  {path: 'mon-compte', component: AccountComponent}*/
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
