public class TS_01_deposit {
    private Deposit deposit;

    public TS_01_deposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public void TC_01(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    public void TC_02(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("9326");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    public void TC_03(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("0");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    public void TC_04(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("");
        deposit.getAccSubmit().click();
    }

    public void TC_05(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    public void TC_06(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }

    public void TC_07(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("adkn2");
        deposit.getDesc().sendKeys("guithem");
        deposit.getAccSubmit().click();
    }
}
