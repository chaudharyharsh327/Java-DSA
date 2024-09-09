//EK CLASS DOOSRI CLASS KI PROPERTIES METHODS INHERIT KRTI HAI 
// //THAT IS CALLED INHERITANCE

// class Shape{
//     String color;
// }
// class Triangle extends Shape{
// }
// public class inheritance {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         //TRAINGLE KE T1 KE PAAS COLOR NHI THA 
//         //USNE SHAPE WALI CLASS SE IMHERIT KIA
//         t1.color = "red";
//     }
// }
//4 TYPES OF INHERITANCE
//1--> SINGLE LEVEL INHERTIANCE
class Shape {

    public void area() {
        System.out.println("displays area");
    }

}

class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

//2-->MULTI LEVEL INHERTIANCE
class EquilateralTriangle extends Triangle {

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

//3->HIERARCHIAL INHERTIANCE
//TRIANGLE CLASS KI BASE CLASS IS SHAPE CLASS
//EQUILATERAL TRIANGLE CLASS BHI BASE CLASS IS SHAPE CLASS
//CIRCLE CLASS KI BASE CLASS BHI SHAPE CLASS
class Circle extends Shape {

    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

//4-->HYBRID INHERTIANCE
//KAHI PE SINGLE KAHI PE MULTI LEVEL KAHI PE HEIRACHIAL INHERITANCE

public class inheritance {

    public static void main(String[] args) {

    }
}
