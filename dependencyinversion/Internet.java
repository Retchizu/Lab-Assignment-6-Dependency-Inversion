package dependencyinversion;

public class Internet implements Resource{
    public String internetName;

    public Internet(String internetName) {
        this.internetName = internetName;
    }

    @Override
    public void borrow() {
        System.out.println("A student has been connected to "+ internetName);
    }

    //getters and setters
    public String getInternetName() {
        return internetName;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }
}
