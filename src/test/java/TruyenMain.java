import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.UUID;

public class TruyenMain {
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

        NewAccount n = new NewAccount(driver);
        FundTransfer f = new FundTransfer(driver);
        NewCustomer c = new NewCustomer(driver);
        HashMap<String , String> h = new HashMap<>();
        c.newuser().click();
        c.usename().sendKeys("guygyugug");
        c.female().click();
        Thread.sleep(1000);
        c.dob().sendKeys("03132019");
        c.address().sendKeys("jhdjfhbvdfdf");
        c.city().sendKeys("djvvf");
        c.state().sendKeys("fhvbvf");
        c.pin().sendKeys("123456");
        c.mob().sendKeys("1234567899");
        c.emailid().sendKeys(UUID.randomUUID().toString().replace("-", "").substring(0,7)+"@gmail.com");
        c.custpass().sendKeys("hbfsd");
        c.submit().click();
        Thread.sleep(2000);

        TS_01_newaccount ts_01 = new TS_01_newaccount(n);
        ts_01.TC_001(c.custID().getText());
        TS_02_newaccount ts_02 = new TS_02_newaccount(n);
        TS_01_fundtransfer ts_01_fundtransfer = new TS_01_fundtransfer(f);
        TS_02_fundtransfer ts_02_fundtransfer = new TS_02_fundtransfer(f);
    }
}
