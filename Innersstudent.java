class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    /*function constructors used to construct javaa object three type of constructor/
                                    constructor or class ka  name same hota hy/
                                    constructor function/method but can not return anything/
                                    constructor call only one time for one object/
                                    java by default automatically build a non parametarized constructor
                                       1.non parameterized constructor lack of parameters
                                       2.parameterized constructor
                                       3.copy constructor used to copy 1 object constructor to another object*/
/*Student(){
    System.err.println("constructor called");
}*/
   Student(Student s2){
    this.name = s2.name;
    this.age= s2.age;
   } 
   Student(){

   }
}

public class Innersstudent {
 
    public static void main(String args[]) {
        //Student s1 = new Student("kashan",23);  
        Student s1 = new Student();
        s1.name="kashan";
        s1.age= 23;
        
        s1.printInfo();

        //Student s2 = new Student("sadia",22);
        Student s2 = new Student(s1);
        //s2.name="sadia";
        //s2.age= 20;
    
        s2.printInfo();
    }
}