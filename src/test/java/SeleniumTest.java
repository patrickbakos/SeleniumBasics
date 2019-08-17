import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeleniumTest {

    @Test
    void navigation() {

        Selenium selenium = new Selenium();
        assertEquals("https://www.seleniumeasy.com/test/basic-first-form-demo.html", selenium.navigation());
    }

    @Test
    void singleField() {

        Selenium selenium = new Selenium();
        assertEquals("lobab represent", selenium.singleField());
    }

    @Test
    void twoInputFields () {

        Selenium selenium = new Selenium();
        assertEquals("-7", selenium.twoInputFields());
    }

    @Test
    void checkbox () {

        Selenium selenium = new Selenium();
        assertEquals("Success - Check box is checked", selenium.checkbox());
    }

    @Test
    void selectDropdown () {

        Selenium selenium = new Selenium();
        assertEquals("Day selected :- Monday", selenium.selectDropdown());
    }

    @Test
    void radioButtons () {

        Selenium selenium = new Selenium();
        assertEquals("Sex : Female\n" +
                "Age group: 0 - 5", selenium.radioButtons());
    }
}