package Static;

public class Static {

    static int counter= 0;
    int a = 10;
    static int b = 20;
    static String s = "java";

    public  Static(){
        counter++;
        System.out.println(counter);
    }
    public void test1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new Static();
        new Static();
        new Static();
        new Static();









    }


}
