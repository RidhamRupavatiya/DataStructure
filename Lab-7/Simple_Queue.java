// Implement Simple Queue using array that performs following operations: INSERT, DELETE, DISPLAY

import java.util.Scanner;
class Queue{
    int rear = -1,front = -1;
    int max = 10;
    int que[] = new int[max];

    void enqueue(int n){
        if(rear>=9){
            System.out.println("Queue OverFlow..!");
        }
        else{
            rear++;
            que[rear] = n;
            if(front==-1){
                front=0;
            }
        }
    }
    void dequeue(){
        if(front==-1){
            System.out.println("Queue Under Flow..!");
        }
        else{
            if(front==rear){
                front=rear=-1;
            }
            else{
                front++;
                System.out.println("Dequeued");
            }
        }
    }
    void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.print("Q:[ ");
            for(int i=front ; i<=rear ; i++){
                System.out.print(que[i]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

class Simple_Queue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        System.out.println("Enter 1 for Enqueue\nEnter 2 for Dequeue\nEnter 3 for display queue \nEnter 4 for Exit");
        
        while(true){
            System.out.print("Enter a choice :");
            int choice = sc.nextInt();
            switch(choice){
            case 1:
                System.out.println("Enter Number : ");
                int n = sc.nextInt();
                q.enqueue(n);
                break;
            case 2:
                q.dequeue();
                break;
            case 3:
                q.display();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Enter valid choice ..!");
                break;
            }
        }
    }
}