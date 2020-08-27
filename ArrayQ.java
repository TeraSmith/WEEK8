
public class ArrayQ {

	private int qCapacity;

	int qArr[];
	int front = 0;
	int rear = -1;
	int size = 0;

	public ArrayQ (int size) {
	this.qCapacity = size;
	this.qArr = new int[this.qCapacity];

	}

	public void enqueue(int element) {
		if (isFull()) {
		}else {
			rear++;

	if(rear == qCapacity-1){
	rear = 0;
	}

	qArr[rear] = element;
	this.size++;
	}

	System.out.println("Enqueued item is "+qArr[rear]);
	

	}


	public void dequeue() {
	if (isEmpty()) {

	} else {

	System.out.println("Dequeued item is "+qArr[front]);

	front++;
	if(front == qCapacity-1)
	front = 0;
	this.size--;

	}

	}

	
	public boolean isFull(){

	boolean status = false;
		if (size == qCapacity){
			status = true;

	}

	return status;

	}

	public boolean isEmpty(){
	boolean status = false;
		if (size == 0) {
	status = true;

	}

		return status;

		}

	}