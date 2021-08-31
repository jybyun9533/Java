package com.encore.test;

public class SwitchNoBreakTest3 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;

		System.out.println("[현재시간 : " + time + " 시]");

		switch (time) {

		case 8:
			System.out.println("출근 준비");
		case 9:
			System.out.println("회사 도착, 오전 회의");
		case 10:
			System.out.println("오전 업무");
		case 11:
			System.out.println("외근");
		}
	}

}
