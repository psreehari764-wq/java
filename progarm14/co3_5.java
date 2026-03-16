import java.util.*;

interface Sports{
    public void sports_getData();
    public void sports_disData();
}

class Student{
    String name;
    int roll_no;
    int score;

    Student(String name,int roll,int m1){
        this.name=name;
        this.roll_no=roll;
        this.score=m1;
    }

    void display(){
        System.out.println("Student Details");
        System.out.println("Name of student: " + name);
        System.out.println("Roll no of student: " + roll_no);
        System.out.println("Academic score: " + score);
    }
}

class Result extends Student implements Sports{

    int sportsScore;
    Scanner sc=new Scanner(System.in);

    Result(String name,int roll_no,int m1){
        super(name,roll_no,m1);
    }

    public void sports_getData(){
        System.out.println("Enter sports score:");
        sportsScore=sc.nextInt();
    }

    public void sports_disData(){
        System.out.println("Sports score: " + sportsScore);
    }
}

class co3_5{
    public static void main(String args[]){

        String name;
        int roll_no,mark;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name:");
        name=sc.nextLine();

        System.out.println("Enter the roll number:");
        roll_no=sc.nextInt();

        System.out.println("Enter the academic score:");
        mark=sc.nextInt();

        Result re=new Result(name,roll_no,mark);

        re.sports_getData();
        re.display();
        re.sports_disData();
    }
}
