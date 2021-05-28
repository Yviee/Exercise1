package at.ac.fhcampuswien;

public class Password {

    public static boolean checkPassword(String pw) {
        String specialChars = "()#$?!%/@";
        char currentChar;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharPresent = false;

        //half-heartedly written password checker
        if (pw.length()>7 && pw.length()<26) {
            for (int i = 0; i < pw.length(); i++) {
                currentChar = pw.charAt(i);
                if (Character.isDigit(currentChar)) {
                    numberPresent = true;
                } else if (Character.isUpperCase(currentChar)) {
                    upperCasePresent = true;
                } else if (Character.isLowerCase(currentChar)) {
                    lowerCasePresent = true;
                } else if (specialChars.contains(String.valueOf(currentChar))) {
                    specialCharPresent = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

