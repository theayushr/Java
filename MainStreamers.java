class Streamers{

	String name, genere;
	double followers;

	Streamers(String name, String genere, double followers){
		this.name = name;
		this.genere = genere;
		this.followers = followers;
	}

	String famous(Streamers ob1, Streamers ob2, Streamers ob3){

		double f1 = ob1.followers;
		double f2 = ob2.followers;
		double f3 = ob3.followers;

		if(f1>f2 && f1>f3){
			return ob1.name;
		}
		else if(f2>f1 && f2>f3){
			return ob2.name;
		}
		else{
			return ob3.name;
		}
	}
}

class MainStreamers{
	public static void main(String[] args){
		Streamers one = new Streamers("Hikaru", "Chess", 1.6);
		Streamers two = new Streamers("Magnus", "Chess", 0.8);
		Streamers three = new Streamers("XQC", "Gaming", 10.4);

		System.out.println("The most famous Streamer is: " + two.famous(one, two, three));
	}
}