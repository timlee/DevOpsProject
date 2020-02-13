package main;

public class EclemmaDemo {

//check if the type of a triangle with three edges a, b and c
	public String check(int a, int b, int c) {
		boolean c1, c2, c3;
		c1 = a + b > c;
		c2 = b + c > a;
		c3 = a + c > b;
		if (c1 && c2 && c3) {
			if (a == b && b == c) {
				return "Regular";
			} else if (a == b || b == c || c == a) {
				return "Isosceles";
			} else return "Triangle";
		}
		return "NotTriangle";
	}
}

