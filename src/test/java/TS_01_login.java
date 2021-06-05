public class TS_01_login {
    private Account account;

    public TS_01_login(Account account) {
        this.account = account;
    }

    public void TC_01(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }

    public void TC_02(){
        account.username().sendKeys("");
        account.password().sendKeys("");
        account.login().click();
    }

    public void TC_03(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("");
        account.login().click();
    }

    public void TC_04(){
        account.username().sendKeys("");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }

    public void TC_05(){
        account.username().sendKeys("mngr");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }

    public void TC_06(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("1234");
        account.login().click();
    }

    public void TC_07(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
}
