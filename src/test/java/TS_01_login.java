import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_01_login extends NhiMain {

    public TS_01_login() {
        setup();
    }

    @Test
    @DisplayName("TC_01")
    public void TC_01(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
    @Test
    @DisplayName("TC_02")
    public void TC_02(){
        account.username().sendKeys("");
        account.password().sendKeys("");
        account.login().click();
    }
    @Test
    @DisplayName("TC_0")
    public void TC_03(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("");
        account.login().click();
    }
    @Test
    @DisplayName("TC_04")
    public void TC_04(){
        account.username().sendKeys("");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
    @Test
    @DisplayName("TC_05")
    public void TC_05(){
        account.username().sendKeys("mngr");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
    @Test
    @DisplayName("TC_06")
    public void TC_06(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("1234");
        account.login().click();
    }
    @Test
    @DisplayName("TC_07")
    public void TC_07(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
}
