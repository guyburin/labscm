
public class input {
	private int salary,salarymounth;
	private String name,id;
	
	public input() {
		
	}

	public input(int salary, String name, String id,int salarymounth) {
		this.salarymounth = salarymounth;
		this.salary = salary;
		this.name = name;
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalarymounth() {
		return salarymounth;
	}

	public void setSalarymounth(int salarymounth) {
		this.salarymounth = salarymounth;
	}
	
	
	
	
}
