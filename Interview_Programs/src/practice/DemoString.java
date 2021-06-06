package practice;

public class DemoString {
	public static void main(String[] args) {
		
		
///Literal
		
		String s1="Anju";
		String s2="Anju";
		System.out.println(s1 +" "+s2);
	
	//newKeyword
		String s3=new String("Anu");
		String s4=new String("Anu");
	System.out.println(s1 +" "+s2);
	
	
		//Immutable
		String name="Chandra";
		System.out.println(name.concat("Priya"));
	 System.out.println(name);
	 String text=" face book is bad for boys and girls ";
	 System.out.println("Character at 0th position: "+text.charAt(1));	    
	 System.out.println(text.indexOf('b'));	 
	 System.out.println(text.indexOf('b',text.indexOf('b')+1));	
	int index= text.indexOf('b',text.indexOf('b')+1);
	
	 System.out.println(text.indexOf('b',index));
	 System.out.println(s1.length());
     System.out.println(s1.contains("j"));		
	 System.out.println(text.equals(s1));
	 System.out.println(text.equalsIgnoreCase(text.toUpperCase()));	
	System.out.println(text.trim());
	System.out.println(text.replace(" ",""));
	
    text=" face book ";
	System.out.println("Leading :"+text.replaceAll("^[ \t]", ""));
	text=" face book ";
	System.out.println("Trailing:"+text.replaceAll("[ \t]$", ""));
	text=" face book ";
	System.out.println("Leading and Trailing:"+text.replaceAll("^[ \t]+|[ \t]$", ""));

	text=" face book ";
	System.out.println("Leading:"+text.stripLeading());
	text=" face book ";
	System.out.println("Trailing:"+text.stripTrailing());
	text=" face book ";
	System.out.println("Leading and Trailing:"+text.strip());
	
	
	System.out.println(text.substring(1,5).replace("face", "book")+text.substring(6,10).replace("book", "face"));	
	System.out.println(text.substring(6));
	
	System.out.println(String.join("/","08","Oct","2020"));
	
	
	String s="Daily SME Connect";
	String [] words=s.split(" ");
	for(String print : words)
	{
		System.out.println(print);
	}
	
	
	char[] ch=text.toCharArray();
	
	System.out.println(ch.toString());
	
	
	//mutable
	
	//Thread safe and synchornized,Multithread is not possible
	StringBuffer str=new StringBuffer("Chandra");
	System.out.println(str.append("Priya"));
	System.out.println(str);
	System.out.println(str.replace(0,7,"Anusha"));
	System.out.println(str.delete(0,6));
	System.out.println(str.insert(0,"Chandra"));
	System.out.println(str.reverse());
	
	//Not Thread safe,Not Synchornized and Faster manipulation
	StringBuilder strVal=new StringBuilder("Priya");
	System.out.println(str.append("Anusha"));
	System.out.println(str);
	
	}
	
	
	
	

}
