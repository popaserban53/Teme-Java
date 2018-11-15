public class Novel extends Books {
    private String type;
    public Novel (String title, Integer pages, String type) {
        super(title, pages);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getPages().toString() + " " + getType();
    }
}
