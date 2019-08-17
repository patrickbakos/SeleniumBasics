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
}