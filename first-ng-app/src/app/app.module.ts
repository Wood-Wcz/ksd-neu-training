import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {RouterModule} from "@angular/router";
import {MenubarModule} from "primeng/menubar";
import {AppRoutingModule} from "./app-routing.module";
import {AuthComponent} from "./auth/auth.component";
import {CardModule} from "primeng/card";
import {MessageModule} from "primeng/message";
import {MessagesModule} from "primeng/messages";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {ButtonModule} from "primeng/button";
import {InputTextModule} from "primeng/inputtext";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {PanelModule} from 'primeng/panel';
import {UpdateFileComponent} from "./plugins/update-file/update-file.component";
import {FileUploadModule} from 'primeng/fileupload';

@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    UpdateFileComponent,
  ],
  imports: [
    FileUploadModule,
    FormsModule,
    BrowserModule,
    RouterModule,
    MenubarModule,
    AppRoutingModule,
    CardModule,
    MessageModule,
    MessagesModule,
    ReactiveFormsModule,
    HttpClientModule,
    ButtonModule,
    InputTextModule,
    BrowserAnimationsModule,
    PanelModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
