import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { PmComponent } from './pm/pm.component';



import { httpInterceptorProviders } from './auth/auth-interceptor';
import {AllAdventureComponent} from './all-adventure/all-adventure.component';
import {AdventureComponent} from './adventure/adventure.component';
import { AdventuresByCategoryComponent } from './adventures-by-category/adventures-by-category.component';
import { CategoryComponent } from './category/category.component';
import { AllCategoryComponent } from './all-category/all-category.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserComponent,
    RegisterComponent,
    HomeComponent,
    AdminComponent,
    AllAdventureComponent,
    AdventureComponent,
    PmComponent,
    AdventuresByCategoryComponent,
    CategoryComponent,
    AllCategoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [httpInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
