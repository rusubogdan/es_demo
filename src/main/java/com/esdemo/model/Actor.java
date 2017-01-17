package com.esdemo.model;

public class Actor {

    private String actorId;

    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" + "id=" + actorId + ", name='" + name + '}';
    }
}