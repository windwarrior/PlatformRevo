package playertypes;

public class HumanPlayer implements Player {
	private float X;
	private float Y;
	
	
	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return X;
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return Y;
	}

	@Override
	public void setX(float X) {
		this.X = X;
	}

	@Override
	public void setY(float Y) {
		this.Y = Y;
	}
}
