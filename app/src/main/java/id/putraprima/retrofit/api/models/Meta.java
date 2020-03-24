package id.putraprima.retrofit.api.models;

public class Meta {
    public int current_page;
    public int from;
    public String path;
    public int per_page;
    public int to;

    public Meta(int current_page, int from, String path, int per_page, int to) {
        this.current_page = current_page;
        this.from = from;
        this.path = path;
        this.per_page = per_page;
        this.to = to;
    }

    public Meta() {
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
