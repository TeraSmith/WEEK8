
class Node {

	int key;
	Node next;



	public Node(int key) {

		this.key = key;
		this.next = null;
		}
	}

	public class LinkedQueue {

		Node front, rear;
		public int size;

		public LinkedQueue() {

			this.front = null;
			this.rear = null;
			this.size = 0;

		}

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

	}