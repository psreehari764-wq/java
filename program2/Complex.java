public class Complex
{
int real;
int imaginary;
public Complex(int real,int img)
{
this.real=real;
this.imaginary=img;
}
public static Complex sum(Complex c1,Complex c2)
{
Complex temp=new Complex(0,0);
temp.real=c1.real+c2.real;
temp.imaginary=c1.imaginary+c2.imaginary;
return temp;
}
public static void main(String[] args)
{
Complex first=new Complex(1,2);
Complex second=new Complex(32,22);
Complex temp=sum(first,second);
System.out.println("sum is:"+temp.real+ "+" +temp.imaginary +"i");
}
}

