package Java_Education.day27_immutableAndDateTime;

public class EN_C03_StringPool {
    public static void main(String[] args) {

        String str1 = "Java_Education";
        String str2 = "Java_Education";

        String str3 = new String("Java_Education");

        String str4 ="";
        str4 = str4.concat("Java_Education");

        String str5 = "Ja";
        str5=str5.concat("va");


        System.out.println(str1.equals(str2));  //true
        System.out.println(str1==str2);  //true
        System.out.println("----");
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1==str3); // false
        System.out.println("----");
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1==str4); // false
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1==str5); // false

    }
}
