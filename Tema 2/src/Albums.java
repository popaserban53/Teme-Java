public class Albums extends Books {
    private String quality;
    public Albums(String title, Integer pages, String quality){
        super(title, pages);
        this.quality = quality;
    }

    public String getQuality() {
        return this.quality;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getPages().toString() + " " + getQuality();
    }
}
