package first;

//class LoopDemo {
//public static void main(String[] args){
//  for(int count = 1; count < 11; count++)
//     System.out.println("Count is: " + count); 
//  }
//}


//class LoopDemo {
//public static void main(String[] args){
//int count = 1;
//while (count < 11) {
//System.out.println("Count is: " + count); count++;
//}
//}
//}

//
//class LoopDemo {
//        public static void main(String[] args){
//int count = 1;
//do { System.out.println("Count is: " + count); count++; } while (count <=11);
//}
//}


//class Main { 
//    public static void main(String args[])     { 
//    first: // First label 
//        for (int i = 0; i < 3; i++) { 
//          second: 		// Second label 
//            for (int j = 0; j < 3; j++) { 
//                if (i == 1 && j == 1) { 
//                      // Using continue statement with label 
//                    continue first; 
//                } 
//                if(j == 2)
//  		 continue;     //continue to next iteration
//                System.out.println(i + " " + j); 
//      
// } 
//        } 
//    } 
//}

//class Main { 
//    public static void main(String args[])     { 
//    first: // First label 
//        for (int i = 0; i < 3; i++) { 
//          second: 		// Second label 
//            for (int j = 0; j < 3; j++) { 
//                if (i == 1 && j == 1) { 
//                      // Using break statement with label 
//                    break first; 
//                } 
//                if(j == 2)
//  		 break;     //break from loop
//                System.out.println(i + " " + j); 
//            } 
//        }
//    }
//}


class LoopDemo{
	public static void main(String[] args)
	{
		char[] copyFrom={'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		char[] copyTo=new char[7];
		System.arraycopy(copyFrom,2,copyTo,0,7);
		System.out.println(new String(copyTo));
	}
}