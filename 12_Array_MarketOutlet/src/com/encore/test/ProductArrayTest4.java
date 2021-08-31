package com.encore.test;

import com.encore.service.OutletStoreService;
/*
 * OutletStoreService와 Hasing되는 Test Class
 * 
 */
import com.encore.service.ProductStoreService;
import com.encore.vo.Customer;
import com.encore.vo.Product;

public class ProductArrayTest4 {

	public static void main(String[] args) {

		OutletStoreService service = new OutletStoreService();

		Product[] pros1 = { // 이나영
				new Product("댕기머리샴푸", 23000, 2, "LG"), 
				new Product("삼다수생수", 2000, 7, "HP"),
				new Product("컵라면", 1200, 10, "SAMSUNG"), 
				new Product("캣타워", 340000, 1, "LG")
				};

		Product[] pros2 = { // 원빈
				new Product("죽염치약", 5600, 2, "CJ"), 
				new Product("새우깡", 2000, 2, "농심"),
				new Product("신라면", 2300, 10, "농심") 
				};

		Customer[] customers = new Customer[2];
		customers[0] = new Customer(111, "이나영", "방배동");
		customers[1] = new Customer(222, "원빈", "방배동");

		// #### 아래부터는 Service의 기능을 호출 ####

		// 1. 특정 고객이 구입한 상품정보를 리턴
		for (Product p : service.buyProductDetail(customers[0], pros1)) {
			System.out.println(p.getDetail());
		}

		// 2. 특정 고객이 구입한 상품의 maker들만 리턴
		for (Product p : service.buyProductDetail(customers[0], pros1)) {
			System.out.println(p.getMaker());
		}
		
		// 3. Outlet에 있는 모든 고객을 리턴
		
		
		
		
		
	} // main

}
