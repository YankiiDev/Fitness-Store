import {Component, Input, OnInit} from '@angular/core';
import {ProductInfo} from "../../../../common/shopping/product-info";

@Component({
  selector: 'app-product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.sass']
})
export class ProductCardComponent implements OnInit {


  @Input() productInfo!: ProductInfo;

  constructor() { }

  ngOnInit(): void {
  }

}
