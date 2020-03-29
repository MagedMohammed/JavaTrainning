
import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magedomar
 */
public class javaapplicationMainClass {
String name = "Maged";
int age;
Human nam;
    /**
     * @param args the command line arguments
     */
public javaapplicationMainClass(int age){
System.out.println(age);
}

void maged(){
    this.age = 30;
    System.out.println("name");
}

    public static void main(String[] args) {
        // TODO code application logic here
        javaapplicationMainClass myClass = new javaapplicationMainClass(15);
        myClass.maged();
System.out.println("Hello From Java");
System.err.println("Hello From Java");

    }
    
}


class Human{


}