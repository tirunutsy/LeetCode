package medium;
import java.util.*;

//        Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
//
//		Note that the same word in the dictionary may be reused multiple times in the segmentation.		 
//
//		Example 1:
//		Input: s = "leetcode", wordDict = ["leet","code"]
//		Output: true
//		Explanation: Return true because "leetcode" can be segmented as "leet code".
//		
//		Example 2:
//		Input: s = "applepenapple", wordDict = ["apple","pen"]
//		Output: true
//		Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//		Note that you are allowed to reuse a dictionary word.
//		
//		Example 3:
//		Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//		Output: false

public class WordBreak {
	
	public boolean word_Break(String s, List<String> wordDict) {
//		Converting list to set so that we can get unique elements also faster traverse
		Set<String> wordSet = new HashSet<>(wordDict);
//		Crate new boolean array to mark visited substring as true
		boolean[] visited = new boolean[(s.length()+1)];
		visited[0] = true;
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<i; j++) {
				if(visited[j] && wordSet.contains(s.substring(j, i))) {
					visited[i]=true;
					break;
				}
			}
		}
		return visited[s.length()];
	}
		
	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		String s1 = "applepenapple";
		List<String> wordDict1 = new ArrayList<String>() {{ 
			add("apple");
			add("pen");
		}};
		String s2 = "catsandog";
		List<String> wordDict2 = new ArrayList<String>() {{ 
			add("cats");
			add("dog");
			add("sand");
			add("and");
			add("cat");
		}};
		WordBreak obj = new WordBreak();
		boolean output = obj.word_Break(s1, wordDict1);
		System.out.println(output);
	}
}
