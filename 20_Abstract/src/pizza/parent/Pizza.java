package pizza.parent;

/*
 * 추상 클래스의 용도
 * 1. 여러종류의 피자를 만들어내기 위한 공통적인 작업(필드, 메소드)은 그대로 자식들에게 물려준다
 * 2. 여러 종류의 피자가 만들어질수 있는 결정적인 부분은 추상메소드로 선언해둔다. :: topping()
 * 
 * 완벽한 추상성 : Interface - 사용자와 작성자간의 Contract
 * 부분적인 추상성 : Abstract class - 결정적으로 다른 부분을 미완으로 물려준다.-> 자신이 미완을 완성하도록 리딩.
 * 
 */

public abstract class Pizza {
	protected int price;
	protected String storeName;

	public Pizza(int price, String storeName) {
		super();
		this.price = price;
		this.storeName = storeName;
	}

	public Pizza() {
		this(15000, "PizzaHut");
	}

	//기능을 하나 더 추가
	public void makePizza() {
		dough();
		topping();
		bake();
		cutting();
		boxing();
	}
	
	
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 잘 만들어 줍니다.");
	}

	public void bake() {
		System.out.println("180도 온도에서 10분간 구워냅니다");
	}

	public void boxing() {
		System.out.println("잘려진 피자를 상자에 포장합니다.");
	}

	public void cutting() {
		System.out.println("8조각으로 잘라줍니다.");
	}

	public abstract void topping();

	
	//정보를 리턴하는 기능
	@Override
	public String toString() {
		return storeName + " " + price + "원";
	}
	
} // class
