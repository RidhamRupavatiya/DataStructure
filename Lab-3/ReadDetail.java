import java.util.Scanner;
class Employee_Detail{
	int Employee_id;
	String Name;
	String Designation;
	Double Salary;
	Employee_Detail(int Employee_id , String Name , String Designation , Double Salary){
		this.Employee_id = Employee_id;
		this.Name = Name;
		this.Designation = Designation;
		this.Salary = Salary;
	}
	void printDetail(){
		System.out.println("Employee_id : "+Employee_id);
		System.out.println("Name : "+Name);
		System.out.println("Designation : "+Designation);
		System.out.println("Salary : "+Salary);	
	}
}
class ReadDetail{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee_id : ");
		int Employee_id = sc.nextInt();
		System.out.println("Name : ");
		String Name = sc.next();
		System.out.println("Designation :");
		String Designation = sc.next();
		System.out.println("Salary : ");
		Double Salary = sc.nextDouble();
		sc.close();
		Employee_Detail ed = new Employee_Detail(Employee_id , Name , Designation , Salary);
		ed.printDetail();
	}
}