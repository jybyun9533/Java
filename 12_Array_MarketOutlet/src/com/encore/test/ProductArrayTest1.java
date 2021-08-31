package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {

		Product[] product = { new Product("댕기머리샴푸", 23000, 2, "LG"), 
				new Product("삼다수생수", 2000, 7, "HP"),
				new Product("컵라면", 1200, 10, "SAMSUNG"),
				new Product("캣타워", 340000, 1, "LG") 
				};

		// 상품들 메이커 출력
		System.out.println("====상품들의 메이커를 출력합니다.====");
		for (Product p : product) {
			System.out.println(p.getMaker());
		}

		// 특정가격 이상 제품 출력
		System.out.println("====10만원 이상하는 제품들을 출력합니다.====");
		for (Product p : product) {
			if (p.getPrice() >= 100000)
				System.out.println(p.getDetail());
		}

		// 구매한 물건들의 총가격

		System.out.println("====총 구입가격을 출력합니다.====");
		int total = 0;
		for (Product p : product) {
			total += p.getPrice() * p.getQuantity();
		}
		System.out.println("Total Price : " + total + "원");

	} // main

}
