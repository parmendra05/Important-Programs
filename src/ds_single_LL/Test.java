package ds_single_LL;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		// Adding the data by created custom method
		list.create(5);
		list.create(9);
		list.create(1);
		list.create(2);
		
		// Getting the data by custom method
		list.fetchData();

	}

}
