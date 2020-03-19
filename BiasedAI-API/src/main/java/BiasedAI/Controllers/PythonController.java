package BiasedAI.Controllers;

import BiasedAI.Enums.Gender;
import BiasedAI.Managers.PersonManager;
import BiasedAI.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PythonController {

    @Autowired
    private PersonManager personManager;

    @RequestMapping(value = "/PersonData", method = RequestMethod.POST)
    public ResponseEntity<String> PersonData(@RequestParam int age, @RequestParam String gender)
    {
        try{
            Person person = new Person(Gender.valueOf(gender),age);
            personManager.CreatePerson(person);
            return ResponseEntity.ok("Successfully created person!");
        }
        catch (Exception e)
        {
            return ResponseEntity.ok("Error!");
        }

    }

}
