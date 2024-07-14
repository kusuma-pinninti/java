
import java.util.ArrayList;

class Array_list {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");//Adding elements to the arraylist
		fruits.add("Banana");
		fruits.add("Grapes");
		System.out.println(fruits);
		fruits.add("Grapes");//Arraylist accepts duplicates but shows only once
		System.out.println(fruits.get(1));
		System.out.println(fruits.size());
		System.out.println(fruits.remove(2));
		System.out.println(fruits.get(1));
}
}