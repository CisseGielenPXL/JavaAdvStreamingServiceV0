package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little Kids"),
    OLDER_KIDS("Older Kids: vanaf 7 jaar"),
    TEENS("Teens: vanaf 12 jaar"),
    MATURE("Mature: vanaf 16 jaar");
    private String rating;
    Rating(String rating){
        this.rating = rating;
    }

    public String getDisplayName() {
        return rating;
    }


}
