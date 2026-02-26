class Cpu
{
int price;
public Cpu(int p)
{
this.price=p;
}
void display()
{
System.out.println("price of the cpu:" +this.price);
}
class Processor
{
int cores;
String manufacture;
Processor(int core,String manf)
{
this.cores=core;
this.manufacture=manf;
}
void display()
{
System.out.println("no of cores:"+this.cores);
System.out.println("processor manufacture:"+this.manufacture);
}
}
static class Ram
{
int memory;
String manufacture;
Ram(int n,String m)
{
this.memory=n;
this.manufacture=m;
}
void display()
{
System.out.println("memory size:" +this.memory);
System.out.println("memory manufacture:"+this.manufacture);
}
}
public static void main(String args[]){
Cpu intel=new Cpu(23000);
Cpu.Processor p=intel.new Processor(8,"intel");
Cpu.Ram ram=new Ram(64,"asus");
intel.display();
p.display();
ram.display();
}
}

