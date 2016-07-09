class Point {
	private int x;
	private int y;
	 Point(int x, int y){
		if(x<0)
			this.x = 0;
		if(x>100)
			this.x = 100;
		else
			this.x = x;
		
		if(y<0)
			this.y = 0;
		if(y>100)
			this.y = 100;
		else
			this.y = y;
	}
	 public String toString(){
		return "("+this.x + "," + this.y + ")";
	}
	public void move(int xMove, int yMove){
		x += xMove;
		if(x<0)
			x = 0;
		if(x>100)
			x = 100;
		
		y += yMove;
		if(y<0)
			y = 0;
		if(y>100)
			y = 100;
	}
}
			
	
