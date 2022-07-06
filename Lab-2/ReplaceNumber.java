import java.util.Scanner;

class ReplaceNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Declair size of array :");
		int size = sc.nextInt();

		int[] array = new int[size];

		for(int i=0 ; i<array.length ; i++){
			System.out.println("Enter Element :");
			array[i] = sc.nextInt();
		}

		System.out.println("Enter Existing Number :");
		int num1 = sc.nextInt();

		System.out.println("Enter Number to replace above Number:");
		int num2 = sc.nextInt();

		int count=0;
		for(int i=0 ; i<array.length ; i++){
			if(array[i]==num1){
				array[i]=num2;
				count++;
				System.out.println("replacable number index = "+i);
			}
		}
		if(count==0){
			System.out.println("Enter valid number!");	
		}
		else{
			System.out.println("------Print Array with replacable Number---------");
			for(int i=0 ; i<array.length ; i++){
			System.out.println(array[i]);
			}
		}	
	}	
}