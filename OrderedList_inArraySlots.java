public class OrderedList_inArraySlots {
	protected List_inArraySlots list;
	
	public OrderedList_inArraySlots() {
		list = new List_inArraySlots();
	}
	public int size() {
		return list.size();
	}
	
	public int get(int index) {
		return list.get(index);
	}
	
	public void add(int value) {
		int index = findPos(value);
		list.add(index, value);
	}
	
	public int findPos(int value){
		for (int i = 0; i < list.size(); i++)
			if (value < list.get(i))
				return i;
		return list.size();
	}
	
	public int remove(int index) {
		return list.remove(index);
    }
	
	public int set( int index, int newValue ) {
		if (newValue >= list.get(index - 1) && (newValue <= list.get(index + 1) || index == size() - 1))
			return list.set(index, newValue);
		return -1;
    }
	
	public String toString() {
		return list.toString();
	}
}