class product 
{
int pcode;
String pname;
int price;
product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
public static void main(String args[])
{
product p1=new product(1,"laptop",50000);
product p2=new product(2,"tv",45000);
product p3=new product(3,"tablet",20000);
if(p1.price < p2.price && p1.price < p3.price)
{
System.out.println("lowest price is" + " " +  p1.pname + " " + "with cost" + p1.price);
}
else if(p2.price < p1.price && p2.price < p3.price)
{
System.out.println("lowest price is" + " " + p2.pname + "with cost" + p2.price);
}
else
{
System.out.println("lowest price is" +" "+ p3.pname + " " + " with cost" + " " + p3.price);
}
}
}


