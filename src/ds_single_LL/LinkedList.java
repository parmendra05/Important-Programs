package ds_single_LL;

public class LinkedList {

	private ListNode head;

	public void create(int data) {
		ListNode nodeRef = new ListNode();
		nodeRef.setData(data);
		nodeRef.setNext(null);

		if (head == null)
			head = nodeRef;
		else {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nodeRef);
		}
	}

	public void fetchData() {
		ListNode currentNode = head;
		while (currentNode.getNext() != null) {
			System.out.println(currentNode.getData() + " - " + currentNode.getNext());
			currentNode = currentNode.getNext();
		}
	}
}
