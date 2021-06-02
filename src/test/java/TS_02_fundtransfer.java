public class TS_02_fundtransfer {
    private FundTransfer f;

    public TS_02_fundtransfer(FundTransfer f) {
        this.f = f;
    }

    public void TC_019(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("");
        f.payeesAcc().sendKeys("");
        f.ammount().sendKeys("");
        f.desc().sendKeys("");
        f.submit().click();
    }

    public void TC_020(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("");
        f.ammount().sendKeys("");
        f.desc().sendKeys("");
        f.submit().click();
    }

    public void TC_021(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("93268");
        f.ammount().sendKeys("@133kh");
        f.desc().sendKeys("gui");
        f.submit().click();
    }

    public void TC_022(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("");
        f.payeesAcc().sendKeys("93268");
        f.ammount().sendKeys("");
        f.desc().sendKeys("");
        f.submit().click();
    }

    public void TC_023(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("93268");
        f.ammount().sendKeys("@133kh");
        f.desc().sendKeys("");
        f.submit().click();
    }

    public void TC_024(String payersAcc, String payeesAcc) {
        f.fundTrans().click();
        f.payersAcc().sendKeys("93268");
        f.payeesAcc().sendKeys("93268");
        f.ammount().sendKeys("");
        f.desc().sendKeys("gui");
        f.submit().click();
    }
}
