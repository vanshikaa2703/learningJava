package employee;

public class StringQuestion {
	
	public static String reverseString(String str) {
		System.out.println(str);
		String ans = "";
		int i = str.length() - 1;
		while (i >= 0) {
			ans = ans + str.charAt(i);
			i--;
		}

		return ans;
	}
	
	public boolean palindrome(String str) {
		str.toLowerCase();
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public String longestWord(String str) {
		String ans = "";
		
		String words[] = str.split("\\s+");
		
		for(String word : words) {
			if(word.length() > ans.length()) {
				ans = word;
			}
		}
		
		return ans;
	}
	
	public String reverseWords(String str) {
		String ans = "";
		
		String words[] = str.split("\\s+");
		
		for(String word : words) {
			word = reverseString(word);
			ans = ans + word + " ";
		}
		
		return ans;
	}

	public static void main(String[] args) {
		StringQuestion obj  = new StringQuestion();
		
		System.out.println(reverseString("vanshika"));
		
		if(obj.palindrome("madam") == true) {
			System.out.println("madam is palindrome");
		}else {
			System.out.println("madam is not palindrome");
		}
		
		System.out.println(obj.longestWord("My name is vanshika"));
		
		System.out.println(obj.reverseWords("Vanshika Gupta"));
	}

}
