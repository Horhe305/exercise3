import java.io.IOException;
import java.util.Scanner;


class Main {
public static void main(String[] args) {
try {
Scanner skan = new Scanner(System.in);
Service1 s = new Service1();
int x = 4;
String imie;
int wiek;

  
while(x!=0)
{
System.out.println("Wybierz funkcję: \n"+
"1 - dodanie nowego studenta \n"+
"2 - wyszukanie danego studenta \n"+
"3 - wyjście z programu");
x=skan.nextInt();
switch(x)
{
case 1:
{
Scanner skan1 = new Scanner(System.in);
System.out.println("Podaj imie: ");
imie=skan1.nextLine();

System.out.println("Podaj wiek: ");
wiek=skan.nextInt();

s.addStudent(new Student(imie, wiek));
}break;
case 2:
{
var students = s.getStudents();
for(Student current : students) {
System.out.println(current.ToString());
}
}break;
case 3:
{
x = 0;
}break;
}

}

//s.addStudent(new Student("Krzysztof", 20));
// s.addStudent(new Student("Janusz", 40));


// var students = s.getStudents();
// for(Student current : students) {
// System.out.println(current.ToString());
//}
} catch (IOException e) {


}
}
}