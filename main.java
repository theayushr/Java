class sum{

	int num1, num2;
	sum(int a, int b){
		num1 = a;
		num2 = b;
	}

	int cal(){
		return num1 + num2;
	}
	
}
class main{
	public static void main(String args[]){

		sum ob = new sum(12, 21);

		System.out.println("the sum is : " + ob.cal());

	}
}