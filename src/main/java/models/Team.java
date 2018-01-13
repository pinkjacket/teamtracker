package models;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String description;
    private static ArrayList<Team> instances = new ArrayList<>();
    private int id;
    private List<String> members;

    public Team(String name, String description, String members) {
        this.name = name;
        this.description = description;
        instances.add(this);
        id = instances.size();
        this.members = peopleNames(members);
    }

    private List<String> peopleNames(String names){
        String[] allNames = names.split(", ");
        List<String> teamNames = new ArrayList<>();
        for (String name: allNames){
            teamNames.add(name);
        }
        return teamNames;
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

    public static ArrayList<Team> getAll() {
        return instances;
    }

    public static void empty() {
        instances.clear();
    }

    public static Team find(int id) {
        return instances.get(id -1);
    }

    public List<String> getMembers() {
       return members;
    }


    public void updateName(String name) {
        this.name = name;
    }

}


