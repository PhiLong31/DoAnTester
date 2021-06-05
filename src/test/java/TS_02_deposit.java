public class TS_02_deposit {
    private Deposit deposit;

    public TS_02_deposit(Deposit deposit) {
        this.deposit = deposit;
    }
    public void TC_08(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("");
        deposit.getAmmount().sendKeys("");
        deposit.getDesc().sendKeys("");
        deposit.getReset().click();
    }

    public void TC_09(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getReset().click();
    }

    public void TC_(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("93263");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("");
        deposit.getReset().click();
    }

    public void TC_011(){
        deposit.getDeposit().click();
        deposit.getAccountno().sendKeys("");
        deposit.getAmmount().sendKeys("70000");
        deposit.getDesc().sendKeys("guithem");
        deposit.getReset().click();
    }
}
