import java.util.Scanner;
class Area{
    public static void main(String args[]){
	Rectangle rect  =  new Rectangle();
	Scanner scanner  = new Scanner(System.in);
	System.out.print("Enter length of rectangle: ");
	rect.length = scanner.nextInt();
	System.out.print("Enter breadth of rectangle: ");
	rect.breadth = scanner.nextInt();
	int rectArea;
	rectArea = rect.calcArea(rect.length, rect.breadth);
	
	Circle c = new Circle();
	System.out.print("Enter radius of circle: ");
	c.radius = scanner.nextInt();
	float areaCircle = c.getArea(c.radius);

	System.out.println("Area of the rectangle is " + rectArea);
	System.out.println("Area of the circle is " + areaCircle);

    }
}

class Triangle{
    int base;
    int height;
    void getBase(int k){ base = k; }
    void getHeight(int h) { height = h; }
    float calcArea(int base, int height){ return base * height / 2; }
}

class Rectangle{
    int length;
    int breadth;
    void getLength(int l){ length = l; }
    void getBreadth(int b) { breadth = b; }
    int calcArea(int length, int breadth){ return length * breadth; }
}

class Circle{
    static final float PI = 3.1415F;
    int radius;
    void getRadius(int r) { radius = r; }
    float getArea(int radius) { return PI * radius * radius; }
}

