package Chapter06;

public class MovablePoint extends Point {
	private int xSpeed,ySpeed;

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
}
