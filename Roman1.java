class MUJ{
	int regNo, mobile;
	double cgpa;
	String name, course;

	MUJ(int regNo, String name){
		this.regNo = regNo;
		this.name = name;
	}

	void details(double cgpa, String course, int mobile){
		this.cgpa = cgpa;
		this.course = course;
		this.mobile = mobile;
	}

	void display(){
		System.out.println(name +" "+ regNo +" "+ course +" "+ cgpa +" "+ mobile);
	}
}

class Roman1{
	public static void main(String [] args){

		MUJ obj = new MUJ(221020075, "Ayush");
		obj.details(9.8, "MCA", 6398);

		obj.display();

	}
}