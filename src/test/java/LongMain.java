import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LongMain {
    private static WebDriver driver;
    protected static Account account;
    protected static CustomizedStatement customizedStatement;
    protected static Logout logout;

    public void setup() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");

        String username = "mngr328490";
        String userpass = "Aqahusy";
        account = new Account(driver);
        account.username().sendKeys(username);
        account.password().sendKeys(userpass);
        account.login().click();
        Thread.sleep(2000);
        //Test custom
        customizedStatement = new CustomizedStatement(driver);
        logout = new Logout(driver);
    }

    public static void main(String[] args) throws InterruptedException {
        LongMain longMain = new LongMain();
        longMain.setup();
    }
}
