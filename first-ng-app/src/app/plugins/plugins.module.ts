import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PluginsComponent } from './plugins.component';
import { UpdateFileComponent } from './update-file/update-file.component';


@NgModule({
  declarations: [
    PluginsComponent,
    UpdateFileComponent,
  ],
  imports: [
    CommonModule,
  ]
})
export class PluginsModule { }
