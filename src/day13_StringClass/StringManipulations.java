package day13_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(5);
        System.out.println(ch1);

        System.out.println(ch1 == 'A');
        //                 't'    'A' ===> false

        System.out.println(ch1 == 'T');
        //                 't'    'T' ===> false


        int totalLength = str.length();
        System.out.println(totalLength);

        System.out.println(totalLength > 250);  // false

        String str2 = "Today is great day, Java is fun";
        int maxIndexNum = str2.length()-1;
        System.out.println(maxIndexNum);


        String s1 = "Cybertek";
               s1 = s1.concat(" School");    // "Cybertek School"
        System.out.println(s1);    // s1 = Cybertek School


        String s2 = "Java";
        System.out.println(s2.concat(" is a programing language")); // Java is a programing language
        System.out.println(s2);     // java

        s2 = s2.concat(" is a programing language");
        System.out.println(s2);   // Java is a programing language

        String r1 = "Java is fun";
               r1 = r1.concat(", and it's easy");
        System.out.println(r1);

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        String A1 = "        Today is a great day          ";
        A1 = A1.trim();
        System.out.println(A1);


    }
}
