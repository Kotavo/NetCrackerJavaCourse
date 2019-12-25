package com.notnetcracker.api.controllers;

import com.notnetcracker.form.PersonForm;
import com.notnetcracker.model.Person;
import com.notnetcracker.service.PersonService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
    @Autowired
    private PersonService persons;

    private String errorMessage = "Field values is required!";

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String personList(Model model) {
        model.addAttribute("persons", persons);
        return "personList";
    }

    @RequestMapping(value = {"/addPerson"}, method = RequestMethod.GET)
    public String addPerson(Model model) {
        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);
        return "addPerson";
    }

    @RequestMapping(value = {"/addPerson"}, method = RequestMethod.POST)
    public String savePerson(Model model, @ModelAttribute("personForm") PersonForm personForm) throws IOException {
        String id = personForm.getId();
        String firstName = personForm.getFirstName();
        String lastName = personForm.getSecondName();
        String salary = personForm.getSalary();
        String mail = personForm.getMail();
        String workPlace = personForm.getWorkPlace();
        if (id != null && id.length() > 0
            &&firstName != null && firstName.length() > 0
            && lastName != null && lastName.length() > 0
            && salary != null && salary.length() > 0
            && mail != null && mail.length() > 0
            && workPlace != null && workPlace.length() > 0){
            Person newPerson = new Person(id, firstName, lastName, salary, mail, workPlace);
            persons.addPerson(newPerson);
            return "redirect:/personList";
        }
        model.addAttribute("errorMessage", errorMessage);
        return "addPerson";
    }

}
