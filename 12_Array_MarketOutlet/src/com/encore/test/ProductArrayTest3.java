package com.encore.test;

import com.encore.service.ProductStoreService;
import com.encore.vo.Product;

public class ProductArrayTest3 {

	public static void main(String[] args) {

		ProductStoreService service = new ProductStoreService();

		Product[] product = { new Product("댕기머리샴푸", 23000, 2, "LG"), new Product("삼다수생수", 2000, 7, "HP"),
				new Product("컵라면", 1200, 10, "SAMSUNG"), new Product("캣타워", 340000, 1, "LG") };

		System.out.println("====1. 모든 상품의 메이커를 출력합니다.====");
		service.printProductMakers(product);

		System.out.println("====2. 모든 상품의 총 구입액을 출력합니다.====");
		System.out.println(service.getTotalPrice(product) + "원");

		System.out.println("====3. 1만원 이상의 제픔들을 출력합니다.====");
		Product[] returnPros = service.getMorePrice(product, 10000);
		for (Product p : returnPros) { // logic은 맞지만 null값때문에 에러발생.
			if (p == null) {
				continue;
			}
			System.out.println(p.getDetail());
		}

		System.out.println("====4. 동일한 회사의 제픔들을 출력합니다.====");
		Product[] returnPros1 = service.getCertainCompany(product, "LG");
		for (Product p : returnPros) { // logic은 맞지만 null값때문에 에러발생.
			if (p == null) {
				continue;
			}
			System.out.println(p.getDetail());
		}
		
		System.out.println("====5. 제픔들의 평균가를 출력합니다.====");
		System.out.println(service.getAvgPrice(product)+"원 입니다");

	} // main

}
