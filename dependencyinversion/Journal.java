package dependencyinversion;

public class Journal implements Resource{
    private String journalTitle;

    public Journal(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    @Override
    public void borrow() {
        System.out.println("A student borrowed a journal named "+ journalTitle);
    }


    //getters and setters

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }
}
