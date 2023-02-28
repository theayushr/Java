import java.util.Scanner;

class Square{

	public static int square(int num){
		return num*num;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		//since scanner is a class in itself which is obviously predefined, we first need to make an object
		// and then using that object call the method nextInt which takes the input...
		//the process is little complicated than other languages as there is simple command cin >> to take the input
		//but since java is a completely oops based programming language it is how things are here.

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sq = square(num);
		System.out.println("The Square of " + num + " is : " + sq);
	}
}