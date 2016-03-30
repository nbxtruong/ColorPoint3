import java.awt.Color;

public class ColorPoint {
	private Color color;
	private Point point;

	public ColorPoint(int x, int y, Color color) {
		point = new Point(x, y);
		this.color = color;
	}

	// Returns the point-view of this color point. 
	public Point asPoint() {
		return point;
	}
	
	public Color getColor() {
		return color;
	}

	public int getX() {
		return point.getX();
	}

	public int getY() {
		return point.getY();
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color == color;
	}
}
