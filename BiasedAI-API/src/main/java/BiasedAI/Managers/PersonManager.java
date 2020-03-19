package BiasedAI.Managers;

import BiasedAI.Models.Person;
import BiasedAI.Repository.PersonRepository;

public class PersonManager {

    private PersonRepository repository;

    public PersonManager(PersonRepository repository) {
        this.repository = repository;
    }

    public void CreatePerson(Person person) {
        this.repository.createPerson(person);
    }
    public Person getPerson(){
        return this.repository.getPerson();
    }
}
