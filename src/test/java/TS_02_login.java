import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_02_login extends NhiMain{

    public TS_02_login() {
        setup();
    }

    @Test
    @DisplayName("TC_07")
    public void TC_07(){
        setup();
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
}
