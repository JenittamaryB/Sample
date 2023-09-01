package Newpro;
class Student
{
int rollno;
String name;
static String college ="Bishop";
Student(int r, String n)
{
rollno = r;
name = n;
}
void display ()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class Static
{
public static void main(String args[])
{
Student s1 = new Student(111,"joshva");
Student s2 = new Student(222,"joel");
s1.display();
s2.display();
}
}
