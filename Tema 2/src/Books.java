public class Books {
    private String title;
    private Integer pages;
    public Books(String title, Integer pages) {
        this.title = title;
        this.pages = pages;
    }
    public String getTitle() {
        return this.title;
    }
    public Integer getPages() {
        return this.pages;
    }
    @Override
    public String toString() {
        return title + " " + pages.toString();
    }
}
