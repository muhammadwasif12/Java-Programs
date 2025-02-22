public class Tut_14_StringsMethods {
    public static void main(String[] args) {
        String name = "WASif"; // this string not change.
        // int value =name.length();
        // System.out.println(value);//it display the number of char lenght in string.
        String lcasestring = name.toLowerCase(); // it converts all string into lower case.
        String ucasestring = name.toUpperCase(); // it coverts all string into uper case.
        // System.out.println(lcasestring);
        // System.out.println(ucasestring);
        String s1 = "    hello    ";
        String trimString = s1.trim(); // it trims string spaces.
        // System.out.println(s1);
        // System.out.println(trimString);
        // System.out.println(name.substring(2));//it display string from index 2.
        // System.out.println(name.substring(2, 4)); //here we enter starting and ending
        // index.
        // System.out.println(name.charAt(3)); //it display char that we enter its
        // index.
        String modifyname = "Khizer";
        // System.out.println(modifyname.indexOf("er",3)); //find char from specific
        // index.
        // System.out.println(modifyname.replace(name, modifyname));//here we replace
        // System.out.println(name.replace("was", "khi"));
        // System.out.println(name.lastIndexOf("AS",4)); //it search string from 4
        // index.
        System.out.println(modifyname.equals("wasif"));// it is false
        System.out.println(name.equalsIgnoreCase("wasif")); // it is true
    }

}
