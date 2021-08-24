package second;

import java.util.Stack;

public class BracketStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "“import java.util.*;  \r\n" + 
				"class JavaExample{  \r\n" + 
				"  public static void main(String args[]){  \r\n" + 
				"     ArrayList<String> alist=new ArrayList<String>();  \r\n" + 
				"     alist.add(\"Gregor Clegane\");  \r\n" + 
				"     alist.add(\"Khal Drogo\");  \r\n" + 
				"    //iterating ArrayList\r\n" + 
				"     for(String str:alist)  \r\n" + 
				"        System.out.println(str);  \r\n" + 
				"     }  \r\n" + 
				"}”\r\n";
		
		Stack<String> cbs = new Stack<String>();
		Stack<String> cbe = new Stack<String>();
		Stack<String> pbs = new Stack<String>();
		Stack<String> pbe = new Stack<String>();
		Stack<String> sbs = new Stack<String>();
		Stack<String> sbe = new Stack<String>();
		
		int len = str.length();
		
		for (int i=0;i<len;i++)
		{
			if (str.charAt(i) == '{')
				cbs.add("{");
			else if (str.charAt(i)=='}')
				cbe.add("}");
			else if (str.charAt(i)=='(')
				pbs.add("(");
			else if (str.charAt(i)==')')
				pbe.add(")");
			else if (str.charAt(i)=='[')
				sbs.add("[");
			else if (str.charAt(i)==']')
				sbe.add("]");
		}
		
		if (cbs.size() == cbe.size() && pbs.size() == pbe.size() && sbs.size() == sbe.size() )
			System.out.println(" Compiled successfully");
		else
			System.out.println(" not compiled successfully");
		
	}

}
