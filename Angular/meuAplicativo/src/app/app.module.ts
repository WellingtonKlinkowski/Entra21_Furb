import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CoreComponent } from './@angular/material/core/core.component';
import { MaterialModuleComponent } from './material.module/material.module.component';


@NgModule({
  declarations: [
    MaterialModuleComponent,
    AppComponent,
    HeaderComponent,
    CoreComponent,
    MaterialModuleComponent
  ],
  imports: [
    MatToolbarModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
