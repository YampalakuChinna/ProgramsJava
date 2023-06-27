package Constructor;

public class EmployeeApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee1 e1=new Employee1(05,"Chinna");
		
		System.out.println(e1.getid()+" "+e1.getname());
		Employee1 e2=new Employee1();
		System.out.println(e2.getname()+" "+e2.getid());


	}

}
