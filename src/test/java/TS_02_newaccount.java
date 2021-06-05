import org.openqa.selenium.support.ui.Select;

public class TS_02_newaccount {
    private NewAccount n;
    private String accountId;
    private String availBal;

    public TS_02_newaccount(NewAccount n){
        this.n = n;
    }

    public void TC_013(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.reset().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_013:" + accountId + availBal);
    }

    public void TC_014(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("134");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("2456");
        n.reset().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_014:" + accountId + availBal);
    }

    public void TC_015(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("134");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.reset().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_015:" + accountId + availBal);
    }

    public void TC_016(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("135788");
        n.reset().click();
        accountId =  n.accID().getText();
        availBal = n.availBal().getText();
        System.out.println("TS_016:" + accountId + availBal);
    }
}
