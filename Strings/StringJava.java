public class StringJava {
    public static void main(String args[]) {
        String str = new String("Anurag");
        String s = "nu";

        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));

        System.out.println(str.contains(s));
        System.out.println(str.indexOf(s));


        String s1 = "geeks";
        String s2 = s1;
        s1 = s1+"forgeeks";
        System.out.println(s1==s2);
        System.out.println(s1);

    }
}
