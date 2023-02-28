class Clone{
	int len, bre, hei;
	
	Clone(int x, int y, int z){
		len = x;
		bre = y;
		hei = z;
	}

	Clone(int x, int y){
		len = x;
		bre = y;
		hei = 0;
	}

	Clone (int x){
		len = x;
		bre = x;
		hei = x;
	}

	Clone(Clone obj){
		len = obj.len;
		bre = obj.bre;
		hei = obj.hei;
	}

	int vol(){
		if(hei != 0) return len*bre*hei;
		return len*bre;
	}
}
class ObjAsParameters{

	public static void main(String [] args){

		Clone cuboid = new Clone(12, 23, 14);
		Clone rect = new Clone(30,40);
		Clone cube = new Clone(24);

		Clone cuboid2 = new Clone(cuboid);
		Clone rect2 = new Clone(rect);
		Clone cube2 = new Clone(cube);

		System.out.print("Your new cuboid's dimensions are: ");
		System.out.println(cuboid2.len + " " + cuboid2.bre+ " " + cuboid2.hei);

		System.out.print("Your new Rectangle's dimensions are: ");
		System.out.println(rect2.len + " " + rect2.bre);

		System.out.print("Your new Cube's dimensions are: ");
		System.out.println(cube2.len);

		int rectVol = rect.vol();
		int cuboidVol = cuboid.vol();
		int cubeVol = cube.vol();

		System.out.println("The Area of Rectangle is : " + rectVol);
		System.out.println("The Volume of Cuboid is : " + cuboidVol);
		System.out.println("The Volume of Cube is : " + cubeVol);

	}
}