package Day11;

//class Task implements Runnable {
//	  @Override
//	  public void run() {
//	      System.out.println("Running");
//	  }
//	}
//
//	class Task4 {
//	  public static void main(String args[]) {
//	    Runnable r = new Task();
//	    Thread thread = new Thread(r);
//	    thread.start();
//	  }
//	}
	
	
//	class Task4 {
//		  public static void main(String args[]) {
//		    Runnable r = new Runnable() {
//		      @Override
//		      public void run() {
//		          System.out.println("Running");
//		      }
//		    };
//		    Thread thread = new Thread(r);
//		    thread.start();
//		  }
//		}
	
	
	class Task4 {
		  public static void main(String args[]) {
		    Runnable r = () -> System.out.println("Running");
		    Thread thread = new Thread(r);
		    thread.start();
		  }
		}