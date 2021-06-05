import org.openqa.selenium.chrome.ChromeDriver;

public class LongMain {
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
        //Test custom
        CustomizedStatement customizedStatement = new CustomizedStatement(driver);
        TS_01_customizedstatement ts_01_customizedstatement = new TS_01_customizedstatement(customizedStatement);
        ts_01_customizedstatement.TC_006();
        //Test logout
        Logout logout = new Logout(driver);
        TS_01_Logout t = new TS_01_Logout(logout);
        t.TC_01();
    }
}
