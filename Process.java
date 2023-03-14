/**
* This class allows for two processes to be created and compared to one another
* based on their given priority.
*
* @author Ethan Hopkins
* @version 1.0
* Process class
* Spring Semester/Freshman Year
*/

public class Process implements Priority, Comparable<Process>{
	private String processID;
	private int priority;
	
	/**
	 * default constructor
	 * @return a placeholder value
	 */
	public Process(String processID) {
		return;
	}//end default constructor
	
	
	/**
	 * compareTo method
	 * @return 0
	 */
	public int compareTo(Process p) {
		int processOnePriority = getPriority();
		int processTwoPriority = p.getPriority();
		
		if (processOnePriority == processTwoPriority) {
			System.out.println(processOnePriority + " = " + processTwoPriority);
		} else {
			System.out.println(processOnePriority + " != " + processTwoPriority);
		}
		return 0;
	}//end compareTo


	/**
	 * getter for processID
	 * @return processID
	 */
	public String getProcessID() {
		return processID;
	}//end getter

	/**
	 * setter for processID
	 * @param processID passes a new value for processID
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setter

	/**
	 * getter for priority
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}//end getter

	/**
	 * setter for priority
	 * @param priority passes a new value for priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setter


	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
	
//end program
}
