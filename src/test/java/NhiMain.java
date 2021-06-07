import org.openqa.selenium.chrome.ChromeDriver;

public class NhiMain {
    public static ChromeDriver driver;
    public static Account account;

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        account = new Account(driver);

    }

    public static void main(String[] args) {
        NhiMain nhiMain = new NhiMain();
        nhiMain.setup();
    }
}
