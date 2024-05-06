package it.unife.ingsw2024.models;


public class Video {

    private String urlvideo;

    public Video() {
        // Costruttore vuoto necessario per l'utilizzo di Spring Data JPA
    }

    public Video(String urlvideo) {
        this.urlvideo = urlvideo;
    }

    // Getter e setter per url
    public String getUrl() {
        return urlvideo;
    }

    public void setUrl(String url) {
        this.urlvideo = urlvideo;
    }
}