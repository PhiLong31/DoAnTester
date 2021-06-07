import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_02_deposit extends LeMain{

    public TS_02_deposit() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_008")
    public void TC_08(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("");
        deposit.getAmmount().sendKeys("");
        deposit.getDesc().sendKeys("");
        deposit.getReset().click();
    }
    @Test
    @DisplayName("TC_009")
    public void TC_09(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getReset().click();
    }
    @Test
    @DisplayName("TC_010")
    public void TC_010(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("");
        deposit.getReset().click();
    }
    @Test
    @DisplayName("TC_011")
    public void TC_011(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getReset().click();
    }
}
