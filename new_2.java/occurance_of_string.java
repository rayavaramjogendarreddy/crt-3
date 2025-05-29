public class occurance_of_string{
     public static void main(String[] args) {
        String s = "abbdheg";
        String v = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (v.indexOf(currentChar) == -1) { 
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("Character '" + currentChar + "' occurs " + count + " times.");
                }
                v += currentChar; 
            }
        }
    }
}