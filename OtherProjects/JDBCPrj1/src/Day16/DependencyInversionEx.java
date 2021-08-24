package Day16;

//class Restaurant {
//	Tea T;
//
//	Restaurant() {
//		T = new Tea();
//	}
//
//	public void serve() {
//		T.served();
//	}
//
//}
//
//class Tea {
//	public void served() {
//		System.out.println("Tea is served");
//	}
//}
//
//public class DependencyInversionEx {
//	public static void main(String[] args) {
//     in this prg, restaurant is dependent on tea class
//		Restaurant r = new Restaurant();
//		r.serve();
//
//	}
//}


class Restaurant {
	iHotDrink HD;
	void order(iHotDrink h)
	{
		HD=h;
	}
	public void serve() {
		HD.served();
	}
}
interface iHotDrink{
	 void served();
}
class Tea implements iHotDrink {
	public void served() {
		System.out.println("Tea is served");
	}
}
class Coffee implements iHotDrink {
	public void served() {
		System.out.println("Coffee is served");
	}
}

		
public class DependencyInversionEx {
	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		// here, restaurant class is not dependent on tea or coffee class. Here, iHotDrink is the 
		// interface to tea and coffee. By use of this interface, we have removed the dependecny.
		// we can add more items in the restaurant so, these item class have to implement the iHotDrink
		// interface to be served in the restaurant.
		r.order(new Tea());
		r.serve();
		r.order(new Coffee());
		r.serve();
	}
}