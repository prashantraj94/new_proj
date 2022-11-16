package EWS;

import java.util.Scanner;

class mainemployee 
{
	void sort(Employee x[])
	{
		Employee temp = new Employee();
		for(int j=0;j<2;j++) 
		{
		for(int i=0;i<2;i++)
		{
			if(x[i].salary>x[i+1].salary)
			{
		     temp= x[i];
		     x[i]= x[i+1];
		     x[i+1]=temp;
			}
		}
		}
		for(int i=0;i<3;i++)
		{
			x[i].display();
		}
		}

	public static void main(String[] args) 
	{
		mainemployee m= new mainemployee();
		Employee e[]= new Employee[3];// created five references 
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
		System.out.println("enter name");
		String name= s.next();
		System.out.println("enter age");
		int age= s.nextInt();
		System.out.println("enter salary");
		int sal= s.nextInt();
		e[i]= new Employee(name,age,sal);
		}
	    m.sort(e);
	}
}
