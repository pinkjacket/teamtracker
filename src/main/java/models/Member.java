package models;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int id;
    private static List<Member> instances = new ArrayList<Member>();

    public Member (String name) {
        this.name = name;
        instances.add(this);
        id = instances.size();
    }

    public String getName() {
        return name;
    }

    public static List<Member> getAll() {
        return instances;
    }

}
