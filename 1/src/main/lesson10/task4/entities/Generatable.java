package main.lesson10.task4.entities;

public interface Generatable  {

    <T extends Generatable> T generate();
}
