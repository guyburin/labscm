import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int salary,salarymounth;
		String id,name;
		System.out.println("Enter Your ID : ");
		id=in.next();
		System.out.println("Enter Your Name :");
		name=in.next();
		System.out.println("Enter Your Salary :");
		salary=in.nextInt();
		System.out.println("Enter Your salary of item on month :");
		salarymounth=in.nextInt();
		input emp=new input(salary,name,id,salarymounth);
		process pro=new process(emp);
		output out=new output(emp,pro);
	}

}
