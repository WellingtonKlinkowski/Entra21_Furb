import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatCommonModule} from '@angular/material/core';
import { ToolbarComponent } from './conteudo/toolbar/toolbar.component';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatCardModule} from '@angular/material/card';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatSliderModule} from '@angular/material/slider';
import {MatRadioModule} from '@angular/material/radio';
import {MatGridListModule} from '@angular/material/grid-list';
import { GridListComponent } from './conteudo/grid-list/grid-list.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import { CalendarioComponent } from './conteudo/calendario/calendario.component';
import {MatStepperModule} from '@angular/material/stepper';
import {MatFormFieldModule} from '@angular/material/form-field';

@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    GridListComponent,
    CalendarioComponent
  ],
  imports: [
    MatFormFieldModule,
    MatStepperModule,
    MatDatepickerModule,
    MatGridListModule,
    MatRadioModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatCardModule,
    MatProgressSpinnerModule,
    MatCommonModule,
    MatIconModule,
    MatToolbarModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
