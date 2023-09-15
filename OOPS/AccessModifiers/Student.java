package OOPS.AccessModifiers;

public class Student {
    String name; //It Has Default access modifier So It Will Be Available In same Package
    private int rollNo; // It Has Public Access Modifier It Is Available In All class And All Packages

    protected String Address; // It has Protected Access Modifier Which Means

    // Getter Function
    public int getRollNo() {
        return rollNo;
    }

    //Setter Function
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

//PRIVATE :- Only Accessible in Same Class // Read And Write Only in Same Class // Accessible With getters And Setters

//Default :- Accessible Within Same Class and Same Package

// Public :- Accessible To All Class And All Packages;
