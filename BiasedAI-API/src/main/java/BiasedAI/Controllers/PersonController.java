package BiasedAI.Controllers;

import BiasedAI.Enums.Gender;
import BiasedAI.Managers.PersonManager;
import BiasedAI.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class PersonController {
    @Autowired
    private PersonManager personManager;

    @GetMapping("/GetPerson")
    public ResponseEntity<Person> GetPerson()
    {
        try{
            Person person = personManager.getPerson();
            return ResponseEntity.ok(person);
        }
        catch (Exception e)
        {
            return ResponseEntity.ok(new Person());
        }

    }
}
