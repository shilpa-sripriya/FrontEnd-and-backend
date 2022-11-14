import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Tourist } from '../tourist';
import { TouristService } from '../tourist.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 
   t =new Tourist();
  
  firstName: any;
  lastName: any;
  isValid: boolean = true;
  t2:Tourist[] =[];
  constructor(private tserve:TouristService,private router:Router) { }

  
  ngOnInit(): void {
  
  }
  
  register(){
    this.t.name=this.firstName+" "+this.lastName
    this.tserve.postuserdata(this.t).subscribe(data=>(
      alert("Tourist Registered You will be returned to Homepage")
      
    ));
    this.router.navigate(['home']);
  }

}
