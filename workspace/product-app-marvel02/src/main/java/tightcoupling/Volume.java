package tightcoupling;

class Volume {

	public static void main(String args[]) {

		Cylinder b = new Cylinder(25, 25, 25);
		b.volume = b.volume + 10;
		System.out.println(b.volume);

	}
}

class Cylinder {

	private int volume;

	Cylinder(int length, int width, int height) {

		this.volume = length * width * height;
	}
	
	//20 methods
}