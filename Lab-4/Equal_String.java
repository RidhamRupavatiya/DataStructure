import java.util.Scanner;
class Equal_String{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Get string
		System.out.println("Enter String:");
		String str1 = sc.next();
		
		//Declair stack
		char[] s_a = new char[str1.length()/2];
		char[] s_b = new char[str1.length()/2];
		int top_a = -1;
		int top_b = -1;

		for(int i=0;i<str1.length();i++){
			//check Stack over flow for first stack
			if(top_a>str1.length()/2){
				System.out.println("Stack Overflow...!");
				break;
			}
			else{
				//if character is 'a' then push element in stack:S_a
				if(str1.charAt(i)=='a' || str1.charAt(i)=='A'){
					top_a++;
					s_a[top_a] = str1.charAt(i);
				}
			}
			//check Stack over flow for second stack
			if(top_b>str1.length()/2){
				System.out.println("Stack Overflow...!");
				break;
			}
			//if character is 'b' then push element in stack:S_b
			else{
				if(str1.charAt(i)=='b' || str1.charAt(i)=='B'){
					top_b++;
					s_b[top_b] = str1.charAt(i);
				}
			}
		}
		if(top_a==top_b){
			System.out.println("a:"+(top_a+1)+","+"b:"+(top_b+1));
		}
		else{
			System.out.println("Invalid string");
		}
	}
}