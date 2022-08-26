// Implement Circular Queue using array that performs following operations: INSERT, DELETE, DISPLAY

import java.util.Scanner;
class Circulr_Q{
	int max=5;
	int rear=-1,front=-1;
	int cr_que[] = new int[max];

	void crenqueue(int n){
		if((front==0 && rear==max-1) || (front==rear+1)){
			System.out.println("Circular Queue OverFlow..!");
		}
		else{
			rear=(rear+1)%max;
			cr_que[rear] = n;
			if(front==-1){
				front=0;
			}
		}
	}
	void crdeueue(){
		if(front==-1){
			System.out.println("Circular Queue UnderFlow..!");
		}
		else if(rear==front){
			rear=front=-1;
		}
		else{
			front++;
		}
	}
	void display(){
		if(front==-1){
			System.out.println("Queue UnderFlow..!");
		}
		else if (rear<front) {
			for(int i=front ; i<max ; i++){
				System.out.print(cr_que[i]+" ");
			}
			for(int i=0 ; i<=rear ; i++){
				System.out.print(cr_que[i]+" ");
			}
		}
		else{
			for(int i=front ; i<=rear ; i++){
				System.out.print(cr_que[i]+" ");
			}
		}
	}
}

class Circular_Queue{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulr_Q cq = new Circulr_Q();

		System.out.println("Enter 1 for CrEneueue\nEnter 2 for DeEneueue\nEnter 3 for Display\nEnter 4 for Exit");
		while(true){
			System.out.println("Enter choice :");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
				System.out.println("Enter Num :");
				int n = sc.nextInt();
				cq.crenqueue(n);
				break;

				case 2:
				cq.crdeueue();
				break;

				case 3:
				cq.display();
				break;

				case 4:
				System.exit(0);
				break;

				default:
				System.out.println("Enter Valid Choice..!");
			}
		}
	}
}