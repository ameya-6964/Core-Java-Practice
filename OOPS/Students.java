package OOPS;

// Student Class Blueprint || Datatype To Create Student
class Student{
    String name;
    int age;
    int rollNo;

   Student(String name ,int age,int rollNo){
       this.name= name;
       this.age= age;
       this.rollNo= rollNo;
   }
   void printDetails(){
       System.out.println("Name Is :- " + name);
       System.out.println("Age Is :- " + age);
       System.out.println("Roll No Is :- " + rollNo);
   }
}
public class Students {
    public static void main(String[] args) {
        // Object 1
        Student s1 = new Student("Ameya", 25, 1);
        // Object 2
        Student s2 = new Student("Kunal", 27, 2);

        s1.printDetails();
        s2.printDetails();
    }
}
