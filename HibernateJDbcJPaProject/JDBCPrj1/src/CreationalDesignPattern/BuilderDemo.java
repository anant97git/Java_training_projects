package CreationalDesignPattern;

import java.util.ArrayList;  
import java.util.List; 

 interface Packing {  
    public String pack();  
    public int price();  
}  

//2) Create 2 abstract classes CD and Company
//Create an abstract class CD which will implement Packing interface.

//File: CD.java

 abstract class CD implements Packing{  
public abstract String pack();  
}

//File: Company.java
 abstract class Company extends CD{  
public abstract int price();  
}

//3) Create 2 implementation classes of Company: Sony and Samsung
//File: Sony.java
 class Sony extends Company{  
@Override  
public int price(){   
                return 20;  
}  
@Override  
public String pack(){  
     return "Sony CD";  
}         
}//End of the Sony class.  
//File: Samsung.java

 class Samsung extends Company {  
@Override  
public int price(){   
                return 15;  
}  
@Override  
public String pack(){  
     return "Samsung CD";  
}         
}//End of the Samsung class.  
//4) Create the CDType class
//File: CDType.java
 
 class CDType {  
     private List<Packing> items=new ArrayList<Packing>();  
     public void addItem(Packing packs) {    
            items.add(packs);  
     }  
     public void getCost(){  
      for (Packing packs : items) {  
                packs.price();  
      }   
     }  
     public void showItems(){  
      for (Packing packing : items){  
     System.out.print("CD name : "+packing.pack());  
     System.out.println(", Price : "+packing.price());  
  }       
    }     
}//End of the CDType class.  
//5) Create the CDBuilder class

//File: CDBuilder.java
 class CDBuilder {  
          public CDType buildSonyCD(){   
             CDType cds=new CDType();  
             cds.addItem(new Sony());  
             return cds;  
      }  
      public CDType buildSamsungCD(){  
     CDType cds=new CDType();  
     cds.addItem(new Samsung());  
     return cds;  
      }  
}// End of the CDBuilder class.  
//6) Create the BuilderDemo class
//File: BuilderDemo.java

public class BuilderDemo{  
public static void main(String args[]){  
CDBuilder cdBuilder=new CDBuilder();  
CDType cdType1=cdBuilder.buildSonyCD();  
cdType1.showItems();  

CDType cdType2=cdBuilder.buildSamsungCD();  
cdType2.showItems();  
}  
}  
