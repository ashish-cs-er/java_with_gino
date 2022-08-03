package section5_classes_objects;

class Rectangle{
	int length;
	int breadth;
	
	public void setData(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int findArea() {
		int area = this.length*this.breadth;
		return area;
	}
	
}
public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.setData(20,40);
		System.out.println("Area of rectangle is: "+rect.findArea());
	}

}
