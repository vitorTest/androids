import java.util.Scanner;

class PangramIdentifier{
	public static void main(String args[]){

		PangramIdentifier myPangram = new PangramIdentifier();
		Scanner input = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Write your phrase:");
		String phrase = input.next();
		input.close();

		myPangram.isItApangram(phrase);

		System.out.println("Congratulations you have a Pangram!!!");
	}

	public void isItApangram(String phrase){
		char[] alphabet = alphabetGenerator();
		phrase = phrase.toLowerCase();
		int iNeedToRun = 0;

		for(int i = 0; i < alphabet.length; i++){
			
			for(int j = 0; j < phrase.length(); j++){
				iNeedToRun = j;
				if(alphabet[i] == phrase.charAt(j)){
					break;
				}
			}

			if((iNeedToRun + 1) >= phrase.length()){
				if(alphabet[i] != phrase.charAt(iNeedToRun)){
					System.out.println("There's no letter " + alphabet[i]);
					System.exit(0);		
				}		
			}
		}
	}

	public char[] alphabetGenerator(){
		char[] alpha = new char[26];

		for(int i = 0; i < 26; i++){

			alpha[i] = (char)(97 + i);
		}

		return alpha;
	}
}