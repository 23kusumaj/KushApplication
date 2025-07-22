package wipro_java;

public class Shape {
	    void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Square extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing a square");
	    }
	}

	class Rectangle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing a rectangle");
	    }
	}


