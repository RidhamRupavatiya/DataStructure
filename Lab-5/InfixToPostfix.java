/*Implement a program to convert in-fix notation to post-fix notation using stack.*/

import java.util.Scanner;

class P1{
	int top=-1,r=0;
	char temp,next;
	char[] s = new char[100];
	String polish="";
	boolean flag=true;

	public char pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			top=top-1;
			return s[top+1];
		}
	}

	public void push(char z){
		if(top>=99)
			System.out.println("Stack OverFlow");
		else{
			top=top+1;
			s[top]=z;
		}
	}

	public int spf(char z){
		if(z=='+' || z=='-')
			return 2;
		else if(z=='*' || z=='/')
			return 4;
		else if(z=='^')
			return 5;
		else if(z=='(' || z==')')
			return 0;
		else
			return 8;
	}

	public int ipf(char z){
		if(z=='+' || z=='-')
			return 1;
		else if(z=='*' || z=='/')
			return 3;
		else if(z=='^')
			return 6;
		else if(z=='(')
			return 9;
		else if(z==')')
			return 0;
		else
			return 7;
	}

	public int rank(char z){
		if(z=='+' || z=='-' || z=='*' || z=='/' || z=='^')
			return -1;
		else
			return 1;
	}

	public void infix_to_postfix(String str){
		for(int i=0;i<str.length();i++){
			next = str.charAt(i);

			while(next!=' '){
				if(top<0){
					System.out.println("Invalid Expression");
					flag=false;
					break;
				}

				while(spf(s[top])>ipf(next)){
					temp=pop();
					polish+=temp;
					r=r+rank(temp);
					if(r<1){
						System.out.println("Invalid Expression");
						flag=false;
						break;
					}
				}
				if(!flag)
	 				break;
				if(spf(s[top])!=ipf(next))
					push(next);
				else
					pop();
				break;
			}
		}
		if(top!=0 || r!=1)
			System.out.println("Invalid Expression");
		else
			System.out.println("Valid Expression "+polish);
	}
}

class InfixToPostfix{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Infix Expression : ");
		String str = sc.next();
		P1 p = new P1();
		p.push('(');
		p.infix_to_postfix(str);
	}
}
	