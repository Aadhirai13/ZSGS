package assignments;

class Animal {
	String color;
	int weight;
	
	Animal(String clr , int wgt) {
		color = clr;
		weight = wgt;
		System.out.println("Color - " + color + " , Weight - " + weight + " kg");
	}
	
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animal {
	
	Cat(String clr , int wgt) {
		super(clr,wgt);
	}
	
	void sound() {
		System.out.println("cats meows");
	}
}

class Dog extends Animal {
	Dog(String clr , int wgt) {
	super(clr,wgt);
}
	
	void sound() {
		System.out.println("Dogs barks");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Cat("white",10);
		obj.sound();
		Animal obj1 = new Dog("Black",14);
		obj1.sound();
	}

}
