package BiasedAI.Context;

import BiasedAI.Context.Interfaces.IPersonContext;
import BiasedAI.Models.Person;

import java.util.ArrayList;

public class PersonMemoryContext implements IPersonContext {

    private ArrayList<Person> persons = new ArrayList<>();

    @Override
    public void createPerson(Person person) {
        if(persons.size() == 0) {
            persons.add(person);
        }
        else
        {
            persons.set(0,person);
        }
    }

    @Override
    public Person getPerson() {
        return persons.get(0);
    }
}
