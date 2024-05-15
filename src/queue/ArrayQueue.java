package queue;

public class ArrayQueue {
		
	private int capacity;
	private int front;
	private int rear;
	private int []queue;
	
	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}

	/**
	 * Elemet and das Ende der queue anfügen
	 * @param element
	 */
	public void enqueue(int element) {
		if(!isFull()) {
			queue[rear] = element;
			rear++;
		} else {
			System.out.println("Queue is full");
		}
	}
	/**
	 * Element vom ende der queue entfernen
	 */
	public void dequeue() {
		if(!isEmpty()) {
			for(int i = 0; i < rear; i++) {
				queue[i] = queue[i+1];
			}
			rear--;
		}else {
			System.out.println("Queue is empty");
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int front() {
		if(!isEmpty()) {
			return queue[front];
		}
		return -1; //keine saubere Lösung -> Exception Handling
	}
	/**
	 * ausgeben der queue
	 */
	public void display() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i++) {
				System.out.println(queue[i]);
			}
		} else {
			System.out.println("Queue is empty");
		}
	}
	
	/**
	 * Testen ob die queue leer ist
	 * @return
	 */
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	
	/**
	 * testen ob die queue voll ist
	 * @return
	 */
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	
	//GETTER + SETTER
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	
	
}
