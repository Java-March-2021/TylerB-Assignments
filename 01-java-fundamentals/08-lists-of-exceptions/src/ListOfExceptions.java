import java.util.ArrayList;

public class ListOfExceptions {
	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		
		for(int i = 0; i < myList.size(); i++) {
			try {
				Integer castedValue = (Integer) myList.get(i);
				System.out.println( castedValue + " Converted to integer!");
			} catch (Exception e) {
				String val = (String) myList.get(i);
				System.out.println("Cannot convert " + val + " to an integer");
				
			}
		}
		
	}
}
