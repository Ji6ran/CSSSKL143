import java.awt.Graphics;

public class FractalFlake extends Shape {

	//instance variables needed for the program
	private final int limit; 
	private final int branches; 

	/**
	 * Default Constructor
	 * @param x
	 * @param y
	 * @param l
	 * @param b
	 */
	public FractalFlake(int x, int y, int l, int b){

		super(x,y);
		this.limit = l;
		this.branches = b;
	}

	/**
	 * This method will draw the shape
	 */
	public void draw(Graphics g) {//a redirect or facade
		draw(g,getX(), getY(),limit);
	}

	/**
	 * Overrloaded method that draws the shape
	 * @param g
	 * @param startX
	 * @param startY
	 * @param limit
	 */
	private void draw(Graphics g, int startX, int startY, int limit) {
		
		if(limit>= 3) { //base case is depth <3
			for ( int i = 0; i < this.branches; i++ ){
				int x2 = startX + (int) (limit *
						Math.cos( (2 * Math.PI / this.branches) * i ));
				int y2 = startY - (int) (limit *
						Math.sin( (2 * Math.PI / this.branches) * i ));
				g.drawLine( startX, startY, x2, y2 ); //does a branch
				draw(g, x2, y2, limit/3); //recursive call
			}
		}
	}
	
}
