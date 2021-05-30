public class TS_01_fundtransfer {
    private FundTransfer f;

    public TS_01_fundtransfer(FundTransfer f) {
        this.f = f;
    }

    public void TC_001(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys(payersAcc);
        f.payeesAcc().sendKeys(payeesAcc);
        f.ammount().sendKeys("10000");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_002(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys(payersAcc);
        f.payeesAcc().sendKeys(payeesAcc);
        f.ammount().sendKeys("999999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_003(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("932");
        f.payeesAcc().sendKeys("9326");
        f.ammount().sendKeys("9999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_004(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys(payersAcc);
        f.payeesAcc().sendKeys("9326");
        f.ammount().sendKeys("999999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_005(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("9325");
        f.payeesAcc().sendKeys("93269");
        f.ammount().sendKeys("99999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_006(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("9325");
        f.payeesAcc().sendKeys("9326");
        f.ammount().sendKeys("999999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_007(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("9326");
        f.ammount().sendKeys("99999999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_008(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("9325");
        f.payeesAcc().sendKeys("93269");
        f.ammount().sendKeys("99999999");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_009(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("");
        f.payeesAcc().sendKeys("");
        f.ammount().sendKeys("10000");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_010(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("");
        f.payeesAcc().sendKeys("");
        f.ammount().sendKeys("");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_011(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("");
        f.payeesAcc().sendKeys("93269");
        f.ammount().sendKeys("200000");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_012(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("");
        f.ammount().sendKeys("200000");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_013(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("93269");
        f.ammount().sendKeys("");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_014(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("93269");
        f.ammount().sendKeys("100000");
        f.desc().sendKeys("");
        f.submit().click();
    }

    public void TC_015(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("adsasd");
        f.ammount().sendKeys("100000");
        f.desc().sendKeys("Gui");
        f.submit().click();
    }

    public void TC_016(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("asdas");
        f.payeesAcc().sendKeys("93279");
        f.ammount().sendKeys("100000");
        f.desc().sendKeys("gui");
        f.submit().click();
    }

    public void TC_017(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("asad");
        f.payeesAcc().sendKeys("&133");
        f.ammount().sendKeys("100000");
        f.desc().sendKeys("gui");
        f.submit().click();
    }

    public void TC_018(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("93268");
        f.ammount().sendKeys("@133kh");
        f.desc().sendKeys("gui");
        f.submit().click();
    }
}
