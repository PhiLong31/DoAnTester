import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TS_01_fundtransfer extends TruyenMain{

    public TS_01_fundtransfer() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_001")
    public void TC_001(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys(payersAcc);
        fundTransfer.payeesAcc().sendKeys(payeesAcc);
        fundTransfer.ammount().sendKeys("10000");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_002")
    public void TC_002(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys(payersAcc);
        fundTransfer.payeesAcc().sendKeys(payeesAcc);
        fundTransfer.ammount().sendKeys("9999999999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_003")
    public void TC_003(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("932");
        fundTransfer.payeesAcc().sendKeys("9326");
        fundTransfer.ammount().sendKeys("9999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_004")
    public void TC_004(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys(payersAcc);
        fundTransfer.payeesAcc().sendKeys("9326");
        fundTransfer.ammount().sendKeys("999999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_005")
    public void TC_005(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("9325");
        fundTransfer.payeesAcc().sendKeys("93269");
        fundTransfer.ammount().sendKeys("99999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_006")
    public void TC_006(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("9325");
        fundTransfer.payeesAcc().sendKeys("9326");
        fundTransfer.ammount().sendKeys("999999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_007")
    public void TC_007(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("9326");
        fundTransfer.ammount().sendKeys("99999999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_008")
    public void TC_008(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("9325");
        fundTransfer.payeesAcc().sendKeys("93269");
        fundTransfer.ammount().sendKeys("99999999");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_009")
    public void TC_009(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("");
        fundTransfer.payeesAcc().sendKeys("");
        fundTransfer.ammount().sendKeys("10000");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_010")
    public void TC_010(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("");
        fundTransfer.payeesAcc().sendKeys("");
        fundTransfer.ammount().sendKeys("");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_011")
    public void TC_011(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("");
        fundTransfer.payeesAcc().sendKeys("93269");
        fundTransfer.ammount().sendKeys("200000");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_012")
    public void TC_012(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("");
        fundTransfer.ammount().sendKeys("200000");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_013")
    public void TC_013(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("93269");
        fundTransfer.ammount().sendKeys("");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_014")
    public void TC_014(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("93269");
        fundTransfer.ammount().sendKeys("100000");
        fundTransfer.desc().sendKeys("");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_015")
    public void TC_015(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("adsasd");
        fundTransfer.ammount().sendKeys("100000");
        fundTransfer.desc().sendKeys("Gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_016")
    public void TC_016(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("asdas");
        fundTransfer.payeesAcc().sendKeys("93279");
        fundTransfer.ammount().sendKeys("100000");
        fundTransfer.desc().sendKeys("gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_017")
    public void TC_017(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("asad");
        fundTransfer.payeesAcc().sendKeys("&133");
        fundTransfer.ammount().sendKeys("100000");
        fundTransfer.desc().sendKeys("gui");
        fundTransfer.submit().click();
    }
    @Test
    @DisplayName("TC_018")
    public void TC_018(String payersAcc, String payeesAcc) {
        fundTransfer.fundTrans().click();
        fundTransfer.payersAcc().sendKeys("93268");
        fundTransfer.payeesAcc().sendKeys("93268");
        fundTransfer.ammount().sendKeys("@133kh");
        fundTransfer.desc().sendKeys("gui");
        fundTransfer.submit().click();
    }
}
