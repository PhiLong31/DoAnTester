import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Select;

public class TS_01_newaccount extends TruyenMain{

    public TS_01_newaccount() throws InterruptedException {
        setup();
    }

    @Test
    @DisplayName("TC_001")
    public void TC_001(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("15000000");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_001:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_002")
    public void TC_002(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_002:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_003")
    public void TC_003(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("1244adc");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_003:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_004")
    public void TC_004(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("123@23");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_004:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_005")
    public void TC_005(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("123$78");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_005:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_006")
    public void TC_006(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("achhnc");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_006:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_007")
    public void TC_007(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_007:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_008")
    public void TC_008(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("25681");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("44787*4");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_008:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_009")
    public void TC_009(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("adkjh");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_009:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_010")
    public void TC_010(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("jahcj");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_010:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_011")
    public void TC_011(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("109000");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_011:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_012")
    public void TC_012(String customerId){
        n.newAcc().click();
        n.custID().sendKeys("245");
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("109000");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_012:" + accountId + availBal);
    }

    @Test
    @DisplayName("TC_017")
    public void TC_017(String customerId){
        n.newAcc().click();
        n.custID().sendKeys(customerId);
        Select acc = new Select(n.accType());
        acc.selectByVisibleText("Saving");
        n.iniDeposit().sendKeys("400");
        n.submit().click();
        String accountId =  n.accID().getText();
        String availBal = n.availBal().getText();
        System.out.println("TS_001:" + accountId + availBal);
    }

}
