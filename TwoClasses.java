class Akku{
	int stdR,cgpa;
	String name;

	Akku(int stdR, String name, int cgpa){
		this.stdR = stdR;
		this.name = name;
		this.cgpa = cgpa;
	}
}

class Aanchu{
	int stdR,cgpa;
	String name;

	Aanchu(int stdR, String name, int cgpa){
		this.stdR = stdR;
		this.name = name;
		this.cgpa = cgpa;
	}
}

class TwoClasses{
	public static void main(String[] args){

		Akku ob1 = new Akku(8, "Akriti Rawat", 9);
		Aanchu ob2 = new Aanchu(1, "Aanchal Rawat", 10);

		System.out.println(ob1.stdR +" "+ ob1.name +" "+ ob1.cgpa);		
		System.out.println(ob2.stdR +" "+ ob2.name +" "+ ob2.cgpa);
	}
}