package ie.bookeo.models;

import android.os.StrictMode;

public class MediaUpload {

    private String name;
    private String imageUrl;

    public MediaUpload(){

    }

    public MediaUpload(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
