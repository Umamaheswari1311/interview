package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {
		String str="Abc";
	str=str.toLowerCase().replace(" ","");
	
	String [] arr=str.split("");
	HashSet<String> set=new HashSet<String>(Arrays.asList(arr));
	
  String [] allAlphabet="abcdefghijklmnopqrstuvwxyz".split("");
  HashSet<String> set1=new HashSet<String>(Arrays.asList(allAlphabet));
  
  set1.removeAll(set);
  System.out.println(set1);
	}

}
