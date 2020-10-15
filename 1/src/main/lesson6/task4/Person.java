package main.lesson6.task4;

public class Person {
    private String firstName;
    private String lastName;
    private IdentityDocument document;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IdentityDocument getDocument() {
        return document;
    }

    public void setDocument(IdentityDocument document) {
        this.document = document;
    }

    public Person random() {
        this.firstName = NameGenerator.generate();
        this.lastName = NameGenerator.generate();
        this.document = new IdentityDocument().random();
        return this;
    }
}
