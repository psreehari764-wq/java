import java.util.*;
class employee{
int eno;
String ename;
int salary;
public void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the id:");
this.eno=sc.nextInt();
sc.nextLine();
System.out.println("enter the employee name");
this.ename=sc.nextLine();
System.out.println("enter the salary");
this.salary=sc.nextInt();
}
public void display()
{
System.out.println("employee id:"+this.eno);
System.out.println("employee name:"+this.ename);
System.out.println("employee salary:"+this.salary);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.println("enter no of employees");
n=sc.nextInt();
employee emp[]=new employee[n];
for(i=0;i<n;i++)
{
emp[i]=new employee();
emp[i].read();
}
System.out.println("Search");
while(true)
{
System.out.println("enter Id to search (or -1 to exit):");
int no=sc.nextInt();
if(no== -1)break;
boolean found=false;
for(i=0;i<n;i++)
{
if(emp[i].eno==no)
{
emp[i].display();
found=true;
break;
}
}
if(!found)
{
System.out.println("employee Not found");
break;
}
}
}
}
