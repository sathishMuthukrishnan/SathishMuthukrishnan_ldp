package javaconcepts.polymorphism;

class Methods{
    String name;
    int age;
    int month;
    void run(){
        System.out.println("My name is " +name + " and my age is "+ age );

    }
    int birthmonth(){
        int monthsLeft= 12 - month;
        return monthsLeft;

    }
    void talk(String text){
        System.out.println(text);
    }
    void walk(int distance){
        System.out.println("Walking distance is : " + distance + "kmh");
    }
    void Timer(int min, double seconds){
        System.out.println("Time is :" + min + "m and " + seconds + "s");
    }

}


public class Object {
    public static void main(String[] args) {
        Methods details =new Methods();
        details.name = "sathish";
        details.age = 30;
//        details.run();
        details.month =3;
        int month = details.birthmonth();
        System.out.println("My birth month is " + month );
        details.talk("Hi There");
        details.walk(12);
        details.Timer(12, 30.6);

    }

}
