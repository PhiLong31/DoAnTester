import org.openqa.selenium.support.ui.Select;

public class TS_01_newaccount {
    private NewAccount n;
    private String accountId;
    private String availBal;

    public TS_01_newaccount(NewAccount n){
        this.n = n;
    }

    public void TC_001(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("15000000");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_001:" + accountId + availBal);
    }

    public void TC_002(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_002:" + accountId + availBal);
    }

    public void TC_003(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("1244adc");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_003:" + accountId + availBal);
    }

    public void TC_004(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("123@23");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_004:" + accountId + availBal);
    }

    public void TC_005(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("123$78");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_005:" + accountId + availBal);
    }

    public void TC_006(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("achhnc");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_006:" + accountId + availBal);
    }

    public void TC_007(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_007:" + accountId + availBal);
    }

    public void TC_008(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("25681");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("44787*4");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_008:" + accountId + availBal);
    }

    public void TC_009(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("adkjh");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_009:" + accountId + availBal);
    }

    public void TC_010(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("jahcj");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_010:" + accountId + availBal);
    }

    public void TC_011(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("109000");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_011:" + accountId + availBal);
    }

    public void TC_012(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("245");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("109000");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_012:" + accountId + availBal);
    }
    public void TC_017(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("400");
        n.submit().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_001:" + accountId + availBal);
    }

}
