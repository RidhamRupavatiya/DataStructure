//Write a program for evaluation of post-fix Expression using Stack.

import java.util.Scanner;
class Evaluation{
	int top = -1;
	int stack[] = new int[50];

	void push(int ch){
		if(top>49){
			System.out.println("Stack over flow..!");
		}
		else{
			top++;
			stack[top] = ch;
		}
	}

	int pop(){
		if(top==-1){
			System.out.println("Stack Under flow..!");
			return 0;
		}
		else{
			top--;
			return stack[top+1];
		}
	}
	int operation(int op1, int op2, char ch){
		switch(ch){
			case '+':
				return op1+op2;
			case '-':
				return op1-op2;
			case '*':
				return op1*op2;
			case '/':
				return op1/op2;
			case '%':
				return op1%op2;
			default :
				return 0;
		}
	}
}

class PostfixEvaluation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Evaluation obj = new Evaluation();
		System.out.println("Enter Postfix Expression : ");
		String str = sc.next();

		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);

			if(Character.isDigit(ch)){
				obj.push(ch-'0');
			}
			else{
				int op2 = obj.pop();
				int op1 = obj.pop();
				int value = obj.operation(op1 , op2 , ch);
				obj.push(value);
			}
		}
		int ans = obj.pop();
		System.out.println("Ans : "+ans);	
	}
}