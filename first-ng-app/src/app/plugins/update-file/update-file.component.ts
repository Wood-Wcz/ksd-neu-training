import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-file',
  templateUrl: './update-file.component.html',
  styleUrls: ['./update-file.component.css']
})
export class UpdateFileComponent implements OnInit {
  resultData:String = '';
  constructor() { }

  ngOnInit(): void {
  }
  onUploadResult(event: any){
    this.resultData = JSON.stringify(event);
  }
}
