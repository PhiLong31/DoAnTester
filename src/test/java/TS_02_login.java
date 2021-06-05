public class TS_02_login {
    private Account account;

    public TS_02_login(Account account) {
        this.account = account;
    }

    public void TC_07(){
        account.username().sendKeys("mngr330903");
        account.password().sendKeys("zYhutez");
        account.login().click();
    }
}
