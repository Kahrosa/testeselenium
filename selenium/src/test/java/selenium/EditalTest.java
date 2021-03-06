// Generated by Selenium IDE//

package selenium;

import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Class EditalTest
public class EditalTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        EditalTest.driver = new FirefoxDriver();
    }

    @AfterAll
    public static void tearDown() {
        EditalTest.driver.quit();
    }
    @Test
    public void edital() {
        EditalTest.driver.get("https://ifrs.edu.br/");
        EditalTest.driver.manage().window().setSize(new Dimension(1366, 731));
        EditalTest.driver.findElement(By.linkText("Editais")).click(); {
            List < WebElement > elements = EditalTest.driver.findElements(By.cssSelector(".editais__title"));
            assert elements.size() > 0;
        }
    }
}