package BiasedAI.Models;

import BiasedAI.Enums.Gender;

public class Person {
    public Person() {
    }

    public Person(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    private Gender gender;
    private int age;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
