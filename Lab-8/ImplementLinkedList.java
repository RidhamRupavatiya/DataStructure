// Write a menu driven program to implement following operations on the singly linked list.
// a. Insert a node at the front of the linked list.
// b. Display all nodes.
// c. Delete a first node of the linked list.
// d. Insert a node at the end of the linked list.
// e. Delete a last node of the linked list.
// f. Delete a node from specified position.

import java.util.Scanner;
class SinglyLinkedList{
	class node{
		int info;
		node link;
		public node(int info){
			this.info = info;
			this.link = null;
		}
	}
	node first = null;
	
	public void insertAtFisrt(int info){
		node newNode = new node(info);
		newNode.link = first;
		first = newNode;
	}

	public void insertAtLast(int info){
		node newNode = new node(info);
		if(first==null){
			first = newNode;
		}
		else{
			node save = first;
			while(save.link!=null){
				save = save.link;
			}
			save.link=newNode;
		}
	}
	public void deleteFirst(){
		if(first==null){
			System.out.println("List is Empty");
		}
		else{
			first = first.link;
		}
	}
	public void deleteLast(){
		if(first==null){
			System.out.println("List is Empty");
		}
		else if(first.link==null){
			first = null;
		}
		else{
			node save = first;
			node ptr = first;
			while(save.link!=null){
				ptr = save;
				save = save.link;	
			}
			ptr.link=null;
		}
	}
	public void displayList(){
		if(first==null){
			System.out.println("List is Empty");
		}
		else{
			node save = first;
			while(save!=null){
				System.out.print("["+save.info + "]"+"-->");
				save = save.link;
			}
			System.out.println("null");
		}
	}
}
class ImplementLinkedList{
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : For insertAtFisrt\n2 : For insertAtLast\n3 : For deleteFirst\n4 : deleteLast\n5 : displayList \n6 : For Exit List");
		while(true){
			int info;
			System.out.println("Enter Choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter Info : ");
					info = sc.nextInt();
					sl.insertAtFisrt(info);
					break;
				case 2:
					System.out.print("Enter Info : ");
					info = sc.nextInt();
					sl.insertAtLast(info);
					break;
				case 3:
					sl.deleteFirst();
					break;
				case 4:
					sl.deleteLast();
					break;
				case 5:
					sl.displayList();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Enter Valid Choice..!");
			}
		}
	}
}