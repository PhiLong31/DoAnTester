import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeMain {
    private static WebDriver driver;
    public static NewCustomer newCustomer;
    public static Deposit deposit;

    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");

        String username = "mngr328490";
        String userpass = "Aqahusy";
        Account account = new Account(driver);
        account.username().sendKeys(username);
        account.password().sendKeys(userpass);
        account.login().click();
        Thread.sleep(2000);

        newCustomer = new NewCustomer(driver);
        deposit = new Deposit(driver);
    }

    public static void main(String[] args) throws InterruptedException {
        LeMain leMain = new LeMain();
        leMain.setup();
    }
}
