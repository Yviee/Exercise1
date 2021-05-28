package at.ac.fhcampuswien;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @BeforeAll
    static void init(){}

    @BeforeEach
    void setup() {}

    @Test
    @DisplayName("Length check: too short")
    public void checkShortPassword () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("Sh0r/t"));
    }

    @Test
    @DisplayName("Length check: too long")
    public void checkLongPassword () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("thisPasswordwa@@@aaaayyyT00Long"));
    }

    @Test
    @DisplayName("Checking lower case")
    public void checkLowerCasePassword () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("lowerc@sepassword1nvalid"));
    }

    @Test
    @DisplayName("Checking upper case")
    public void checkUpperCasePassword () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("ALLCAPSP4SSWORDINV@LID"));
    }

    @Test
    @DisplayName("Checking for numbers")
    public void checkNumbers1 () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("123notCorr€ct4567"));
    }

    @Test
    @DisplayName("Checking for numbers")
    public void checkNumbers2 () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("Not@1111ow3d"));
    }

    @Test
    @DisplayName("Checking for numbers")
    public void checkNumbers3() {
        Password pw = new Password();
        assertFalse(pw.checkPassword("alsoN07A((owed456"));
    }

    @Test
    @DisplayName("Checking for special characters")
    public void checkChars1 () {
        Password pw = new Password();
        assertTrue(pw.checkPassword("Bu$y@9r06rammin6"));
    }

    @Test
    @DisplayName("Checking for special characters")
    public void checkChars2 () {
        Password pw = new Password();
        assertTrue(pw.checkPassword("()u70f!D3@$"));
    }

    @Test
    @DisplayName("Checking for special characters")
    public void checkChars3 () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("N0t@llowed."));
    }

    @Test
    @DisplayName("No input")
    public void checkInput () {
        Password pw = new Password();
        assertFalse(pw.checkPassword(""));
    }

}
