import quiz2.Quizmanagement;
import java.util.*;
class Main
{
public static void main(String args[])
{
String name;
String regno;
int score;
double avg;
String sid;
String answer;
Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
name=sc.nextLine();
System.out.println("enter your regno");
regno=sc.nextLine();
System.out.println("enter quiz id");
sid=sc.nextLine();
Quizmanagement q=new Quizmanagement(name,regno,sid);
try
{
q.play();
}
catch (ArithmeticException e )
{
System.out.println("error:"+e.getMessage());
}
int s=q.qscore();
q.head("quiz Management 2023 ");
q.display();
System.out.println("your score is:"+s);
System.out.println("your total:"+s);
}
}


