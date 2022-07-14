package com.quintess.quintess.quintess;

public class Quintess implements Comparable<Quintess>{

    private int age;
    private String name;



    public Quintess() {
    }
    public Quintess(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Quintess(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quintess{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Quintess q){

        if(this.age != q.getAge())
            return this.age-q.getAge();
        return this.name.compareTo(q.getName());
    }
}
