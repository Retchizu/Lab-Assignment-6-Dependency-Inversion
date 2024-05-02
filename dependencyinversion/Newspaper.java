package dependencyinversion;

public class Newspaper implements Resource{
    private String newsProviderName;

    public Newspaper(String newsProviderName) {
        this.newsProviderName = newsProviderName;
    }

    @Override
    public void borrow() {
        System.out.println("A student borrowed a " + newsProviderName +" newspaper");
    }



    //getters and setters

    public String getNewsProviderName() {
        return newsProviderName;
    }

    public void setNewsProviderName(String newsProviderName) {
        this.newsProviderName = newsProviderName;
    }
}
