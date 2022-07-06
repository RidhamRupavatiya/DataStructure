import java.util.Scanner;
class Swap{
	int a;
	int b;
	Swap(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void printmessage(){
		int c=a;
		a=b;
		b=c;
		System.out.println("-----After Swap----");
		System.out.println("X : "+a);
		System.out.println("Y : "+b);
	}
}
public class DemoSwap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("X : ");
		int a=sc.nextInt();
		System.out.print("y : ");
		int b=sc.nextInt();
		Swap sw=new Swap(a,b);
		sw.printmessage();
		}
}