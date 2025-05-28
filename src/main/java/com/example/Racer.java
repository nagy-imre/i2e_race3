package com.example;

import java.time.LocalDate;

public class Racer {
    Integer id;
    String name;
    LocalDate birth;
    String category;
    Boolean absolute;
    
    public Racer() {
    }

    public Racer(String name, LocalDate birth, String category, Boolean absolute) {
        this.name = name;
        this.birth = birth;
        this.category = category;
        this.absolute = absolute;
    }

    public Racer(Integer id, String name, LocalDate birth, String category, Boolean absolute) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.category = category;
        this.absolute = absolute;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getAbsolute() {
        return absolute;
    }

    public void setAbsolute(Boolean absolute) {
        this.absolute = absolute;
    }

    
    

}
