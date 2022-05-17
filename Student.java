public class Student {


private String Name;
private int Age;


public Student(String name, int age) {
Name = name;
Age = age;
}


public String GetName() {return Name;}
public int GetAge() {return Age;}


public String ToString() {
return Name + " " +" "+ Integer.toString(Age);
}
}