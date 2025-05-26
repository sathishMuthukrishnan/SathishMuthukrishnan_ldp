package javaconcepts;

class Program{
int value;
String text;
public Program(){
    this(13,"Hii");
    System.out.println("First constructor");
        value = 12;

}
public Program(int value){
this.value = value;
System.out.println("Second javaconcepts.javaconcepts.polymorphism.polymorphism.Constructor");

}
public Program(int value,String text){
    this(12);
    System.out.println("Third javaconcepts.javaconcepts.polymorphism.polymorphism.Constructor");


}


}


public class Constructor {
    public static void main(String[] args) {

        Program MyProgram = new Program();
        Program MyProgram1= new Program(12);
        Program MyProgram2= new Program(13, "Hi");
    }


}
