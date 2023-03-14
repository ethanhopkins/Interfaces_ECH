/**
* This is the application class for the Task and Process classes. It allows each
* of their respective methods to be tested.
*
* @author Ethan Hopkins
* @version 1.0
* Application class
* Spring Semester/Freshman Year
*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RationalNumber r1 = new RationalNumber(17, 8);
        RationalNumber r2 = new RationalNumber(2, 1);
        
        r1.compareTo(r2);
        
        
        Task t1 = new Task("Clean dishes");
        t1.setPriority(5);
        Task t2 = new Task("Take out trash");
        t2.setPriority(10);
        
        t1.Status();
        t1.compareTo(t2);
        
        
        Process p1 = new Process("741");
        p1.setPriority(5);
        Process p2 = new Process("889");
        p2.setPriority(5);
        
        p1.compareTo(p2);
	}

}
