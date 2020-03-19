package BiasedAI.Repository;

import BiasedAI.Context.Interfaces.IPersonContext;
import BiasedAI.Models.Person;

public class PersonRepository {

    private IPersonContext context;

    public PersonRepository(IPersonContext context) {
        this.context = context;
    }

    public void createPerson(Person person){
        this.context.createPerson(person);
    }

    public Person getPerson()
    {
        return this.context.getPerson();
    }

}
