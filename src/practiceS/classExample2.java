package practiceS;

class MyPoint {
    private int x;
    private int y;
    
    public void setX(int x) {
    		this.x = x;
    }
    public void setY(int y) {
		this.y = y;
    }
    
    public int getX() {
    		return this.x;
    }
    public int getY() {
		return this.y;
}
}


public class classExample2 {

	public static void main(String[] args) {
		MyPoint mp = new MyPoint();
		mp.setX(3);
		mp.setY(4);
		
		System.out.println(mp.getX() * mp.getY());
			}

}