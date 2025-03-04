package medium;
import java.util.*;

//You are given an array of unique strings words where words[i] is six letters long. One word of words was chosen as a secret word.
//
//You are also given the helper object Master. You may call Master.guess(word) where word is a six-letter-long string, and it must be from words. Master.guess(word) returns:
//
//-1 if word is not from words, or
//an integer representing the number of exact matches (value and position) of your guess to the secret word.

public class Word_Guess {
	
//	 Helper function to find the length of the guessed word
	
	public static void findSecretWord(String[] words, String secret, int allowGuesses) {
//		create Random class variable
		Random rand = new Random();
		
		for(int i=0; i<allowGuesses; i++) {
			String guess = words[rand.nextInt(words.length)];
			int matches = findMatches(guess, secret);
//			print guess and matched statements
			System.out.println("Your Guess : "+guess+" Matched letters : "+matches);
			if(matches == 6) {
				System.out.println("Congrats! You Guessed correct word");
				return;
			}
//			Create String List to add guessed word 
			List<String> newWords = new ArrayList<>();
			for(String word : words) {
				if(findMatches(word, guess) == matches) {
					newWords.add(word);
				}
			}
			words = newWords.toArray(new String[0]);
		}
		System.out.println("Either you took too many guesses, or you did not find the secret word");
	}

	public static int findMatches(String word1, String word2) {
		int matches = 0;
		for(int i=0; i<6; i++) {
			if(word1.charAt(i)==word2.charAt(i)) {
				matches++;
			}
		}
		return matches;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"hamada","khaled"};
        String secret = "khaled";
        int allowGuesses = 10;
        
        findSecretWord(words, secret, allowGuesses);
	}

}
