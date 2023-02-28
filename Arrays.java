import java.util.Scanner;

class Arrays{

	public static int square(int num){
		return num*num;
	}

	public static void main(String[] args){
		
		/*
		int[] arr = new int[10];
		for(int i=0; i<10; i++){
			arr[i] = i+1;
		}
		for(int i=0; i<10; i++){
			System.out.println(arr[i]);
		}
		*/

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The Square of " + num + " is : " + square(num));


}
}