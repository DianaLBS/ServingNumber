package model;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private Node current;
	private final static int MAX_CALLS=3;
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public Node getCurrent() {
		return current;
	}

	public void setCurrent(Node current) {
		this.current = current;
	}

	public static int getMaxCalls() {
		return MAX_CALLS;
	}

	public void addLast(Node node) {
		
		if(head==null) {
			head=node;
			tail=node;
			head.setNext(head);
			head.setPrev(head);
			current=head;
		}else {
			tail = head.getPrev();
			tail.setNext(node);
			node.setPrev(tail);
			
			node.setNext(head);
			head.setPrev(node);
			tail=node;
		}
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean  passTurn() {
		if(current==null) {
			return false;
		}else{
			current.setNumCalls(current.getNumCalls()+1);
			
			if(current.getNumCalls()<MAX_CALLS) {
				if(current.getNext()!=null) {
				current=current.getNext();		
				}
				return true;
			}else {
				int valueToDelete=current.getNumber();
				current=current.getNext();
				delete(valueToDelete);
				return true;
			}
		}
	}
	
	public boolean delete(int value) {
		return delete(head,value);
	}
	private boolean delete(Node node,int value) {
		//parada
		if(node==null) {
			return false;
		}
		
		if(value==head.getNumber() && value == tail.getNumber() && node==head && node==tail) {
			head=null;
			tail=null;
			current=null;
			return true;
		}else if(value == head.getNumber() && node==head) {
			//System.out.println("a");
			head.getNext().setPrev(tail);
			head = node.getNext();
			tail.setNext(head);
			return true;
		}else if(value == tail.getNumber() && node==tail) {
			//System.out.println("b");
			tail.getPrev().setNext(head);
			tail = node.getPrev();
			head.setPrev(tail);
			return true;
		}else if(node.getNumber()==value) {
			//System.out.println("c");
			node.getPrev().setNext(node.getNext());
			node.getNext().setPrev(node.getPrev());
			return true;
		}
		//recursivo
		return delete(node.getNext(),value);
	}

	
	public boolean print() {
		if(head!=null && print(head)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean print(Node node) {
		//parar
		if(node.getNext()==head) {
			System.out.println(node.getNumber());
			return true;
		}
		System.out.println(node.getNumber());
		return print(node.getNext());
	}

}
