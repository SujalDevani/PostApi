package com.example.postapi;

public class PostData {

    String id,createAt;

    public PostData(String id, String createAt) {
        this.id = id;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}