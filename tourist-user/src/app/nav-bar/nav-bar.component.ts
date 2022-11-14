import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  constructor(private router:Router) { }
  view(){
    this.router.navigate(['view']);
}
  register(){
    this.router.navigate(['register'])
}
home(){
  this.router.navigate(['home'])
}

  ngOnInit(): void {
  }

}
