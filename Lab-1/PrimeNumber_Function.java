// Write a program to check whether a number is prime or not.
import java.util.Scanner;
public class PrimeNumber_Function{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number To Check Prime Or Not : ");
		int number = sc.nextInt();
		PrimeNumber pn = new PrimeNumber();
		pn.printPrime(number);
	}
}
class PrimeNumber{
	public void printPrime(int number){
		int count = 0;
		for(int i = 2; i <= number/2; i++){
			if(number%i==0){
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(number+" Is Prime Number");
		else
			System.out.println(number+" Is Not Prime Number");

	}
}