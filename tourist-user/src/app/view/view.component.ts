import { Component, OnInit } from '@angular/core';
import { Tourist } from '../tourist';
import { TouristService } from '../tourist.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  tourists:Tourist[]=[];
  
  constructor(private tserve:TouristService) { }

  ngOnInit(): void {
    this.tserve.getuserdata().subscribe(data=>{
      this.tourists=data;
    })

  }

}
