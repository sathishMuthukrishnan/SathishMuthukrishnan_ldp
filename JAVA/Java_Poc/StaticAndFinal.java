package javaconcepts;

class Programs{
    public String text;
    public static String firstclass;

    public void studentName(){
        System.out.println(text  + firstclass );

    }
}


public class StaticAndFinal {
    public static void main(String[] args) {
    Programs.firstclass = "First String";
    System.out.println(Programs.firstclass);
    }
}
