import java.awt.Color;

public class Test {
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		ColorPoint cp1 = new ColorPoint(10,10,Color.BLUE);
		ColorPoint cp2 = new ColorPoint(10, 10, Color.BLUE);
		System.out.println(cp1.equals(p));
		System.out.println(cp1.asPoint().equals(p));
		System.out.println(cp1.equals(cp2));		
	}
}
