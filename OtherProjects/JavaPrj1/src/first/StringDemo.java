package first;

//public class StringDemo {
//	   public static void main(String args[]) {
//	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
//	      String helloString = new String(helloArray);  
//	      System.out.println( helloString );
//	   }
//	}

//public class StringDemo {
//	   public static void main(String args[]) {
//	      String palindrome = "Dot saw I was Tod";
//	      int len = palindrome.length();
//	      System.out.println( "String Length is : " + len );
//	   }
//	}

//public class StringDemo{
//public static void main(String args[]){
//char[] helloArray = {'H', 'e', 'l', 'l', 'o'};
//String s = new String(helloArray);
//System.out.println(s);//Hello
//System.out.println(s.toUpperCase());//HELLO  
//System.out.println(s.toLowerCase());//hello  
//System.out.println(s);//Hello(no change in original) 
//s="  Sachin  ";  
//System.out.println(s);//  Sachin    
//System.out.println(s.trim());//Sachin
//s="Sachin";  
//System.out.println(s.startsWith("Sa"));//true  
//System.out.println(s.endsWith("n"));//true  
//System.out.println(s.charAt(0));//S  
//System.out.println(s.length());//6  
//int a=10;  
//s=String.valueOf(a);  
//System.out.println(s+10); 
//}
//}


//class StringDemo{  
//public static void main(String args[]){  
//StringBuilder sb=new StringBuilder("Hello ");  
//sb.append("Java");//now original string is changed  
//System.out.println(sb);//prints Hello Java for sb=“Hello” 
//sb.insert(1,"Java");//now original string is changed  
//System.out.println(sb);//prints HJavaello for sb=“Hello”
//sb.replace(1,3,"Java");  
//System.out.println(sb);//prints HJavalo for sb=“Hello”
//sb.delete(1,3);  
//System.out.println(sb);//prints Hlo for sb=“Hello”
//sb.reverse();  
//System.out.println(sb);//prints olleH for sb=“Hello”
//}  
//}  


class StringDemo{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java for sb=“Hello” 
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello for sb=“Hello”
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo for sb=“Hello”
sb.delete(1,3);  
System.out.println(sb);//prints Hlo for sb=“Hello”
sb.reverse();  
System.out.println(sb);//prints olleH for sb=“Hello”
}  
}  