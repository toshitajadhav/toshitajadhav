package assignment1;

import java.util.Scanner;

public class Employee {
Scanner sc=new Scanner(System.in);
String name;
public float salary;

void input()
{
System.out.println("Enter Employee name :");
name=sc.next();
System.out.println("Enter Salary :");
salary=sc.nextFloat();
}
void show()
{
System.out.println("Employee name :"+name);
System.out.println("Salary is :"+salary);
}

	public static void main(String[] args) {
		{
	Scanner s=new Scanner(System.in);
    System.out.println("Enter How many information you want to store ?");
    int n=s.nextInt();
    Employee e[]=new Employee[n];
    float sal[]=new float[5];
             for(int i=0;i<n;i++)
{
e[i]=new Employee();
e[i].input();
sal[i]=e[i].salary;
}
for(int i=0;i<n;i++)
{
e[i].show();
}
float max=sal[0];
float arr[]=new float[5];
int j=0;
for(int i=0;i<n;i++)
	{
				if(max<sal[i])
				{
					max=sal[i];
					arr[j]=max;
					j=i;
				}
			}
	                   System.out.println("**********"+Employee Having Maximum Salary                                                     ************");
			e[j].show();
		}
	}
	}


	
