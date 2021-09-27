package test;

class Parent {
	/*
	 * void show() { System.out.println("Parent"); }
	 */
	public Parent() {
		System.out.println("Parent 持失切");
	}
}

class Child extends Parent{
	/*
	 * void show() { System.out.println("Child"); }
	 */
	public Child() {
		System.out.println("Child 持失切");
	}
}

public class Main{
	public static void main(String[] args) {
		Parent pa = new Child();
	}
}
