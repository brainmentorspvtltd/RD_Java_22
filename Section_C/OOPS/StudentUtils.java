package OOPS;

public class StudentUtils {
    public String formatName(String name) {
        String []nameArr = name.split(" ");
        String fullName = "";
        for(String n : nameArr) {
            char firstChar = n.charAt(0);
            String firstLetter = String.valueOf(firstChar).toUpperCase();
            String remainingString = n.substring(1).toLowerCase();
            fullName += firstLetter + remainingString + " ";
        }
        
        return fullName;
    }
}
