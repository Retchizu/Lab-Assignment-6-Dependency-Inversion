package dependencyinversion;

public class Thesis implements Resource{
    private String thesisTitle;

    public Thesis(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void borrow() {
        System.out.println("A student borrowed a thesis titled "+ thesisTitle);
    }


    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }
}
