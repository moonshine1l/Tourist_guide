package ru.moonshine.tourist_guide.model;

public class Category {

    int id;
    String category;

    public Category(int id, String type) {
        this.id = id;
        this.category = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String type) {
        this.category = type;
    }
}
