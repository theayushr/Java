class property{
	String color;
	String type;

	void write(){
		System.out.println("Writing Something");
	}
	void color(){
		System.out.println(color);
	}
}

class pen{
	public static void main(String[] args){
		property pen1 = new property();
		pen1.color = "blue";
		pen1.type = "gel";


		property pen2 = new property();
		pen2.color = "yellow";
		pen2.type = "dot";

		pen1.write();
		pen1.color();
		pen2.color();
	}
}