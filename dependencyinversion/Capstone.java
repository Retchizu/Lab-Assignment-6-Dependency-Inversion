package dependencyinversion;

public class Capstone implements Resource {
    private String capstoneTitle;

    public Capstone(String capstoneTitle) {
        this.capstoneTitle = capstoneTitle;
    }

    @Override
    public void borrow() {
        System.out.println("A student borrowed a capstone named " + capstoneTitle);
    }

    //getters and setters

    public String getCapstoneTitle() {
        return capstoneTitle;
    }

    public void setCapstoneTitle(String capstoneTitle) {
        this.capstoneTitle = capstoneTitle;
    }
}
