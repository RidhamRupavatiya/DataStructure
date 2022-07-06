import java.util.Scanner;
class Factorial_Recursion{
		public int fact(int n){
			if(n==1){
				return 1;
			}
			else{
				return(n*fact(n-1));
			}
		} 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number : ");
			int num = sc.nextInt();
			Factorial_Recursion fr = new Factorial_Recursion();
			int ans = fr.fact(num);
			System.out.println("factorial = "+ans);
		}
}