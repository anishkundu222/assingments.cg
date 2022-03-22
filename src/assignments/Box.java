package assignments;

public class Box {
	private float length;
	private float height;
	private float breadth;
	
	Box(Object o1){
		float [] sides = (float[])o1;
		this.length = sides[0];
		this.height = sides[1];
		this.breadth = sides[2];
	}
	public float volume() {
		return length*height*breadth;
	}
	public static void main(String[] args) {
		Box myBox = new Box(new float[] {20.4f,26.3f,18.5f});
		System.out.println(" Volume =  "+myBox.volume());
	}
	}



