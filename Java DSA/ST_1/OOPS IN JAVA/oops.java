//class is like a blue prijnt of car
//object is that car
//JAVA MEIN DESTRUCTOR NHI HOTA 
//AUTOMATIC GARBAGE COLLECTOR HOTA HAI JO NON USED OBJECT KO APNE AAP DELETE KRDETA HAI

class Pen{
    //DATA OR PROPERTIES below
    String color;
    String type; //ball or gel

    //FUNCTIONS JO CLASS KE ANDER DEFINE HOTE HAI UNHE METHOD KEHTE HAI
    //METHODS OR MEMBERS below

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name); //object ka name
        System.out.println(this.age);//object ka age
    }

    //3 TYPES OF CONSTRUCTOR

    //1-->NORMAL CONSTRUCTOR
    // Student(){
    //     System.out.println("constructor called");
    // }

    //2-->PARAMETERIZED CONSTRUCTOR
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    //3-->COPY CONSTRUCTOR
    //s1 ki properties s2 mein copy
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}

public class oops {
    public static void main(String[] args) {
        //OBJECT CREATION OF PEN

        //NEW keyword use krke memory mein us object ke liye jagah store ho jaaegi
        //pen() function jaisa lg rha hai it is a CONSTRUCTOR
        //constructor are used to create object
        //constructor kuch return nhi krta
        //ek object ke liye constructor ek hi baar call ho skta hai create krne ke dauran
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();



        //student() is a constructor
        // Student s1 = new Student("aman",24);
        //inhe parameterized constructor mein directly call kr skte hai

        //COPY CONSTRUCTOR
        Student s1 = new Student();
         s1.name= "harsh";
         s1.age= 22;

         Student s2 = new Student(s1);

        s1.printInfo();
    }
    
}
