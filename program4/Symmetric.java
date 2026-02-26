import java.util.Scanner;
public class Symmetric
{
int r,c;
int[][] arr;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of row");
this.r=sc.nextInt();
System.out.println("enter the number of columns:");
this.c=sc.nextInt();
arr=new int[r][c];
System.out.println("enter the matrix");
for(int i=0;i<this.r;++i)
{
for(int j=0;j<this.c;++j)
{
this.arr[i][j]=sc.nextInt();
}
}
}
public void isSym()
{
int flag=0;
for(int i=0;i<this.r;++i)
{
for(int j=0;j<this.c;++j)
{
if(this.arr[i][j]!=this.arr[j][i])
{
flag=1;
break;
}
}
if(flag==1)
{
break;
}
}
if(flag==0)
{
System.out.println("this is a symmetic");
}else
{
System.out.println("this is not a symmetic");
}
}
public static void main(String[] args)
{
Symmetric matrix=new Symmetric();
matrix.get();
matrix.isSym();
}
}

