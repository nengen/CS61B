public class SLList{
	private class IntNode{
		public int item;
		public IntNode next;

		//Constructor
		public IntNode(int item, IntNode next){
			this.item = item;
			this.next = next;
		}
	}

	private IntNode first;

	public void addFirst(int x){
		first = new IntNode(x, first);
	}

	public void insert(int item, int position){
		if(position == 0 || first == null){
			addFirst(item);
			return;
		}
		IntNode currentNode = first;
		while(position > 1 && currentNode.next != null){
			position--;
			currentNode = currentNode.next;
		}
		IntNode newNode = new IntNode(item, currentNode.next);
		currentNode.next = newNode;
	}



	private IntNode reverseRecursiveHelper(IntNode front) {
		if (front == null || front.next == null) {
			return front;
		} else {

			IntNode reversed = reverseRecursiveHelper(front.next);

			front.next.next = front;

			front.next = null;
			return reversed;
		}
	}
	public void reverse() {
		first = reverseRecursiveHelper(first);
	}
}
