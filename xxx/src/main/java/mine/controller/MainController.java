package mine.controller;

import mine.Repository.MyRepository;
import mine.dto.Request;
import mine.model.Address;
import mine.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Optional;

@RestController
public class MainController
{
    @Autowired
    MyRepository mr;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        Optional<Person> per = mr.findById(new Long(1));
        Person p = new Person();
        p.setFirstName("Marc");
        p.setLastName("Rieber");
        Address a = new Address();
        a.setStreet("Waldstr 10");
        a.setCity("Bickenbach");
        a.setZip("64404");

        Address b = new Address();
        b.setStreet("Waldstr 10");
        b.setCity("Bickenbach");
        b.setZip("64404");
        p.setAddresses(Arrays.asList(a, b));

        mr.save(p);

//        setAddress(new Address());
//        p.setFirstName("Marc");

        return "{\"id\": \"Hello World!\"}";
    }

    @PostMapping(value = "/api", consumes="application/json", produces="application/json")
    //@ResponseBody
    public Request api(@RequestBody Request r) {
        return r;
//        return "{\"id\": \"1234\",\n" +
//                "\"data\": \"xdata\"}";
        //"Hello API "+i++ +" " +r.toString() +"!";
    }
    private int i = 0;
}
