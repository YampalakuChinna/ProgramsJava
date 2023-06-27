package Constructor;

public class Employee1 {
	private String name;
	private int id;
	
	//Constructors
	public Employee1(int a,String b)
	{
		if(a>0&&b.length()!=0) {
			id =a;
			name =b;
		
		}
		else {
			System.out.println("Invalid data ......");
		}
		
	}
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	public String getname() {
		return name;
		
		
	}
	public int getid() {
		return id;
		
	}
	
	}




