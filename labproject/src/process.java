
public class process {
	
	private int sa;

	public process() {
		
	}
	
	public process(input emp) {
		int sa=0;
		if(emp.getSalarymounth() >=1 && emp.getSalarymounth()<=50000) {
		 sa=(int) ((5/100.0)*emp.getSalarymounth());
		 sa=sa+emp.getSalary();
		}else {
			sa=(int) ((10/100.0)*emp.getSalarymounth());
			 sa=sa+emp.getSalary();
		}
		this.sa=sa;
		
		if(this.sa<20000) {
			this.sa = 20000;
		}
	}

	public int getSa() {
		return sa;
	}

	public void setSa(int sa) {
		this.sa = sa;
	}
	
	

}
