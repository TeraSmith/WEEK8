
class Node {

	int key;
	Node next;


//constructor
	public Node(int key) {

		this.key = key;
		this.next = null;
		}
	}

	public class LinkedQueue2 {

		Node front, rear;
		public int size;

		public LinkedQueue2() {

			this.front = null;
			this.rear = null;
			this.size = 0;

		}
		//method add to queue
		void enqueue(int key) {

			Node node = new Node(key);

			if (this.rear == null) {
				this.front = node;
				this.rear = node;
				this.size++;
				return;
			}
		System.out.println("Enqueued item in LinkedQueue is " + key);

		this.rear.next = node;
		this.rear = node;
		this.size++;
		}
		//method to remove from queue
		Node dequeue() {

				if (this.front == null)
					throw new NullPointerException("More elements");
					
				Node node = this.front;
				System.out.println("Dequeued item from LinkedQueue is " + this.front.key);

				this.front = this.front.next;

				if (this.front == null)
					this.rear = null;
					this.size--;
					return node;

			}



			public int getSize() {
				return this.size;

			}

	//Removes from the middle 
	public void removeMiddle() {
		Node curr = front;
		int length = 0;
		Node middle = front;
			while (curr.next != null) {
				length++;

		if (length % 2 == 0) {
		middle = middle.next;
	}
		curr = curr.next;
	}
		if (length % 2 == 1) {
		middle = middle.next;

	}

		System.out.println("Middle LinkedQueue : " + middle.key);

	}

}
