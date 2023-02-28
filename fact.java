class factorial{
	int num;
	factorial(int num){
		this.num = num;
	}

	int calculations(){
		int multi =1; 
		for(int i=2; i<=num; i++ ){
			multi = i * multi;
		}
		return multi;
	}
}

class fact{
	public static void main(String[] args){

		factorial obj = new factorial(6);
		System.out.println("The Factorial is: " + obj.calculations());
	}
}