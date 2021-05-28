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
        assertFalse(pw.checkPassword("lowerc@sepasswordinvalid"));
    }

    @Test
    @DisplayName("Checking upper case")
    public void checkUpperCasePassword () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("ALLCAPSPASSWORDINVALID"));
    }

    @Test
    @DisplayName("Checking for numbers")
    public void checkNumbers1 () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("123456789"));
    }

    @Test
    @DisplayName("Checking for numbers")
    public void checkNumbers2 () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("NotA1111owed"));
    }

    @Test
    @DisplayName("Checking for numbers")
    public void checkNumbers () {
        Password pw = new Password();
        assertFalse(pw.checkPassword("alsoNotAllowed456"));
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
        assertFalse(pw.checkPassword("NotAllowed."));
    }

}
