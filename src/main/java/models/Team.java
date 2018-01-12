package models;

import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private static ArrayList<Team> instances = new ArrayList<Team>();
    private int id;

    public Team(String name, String description) {
        this.name = name;
        this.description = description;
        instances.add(this);
        id = instances.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


}


