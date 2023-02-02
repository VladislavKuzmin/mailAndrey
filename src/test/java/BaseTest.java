import Common.BasicSetting;
import Pages.PageManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;
    String urlToTest = "https://mail.ru/";
    PageManager pageManager;

    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
    }

    @BeforeEach
    public void urlMain(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(urlToTest);
        pageManager = new PageManager(driver);
    }

    @AfterEach
    public void afterEach(){
        driver.close();
    }
}