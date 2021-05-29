package at.ac.fhcampuswien;

public class Password {

    public static boolean checkPassword(String pw) {
        String specialChars = "()#$?!%/@";
        char currentChar;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharPresent = false;

        //source: https://www.baeldung.com/java-lowercase-uppercase-special-character-digit-regex
        if (pw.length()>7 && pw.length()<26) {
            for (int i = 0; i < pw.length(); i++) {
                currentChar = pw.charAt(i);
                if (Character.isDigit(currentChar)) {
                    if (i < pw.length()-2) {
                        if (Character.isDigit(currentChar) && Character.isDigit(pw.charAt(i + 1)) && Character.isDigit(pw.charAt(i + 2))) {
                            if (currentChar != '0' && ((currentChar + pw.charAt(i + 1) + pw.charAt(i + 2)) / 3 == pw.charAt(i + 1))) {
                                return false;
                            } else if (currentChar == pw.charAt(i + 1) && currentChar == pw.charAt(i + 2) && currentChar == pw.charAt(i + 3)) {
                                return false;
                            }
                        }
                    }
                    numberPresent = true;
                } else if (Character.isUpperCase(currentChar)) {
                    upperCasePresent = true;
                } else if (Character.isLowerCase(currentChar)) {
                    lowerCasePresent = true;
                } else if (specialChars.contains(String.valueOf(currentChar))) {
                    specialCharPresent = true;
                } else if (!specialChars.contains(String.valueOf(currentChar))) {
                    return false;
                }
            }
            if (numberPresent == true && upperCasePresent == true && lowerCasePresent == true && specialCharPresent == true) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}