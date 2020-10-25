package main.lesson8.task4.entities;

import main.lesson8.task4.Validatable;
import main.lesson8.task4.ValidatorStub;

import java.util.Objects;

public abstract class Entity implements Validatable {
    private String uuid;
    private String name;

    public Entity(String name) {
        this.name = name;
        this.uuid = null;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }

}
