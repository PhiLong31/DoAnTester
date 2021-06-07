import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class LeMain {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");

        String username = "mngr328490";
        String userpass = "Aqahusy";
        Account account = new Account(driver);
        account.username().sendKeys(username);
        account.password().sendKeys(userpass);
        account.login().click();
        Thread.sleep(2000);

        String emailId = UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com";
        NewCustomer customer = new NewCustomer(driver);
        TS_01_newcustomer ts1 = new TS_01_newcustomer(customer);
        ts1.TC_001(emailId);
    }
}
