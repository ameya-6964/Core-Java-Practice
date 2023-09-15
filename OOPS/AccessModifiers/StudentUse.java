package OOPS.AccessModifiers;
public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Ameya From ACCESS MODIFIER";
        s1.setRollNo(1);
        s2.name = "Kunal From ACCESS MODIFIER";
        s2.setRollNo(3);
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
    }
}
