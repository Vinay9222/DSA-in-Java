public class Oops {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.age = 21;
        s1.name = "Vinay";
        s1.getInfo();
        Student s2= new Student();
        s2.age = 23;
        s2.name = "Vijay";
        s2.getInfo();
        Student s3 = new Student(10, "Sham");
        s3.getInfo();
        Student s4 = new Student(s2);
        s4.getInfo();
    }
}

class Student{
   int age;
   String name;

   public void getInfo(){
    System.out.println("The name of the student is :"+this.name);
    System.out.println("The name of the student is :"+this.age);
   }
   Student(){ // Non-Parametrized Contructor
    System.out.println("The constructor is called");
   }
   Student(int age, String name){ // Parameterized Constructor
    this.name = name;
    this.age = age;
   }
   Student(Student s1){ // Copy Constructor
    this.age = s1.age;
    this.name = s1.name;
   }
}
