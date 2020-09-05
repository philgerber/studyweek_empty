import { Component, OnInit } from '@angular/core';
import {ShopService} from "../services/shop.service";
import {Shop} from "../models/Shop";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  shops: Shop[];

  constructor(private shopService: ShopService) { }

  ngOnInit() {
    this.shopService.getAll().subscribe(data => {
      this.shops = data;
    });
  }

}
