class Mammals{
	public void hand_bones() {
		System.out.println("Not sure who ; Does something");
	}
}

class Humans extends Mammals{
	public void hand_bones() {
		System.out.println("Humans : does lot of work");
	}
}

class Bats extends Mammals{
	public void hand_bones() {
		System.out.println("Bats : flying work");
	}
}


class Framework{
	public void work(Mammals m) {
		m.hand_bones();
	}
}

public class Prj6Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Framework f = new Framework();
		
		Mammals m1 = new Mammals();
		f.work(m1);
		//m1.hand_bones(); // not sure of type
		
		Mammals m2 = new Humans();
		f.work(m2);
		//m2.hand_bones(); // not flying away, does work
		
		Mammals m3 = new Bats();
		f.work(m3);
		//m3.hand_bones(); 
	}

}
