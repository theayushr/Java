/*

let's say we have five participants in an election 
and we need to print how many votes have been given to the partcipants and the total votes. 

*/

class Vote{

	static int count;
	int ayush, jatin, shraddha, tanya, magnus;

	void voting(int v){

		switch(v){

			case 1:
				ayush++;
				count++;
				break;

			case 2:
				jatin++;
				count++;
				break;

			case 3:
				shraddha++;
				count++;
				break;

			case 4:
				tanya++;
				count++;
				break;

			case 5:
				magnus++;
				count++;
				break;

			default:
				count++;
		}
	}

	void winner(){
		System.out.println("1- Ayush: " + ayush);
		System.out.println("2- Jatin: " + jatin);
		System.out.println("3- Shraddha: " + shraddha);
		System.out.println("4- Tanya: " + tanya);
		System.out.println("5- Magnus: " + magnus);
	}
}

class MainVote{

	public static void main(String[] args){

		Vote obj = new Vote();

		for(int i=0; i<args.length; i++){
			int youtvote = Integer.parseInt(args[i]);

			obj.voting(youtvote);
		}

		obj.winner();
		System.out.println("Total Votes: " + Vote.count);

	}
}