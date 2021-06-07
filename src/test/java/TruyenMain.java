import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.UUID;

public class TruyenMain {
    public static WebDriver driver;
    public static NewAccount n;
    public static FundTransfer fundTransfer;
    public static NewCustomer newCustomer;

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

        n = new NewAccount(driver);
        fundTransfer = new FundTransfer(driver);
        newCustomer = new NewCustomer(driver);
        HashMap<String , String> h = new HashMap<>();
        newCustomer.newuser().click();
        newCustomer.usename().sendKeys("guygyugug");
        newCustomer.female().click();
        Thread.sleep(1000);
        newCustomer.dob().sendKeys("03132019");
        newCustomer.address().sendKeys("jhdjfhbvdfdf");
        newCustomer.city().sendKeys("djvvf");
        newCustomer.state().sendKeys("fhvbvf");
        newCustomer.pin().sendKeys("123456");
        newCustomer.mob().sendKeys("1234567899");
        newCustomer.emailid().sendKeys(UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com");
        newCustomer.custpass().sendKeys("hbfsd");
        newCustomer.submit().click();
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        TruyenMain truyenMain = new TruyenMain();
        truyenMain.setup();
    }
}
