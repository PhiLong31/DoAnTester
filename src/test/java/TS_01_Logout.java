import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_01_Logout extends LongMain{

    public TS_01_Logout() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_01")
    public void TC_01(){
        logout.getLogout().click();
    }
}
