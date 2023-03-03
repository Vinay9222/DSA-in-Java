public class ShallowCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 32;
        s1.name = "Vinay";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println("The age of student s1 is :" + s1.age);
        System.out.println("The name of student s1 is :" + s1.name);
        System.out.println("The marks is as follow : ");
        for(int i=0; i<3;i ++){
            System.out.print(s1.marks[i] + " ");
        }
        System.out.println("============================");
        
        Student s2 = new Student(s1);
        s2.age = 25;
        s1.marks[0]=50;
        System.out.println("\nThe age of student s2 is :" + s2.age);
        System.out.println("The name of student s2 is :" + s2.name);
        System.out.println("The marks is as follow : ");
        for(int i=0; i<3;i ++){
            System.out.print(s2.marks[i] + " ");
        }
        System.out.println("============================");
        System.out.println("\nThe age of student s1 is :" + s1.age);
        System.out.println("The name of student s1 is :" + s1.name);
        System.out.println("The marks is as follow : ");
        for(int i=0; i<3;i ++){
            System.out.print(s1.marks[i] + " ");
        }
    }
}

class Student{
    int age;
    String name;
    int[] marks;

    //Shallow Copy
    Student(Student s1){
        marks = new int[3];
        this.age = s1.age;
        this.marks = s1.marks;
        this.name = s1.name;
    }

    //Deep Copy
    // Student(Student s1){
    //     this.age = s1.age;
    //     this.name = s1.name;
    //     marks = new int[3];
    //     for(int i=0; i<3; i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }
    Student(){
        marks = new int[3];
        System.out.println("Constuctor is called");
    }
}
