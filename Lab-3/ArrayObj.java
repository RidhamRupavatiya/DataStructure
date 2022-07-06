//Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 students, scan their information and print it.
import java.util.Scanner;
class Student_Detail{
	int Enrollment_no;
	String Name;
	int Sem;
	double Cpi;
	
	Student_Detail(int Enrollment_no , String Name , int Sem , double Cpi){
		this.Enrollment_no = Enrollment_no;
		this.Name = Name;
		this.Sem = Sem;
		this.Cpi = Cpi;
	}
	void printInformation(){
		System.out.println("\nEnrollment_no = "+Enrollment_no);
		System.out.println("Name = "+Name);
		System.out.println("Sem = "+Sem);
		System.out.println("Cpi = "+Cpi);		
	}
}

class ArrayObj{
	public static void main(String[] args) {
		int Enrollment_no;
		String Name;
		int Sem;
		double Cpi;

		Student_Detail sd[] = new Student_Detail[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<5 ; i++){
			
			System.out.println("Enter Student "+(i+1)+" Enrollment_no :");
			Enrollment_no =  sc.nextInt();

			System.out.println("Enter Student "+(i+1)+" Name : ");
			Name =  sc.next();

			System.out.println("Enter Student "+(i+1)+" Sem : ");
			Sem =  sc.nextInt();
			
			System.out.println("Enter Student "+(i+1)+" Cpi : ");
			Cpi =  sc.nextDouble();

			sd[i] = new Student_Detail(Enrollment_no , Name , Sem , Cpi);
		}
		for(int i=0 ; i<5 ; i++){
			sd[i].printInformation();			
		}
	}
}