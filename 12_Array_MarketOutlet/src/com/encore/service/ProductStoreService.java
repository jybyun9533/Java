package com.encore.service;

import com.encore.vo.Product;

/*
 * ProductStore에 있는 다앙햔 상품들을 다루는 기능만을 모아놓은 클래스
 * 이런 기능만으로 작성된 클래스를 서비스(Manage) 클래스라고 한다.
 * 
 * 이 클래스에서 다루는 기능들
 * - 모든 상품들의 maker를 출력
 * - 상품들의 총 구입액을 리턴하는 기능
 * - 특정 금액 이상이 되는 상품을 리턴하는 기능
 * - 특정회상 제품들을 리턴하는 기능
 * - 구입한 상품의 평균가를 리턴하는 기능
 * 
 * --> 기능의 Identifier 지정하는 방법도 함께
 */
public class ProductStoreService {

	// 모든 상품들의 maker 출력
	public void printProductMakers(Product[] products) {
		for (Product p : products) {
			System.out.println(p.getMaker());
		}
	}

	// 상품들의 총 구입액을 리턴
	public int getTotalPrice(Product[] products) {
		int sum = 0;
		for (Product p : products) {
			sum += p.getPrice() * p.getQuantity();
		}
		return sum;
	}

	// 특정 금액 이상이 되는 상품을 리턴하는 기능
	public Product[] getMorePrice(Product[] products, int price) {
		Product[] temp = new Product[products.length];
		int idx = 0;

		for (Product p : products) {
			if (p.getPrice() >= price) {
				temp[idx++] = p;
				// temp[idx] = p;
				// idx++;
			}
		}
		return temp;
	}

	// 특정회상 제품들을 리턴하는 기능
	public Product[] getCertainCompany(Product[] products, String company) {
		Product[] temp = new Product[products.length];
		int idx = 0;

		for (Product p : products) {
			if (p.getCompany().equals(company))
				temp[idx++] = p;
		}
		return temp;
	}

	// 구입한 상품의 평균가를 리턴하는 기능
	public int getAvgPrice(Product[] pros) {
		// 총 가격 구하기 -> 위에서 정의한 메소드 호출
		// 총 가격을 개수로 나눈다.
		return getTotalPrice(pros) / pros.length;
	}

}
