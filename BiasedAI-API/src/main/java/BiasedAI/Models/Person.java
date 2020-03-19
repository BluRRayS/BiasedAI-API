package BiasedAI.Models;

import BiasedAI.Enums.Gender;

public class Person {
    public Person() {
    }

    public Person(Gender gender, String age) {
        this.gender = gender;
        this.age = age;
    }

    private Gender gender;
    private String age;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
