public class TS_01_Logout {
    private Logout logout;

    public TS_01_Logout(Logout logout) {
        this.logout = logout;
    }

    public void TC_01(){
        logout.getLogout().click();
    }
}
