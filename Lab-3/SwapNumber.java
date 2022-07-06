import java.util.Scanner;
class SwapNum{
	public void swap(int x,int y){
			int temp;
			temp = x;
			x = y;
			y = temp;
			System.out.println("----Afte Swape : "+ x +" "+y);
	}
}
class SwapNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		int x = sc.nextInt();
		System.out.println("Enter Number 2 :");
		int y = sc.nextInt();
		System.out.println("----Before swap : "+ x +" "+y);
		SwapNum sw = new SwapNum();
		sw.swap(x,y);
	}	
}

