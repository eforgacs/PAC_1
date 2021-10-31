package TextbookExamples;

public class Exercise_10_10_1 {


    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        if(s1 == s4){
            System.out.println("This is true");
        }
        else{
            System.out.println("This is false");
        }
        System.out.println("Welcome to Java".replace("Java", "HTML"));
        System.out.println(s1.replace("o","T"));
        System.out.println(s1.replaceAll("o","T"));
        System.out.println(s1.replaceFirst("o","T"));
        System.out.println(s1.toCharArray());
    }
}
