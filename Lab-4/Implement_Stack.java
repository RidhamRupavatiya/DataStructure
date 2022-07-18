import java.util.Scanner;
class Stack_Demo{
	int top=-1;
	int[] st = new int[5];
		void push(int n){
		if(top>5){
			System.out.println("Stack Over Flow....!");
		}
		else{
			top = top + 1;
			st[top] = n;
		}
	}

	int pop(){
		if(top==-1){
			System.out.println("Stack Under Flow...!");
			return 0;
		}
		else{
			top = top - 1;
			return st[top+1];	
		}
	}

	int peep(int j){
		if(top-j+1<=0){
			System.out.println("Empty Element...!");
			return 0;
		}
		else{
			return st[top-j+1];
		}
	}

	void change(int k,int x){
		if(top-k+1<=0){
			System.out.println("Empty Element...!");
		}
		else{
			st[top-k+1] = x;
		}
	}

	void display(){
		if(top<=0){
			System.out.println("Stack Under Flow...!");
		}
		else{
			for(int i=top ; i>=0 ; i--){
				System.out.println(st[i]);
			}	
		}
	}
}

class Implement_Stack{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_Demo st1 = new Stack_Demo();
		
		System.out.println("\nEnter 1 for Push Element \nEnter 2 for Pop Element\nEnter 3 for peep Element\nEnter 4 for change Element\nEnter 5 for Display Stack\nEnter 6 for Exit");
		int choice=1;
		while(choice!=0){
			System.out.print("Enter any : ");
			choice = sc.nextInt() ;
			switch(choice){
				case 1:
					System.out.println("Enter Element for push Element in Stack :");
					int n = sc.nextInt();
					st1.push(n);
					break;
				case 2:
					st1.pop();
					break;
				case 3:
					System.out.println("Enter Ith Element :");
					int j = sc.nextInt();
					int temp = st1.peep(j);
					System.out.println(temp);
					break;
				case 4:
					System.out.println("Enter value of Ith :");
					int k = sc.nextInt();
					System.out.println("Enter value of new Element :");
					int x = sc.nextInt();
					st1.change(k,x);
					break;
				case 5:
					st1.display();
				default:
					choice = 0;
					break;
			}
		}
	}
}
