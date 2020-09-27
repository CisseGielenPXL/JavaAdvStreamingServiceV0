package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little Kids",0),
    OLDER_KIDS("Older Kids: vanaf 7 jaar",7),
    TEENS("Teens: vanaf 12 jaar",12),
    MATURE("Mature: vanaf 16 jaar",16);
    private String rating;
    private int minLeeftijd;
    Rating(String rating, int minJaar){
        this.rating = rating;
        this.minLeeftijd = minJaar;
    }

    public String getDisplayName() {
        return rating;
    }

    public int getMinLeeftijd() {
        return minLeeftijd;
    }
}
