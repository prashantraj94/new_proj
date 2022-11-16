package EWS;

class Employee 
{
	 String ename;
	    int salary,age;
	    
		public Employee() 
		{
			super();
		}
		public Employee(String ename, int age, int salary) {
			super();
			this.ename = ename;
			this.salary = salary;
			this.age = age;
		}
		
	public void display()
	{
		System.out.println(ename +"   "+ salary+"  " );
	}

}