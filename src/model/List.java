package model;

public class List {
	
	private Node head;
	private Node tail;
	
	public void addLast(Node node) {
		if(head==null) {
			head=node;
			tail=node;
			head.setNext(head);
			head.setPrev(head);
		}else {
			tail = head.getPrev();
			tail.setNext(node);
			node.setPrev(tail);
			
			node.setNext(head);
			head.setPrev(node);
			tail=node;
		}
	}
	
	//public void addLast2(Node node) {
		//if(tail==null) {
			//tail=node;
			//head=node;
		//}else{
			//tail.setNext(node);
			//node.setPrev(tail);
			//tail=node;
		//}
	//}
	
	/*public void delete(int value) {
		delete(head,value);
	}*/
	
	/*private void delete(Node current,int value) {
		//parada
		if(current==null) {
			return;
		}
		
		if(value == head.getNumber() && current==head) {
			head.getNext().setPrev(null);
			head = current.getNext();
			return;
		}
		
		if(value == tail.getValue() && current==tail) {
			tail.getPrev().setNext(null);
			tail = current.getPrev();
			return;
		}
		
		if(current.getValue()==value) {
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			return;
		}
		
		//recursivo
		delete(current.getNext(),value);
	}
	
	
	public void movePlayer(int number) {
		Node current=findNode(head);
		Player p=playerNode.getPlayer();
		playerNode.setPlayer(null);
		movePlayer(playerNode,dice,p);
		
	}
	
	private Node findNode(Node current) {
		if (current.getNumber()!=null) {
			return current;
		}
		return findPlayer(current.getNext());
	}*/
	
	//public void print() {
		//print(head);
	//}
	
	
	/*private void print(Node node) {
		//parar
		if(node.getNext()==head) {
			System.out.println(node.getValue()+" "+(node.getPlayer()!= null ? node.getPlayer().getPlayer():""));
			return;
		}
		System.out.println(node.getValue()+" "+(node.getPlayer()!= null ? node.getPlayer().getPlayer():""));
		//recursividad
		print(node.getNext());
	}*/

	/*public void movePlayer(int dice) {
		Node playerNode=findPlayer(head);
		Player p=playerNode.getPlayer();
		playerNode.setPlayer(null);
		movePlayer(playerNode,dice,p);
		
	}*/
	
	/*private Node findPlayer(Node current) {
		if (current.getPlayer()!=null) {
			return current;
		}
		return findPlayer(current.getNext());
	}*/

	/*public void movePlayer(Node current,int dice,Player player) {
		//parar
		if(dice==0) {
			current.setPlayer(player);
			return;
		}
		//recurrir
		movePlayer(current.getNext(),--dice,player);
	}*/

}
