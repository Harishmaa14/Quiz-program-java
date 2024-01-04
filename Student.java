package quiz1;
import java.io.*;
interface heading
{
abstract void head(String h);
}
public class Student implements heading 
{
public String name;
public String regno;
public int score;
public double avg;
public Student(String name,String regno)
{
this.name=name;
this.regno=regno;
}
public void display()
{
System.out.println("name:"+name);
System.out.println("regno:"+regno);
System.out.println("score:"+score);
}
public void head(String h)
{
System.out.println(h);
}
}

