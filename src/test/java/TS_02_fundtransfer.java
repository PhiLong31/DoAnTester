import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_02_fundtransfer extends TruyenMain{

    public TS_02_fundtransfer() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_019")
    public void TC_019(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("");
        fundTransfer.payeesAcc().sendKeys("");
        fundTransfer.ammount().sendKeys("");
        fundTransfer.desc().sendKeys("");
        fundTransfer.reset().click();
    }
    @Test
    @DisplayName("TC_020")
    public void TC_020(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("");
        fundTransfer.ammount().sendKeys("");
        fundTransfer.desc().sendKeys("");
        fundTransfer.reset().click();
    }
    @Test
    @DisplayName("TC_021")
    public void TC_021(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("93268");
        fundTransfer.ammount().sendKeys("@133kh");
        fundTransfer.desc().sendKeys("gui");
        fundTransfer.reset().click();
    }
    @Test
    @DisplayName("TC_022")
    public void TC_022(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("");
        fundTransfer.payeesAcc().sendKeys("93268");
        fundTransfer.ammount().sendKeys("");
        fundTransfer.desc().sendKeys("");
        fundTransfer.reset().click();
    }
    @Test
    @DisplayName("TC_023")
    public void TC_023(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("93268");
        fundTransfer.ammount().sendKeys("@133kh");
        fundTransfer.desc().sendKeys("");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_024")
    public void TC_024(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("93268");
        fundTransfer.ammount().sendKeys("");
        fundTransfer.desc().sendKeys("gui");
        fundTransfer.submit().click();
    }
}
