class Student123
{
int stdid;
String stdname;
int m1marks;
Student123(int stdid, String stdname, int m1marks)
{
this.stdid=stdid;
this.stdname=stdname;
this.m1marks=m1marks;
}
public boolean equals(Object obj)
{
Student123 s2= (Student123)obj;
return this.m1marks== s2.m1marks;
}
public static void main (String[] args)
{
Student123 s1= new Student123(123,"Dinga",45);
Student123 s2= new Student123(124, "Dingi",35);
System.out.println(s1.equals(s2));
}
}
