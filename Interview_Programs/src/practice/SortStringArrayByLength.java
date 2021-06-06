package practice;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayByLength {

	public static void main(String[] args) {
		String s ="This is new";   
	      String[] word=s.split(" ");
	          Arrays.sort(word,Comparator.comparingInt(String::length));
	          
	          System.out.println(Arrays.toString(word));
	       }
	    }