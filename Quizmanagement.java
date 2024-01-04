
package quiz2;
import quiz1.*;
import java.io.*;
import java.util.*;
public class Quizmanagement extends Student 
{
String sid;
String subname;
Scanner sc=new Scanner(System.in);
public Quizmanagement(String name,String regno,String sid)
{
super(name,regno);
this.sid=sid;
}
public void play() throws ArithmeticException
{
score=0;
System.out.println("welcome to the quiz");
System.out.println("1.who is our prime minister");
System.out.println("1.modi,2.rani,3.valabhai");
int a=sc.nextInt();
switch(a)
{
case 1:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.who is our president");
System.out.println("1.murmu,2.modi,3.valabhai");
int b=sc.nextInt();
switch(b)
{
case 1:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.what is our national bird");
System.out.println("1.peacock,2.crow,3.cucu");
int c=sc.nextInt();
switch(c)
{
case 1:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.what is our national flower");
System.out.println("1.rose,2.lotus,3.tulip");
int d=sc.nextInt();
switch(d)
{
case 2:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.who is called father of nation");
System.out.println("1.modi,2.gandhi,3.valabhai");
int e=sc.nextInt();
switch(e)
{
case 2:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.what is the another name of india");
System.out.println("1.india,2.indopakistan,3.bharat");
int f=sc.nextInt();
switch(f)
{
case 3:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.currency in india is called");
System.out.println("1.rupee,2.euro,3.dollar");
int g=sc.nextInt();
switch(g)
{
case 1:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.who is our cheif minister of tamilnadu");
System.out.println("1.modi,2.rani,3.stalin");
int h=sc.nextInt();
switch(h)
{
case 3:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.capital of india");
System.out.println("1.up,2.delhi,3.ap");
int i=sc.nextInt();
switch(i)
{
case 2:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.official language of india");
System.out.println("1.tamil,2.none,3.hindi");
int j=sc.nextInt();
switch(j)
{
case 2:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("1.national anthem of india");
System.out.println("1.vanthe,2.aluma doluma,3.jana gana");
int k=sc.nextInt();
switch(k)
{
case 3:
{
System.out.println("correct answer");
score++;
break;
}
default:
{
System.out.println("wrong answer");
}
}
System.out.println("thank u for completing the quiz");
if(score<0)
{
throw new ArithmeticException("you are not elligible for next level");
}
System.out.println("your score:"+score);
}
public void display()
{
super.display();
System.out.println("quiz id :"+sid);
System.out.println("subject name:"+"general knowledge");
}
public int qscore()
{
return score;
}
}





