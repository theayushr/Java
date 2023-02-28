class yog{
	int num1, num2, num3;

		//the constructor
		yog(int a, int b){
			num1 = a;
			num2 = b;
			num3 = 0;
		}

		//constructor overloading
		yog(int a, int b, int c){
			num1 = a;
			num2 = b;
			num3 = c;
		}

		int calculations(){
			return num1 + num2 + num3;
		}

}

class sum{
	public static void main(String[] args){

		yog obj = new yog(12, 21);
		yog obj2 = new yog(12, 21, 10);

		System.out.println("The sum of two nums is : " + obj.calculations());
		System.out.println("The sum of three nums is : " + obj2.calculations());
	}
}