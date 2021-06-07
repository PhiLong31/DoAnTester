import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_01_deposit extends LeMain{

    public TS_01_deposit() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_001")
    public void TC_01(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    @Test
    @DisplayName("TC_002")
    public void TC_02() {
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("9326");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    @Test
    @DisplayName("TC_003")
    public void TC_03(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("0");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    @Test
    @DisplayName("TC_004")
    public void TC_04(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("");
        deposit.getAccSubmit().click();
    }

    @Test
    @DisplayName("TC_005")
    public void TC_05(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    @Test
    @DisplayName("TC_006")
    public void TC_06(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    @Test
    @DisplayName("TC_007")
    public void TC_07(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("adkn2");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }
}
