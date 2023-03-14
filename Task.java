/**
* This class allows for two tasks to be created and compared to one another
* based on their given priority, and can also display a given status level of
* completion using the enumerated list Status.
*
* @author Ethan Hopkins
* @version 1.0
* Task class
* Spring Semester/Freshman Year
*/
public class Task implements Priority, Comparable<Task>{
	enum Status{NOT_STARTED, IN_PROCESS, COMPLETE};//enumerated list will display the level of completion for the tasks
	
	private String name;//will better define what the task is
	private int priority;//will give each taask a level of importance
	
	/**
	 * default constructor for Task
	 * @return a placeholder value
	 */
	public Task(String name) {
		return;
	}//end defualt constructor

	
	/**
	 * Status method
	 * @return the value of state
	 * 
	 * This method creates a placeholder variable called state, assigns it a
	 * value from the enumerated list Status, and returns it.
	 */
	Status Status() {
		Status state;
		state = Status.NOT_STARTED;
		System.out.println(state);
		return state;
	}//end Status method
	
	
	/**
	 * compareTo method
	 * @return 0
	 * 
	 * 
	 */
	public int compareTo(Task t) {
		int taskOnePriority = getPriority();
		int taskTwoPriority = t.getPriority();
		
		if (taskOnePriority == taskTwoPriority) {
			System.out.println(taskOnePriority + " = " + taskTwoPriority);
		} else {
			System.out.println(taskOnePriority + " != " + taskTwoPriority);
		}
		
		return 0;
	}//end compareTo
	
	
	/**
	 * getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getter

	/**
	 * setter for name
	 * @param name sets a new value for name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @param priority sets a new value for priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setter
	

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString
	
	
//end program
}
