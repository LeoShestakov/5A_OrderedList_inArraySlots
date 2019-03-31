/**
 Test ordered list features.
 */
public class UserOfOrderedList {
	public static void main( String[] args ) {
		OrderedList_inArraySlots testList = new OrderedList_inArraySlots();
		
		testList.add(0);
		testList.add(5);
		testList.add(3);
		testList.add(2);
		testList.add(1);
		testList.add(4);
		
		System.out.println("Added 0 - 5 (expect to see in ascending order): " + testList);
		System.out.println();
		
		testList.remove(3);
		System.out.println("Expect [0,1,2,4,5,] (after 3 was removed): " + testList);
		
		System.out.println("Expect get method to return 4: " + testList.get(3));
		System.out.println("Expect list size 5: " + testList.size());
		
		testList.set(4, 6);
		System.out.println("Expect [0,1,2,4,6,] (after 6 was set): " + testList);
	}
}