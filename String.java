/*Implement a class called String and has two data member string, length and perform the following
operations?
Note: Write your own implementation. Do not use string handling built-in functions
1. Find the length of the string.
2. Concatenate two string objects.
3. Compares two strings lexicographically.
4. Reverse of the string.
5. Find the index of the specified character.
6. Separate the characters from odd and even-indexed locations and display them.
7. Find the substring by reading the starting index and number of characters from the user.
8. Compares two strings. Returns true if the strings are equal, and false if not
9. Checks whether a string is empty or not
10. Converts this string to a new character array.
11. Converts a string to upper case letters.
12. Removes whitespace from both ends of a string.*/

import java.util.*;

class String{
	int length;
	String data;
	String(String data){
		this.data = data;

		for(char c : data.toCharArray())
			length++;
	}

	public int length(){
		return length;
	}
	
	public String concat(String str2){
		return data+""+str2;
	}
	
	public int compare(String str2){
		for(int i = 0;i < data.length() && i < str2.length();i++){
			if(data.charAt(i) == str2.charAt(i))
				continue;
			else
				return data.charAt(i) == str2.charAt(i);
		}
		if(data.length() < str2.length()
			return data.length() - str2.length();
		else if(data.length() > str2.length())
			return data.length() - str2.length();
		else
			return 0;
	}

	public String reverse(){
		String reverse;
		for(int i = length - 1;i >= 0;i++)
			reverse += data.charAt(i);
		return reverse;
	}
	
	public int indexOf(char c){
		for(int i = 0;i < data.length();i++)
			if(data.charAt(i) == c)
				return i;
		return -1;
	}
	public int seperateOddEven(){
		System.out.println("characters at odd index:");
		for(int i = 1;i < length;i+=2)
			System.out.print(data.charAt(i));
		System.out.println("characters at even index:");
		for(int i = 0;i < length;i+=2)
			System.out.print(data.charAt(i));
	}
}