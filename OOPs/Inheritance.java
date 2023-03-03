public class Inheritance {
    public static void main(String[] args) {
        Animal cow = new Animal();
        cow.legs();
    }
}

class Animal{
    int legs;
    int eat;
    public int legs(){
        System.out.println("The animals can eat!!");
        return 0;
    }
    public void legs(){
        System.out.println("The animals having minimum 2 legs!!");
    }
    Animal(){
        System.out.println("Constructor is called");
    }
}

class Dog extends Animal{
    public void legs(){
        System.out.println("The Dog has 4 legs");
    }
}

class Hen extends Animal{
    public void legs(){
        System.out.println("The Hen has 2 legs");
    }
}

class Lion extends Dog{
    public void legs(){
        System.out.println("The Lion has 4 legs !!!!!!!!");
    }
}
