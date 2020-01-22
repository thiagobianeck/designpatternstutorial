package br.com.bianeck.creational.prototype.caso4;

public class Movie implements PrototypeCapable{

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie object");
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
