package com.notnetcracker.api.controllers;

import com.notnetcracker.service.PersonService;
import java.io.IOException;
import com.notnetcracker.form.PersonForm;
import com.notnetcracker.model.Person;
import java.util.List;
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

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String personList(Model model) {
        model.addAttribute("persons", persons.getPersonList());
        return "personList";
    }

    @RequestMapping(value = {"/findPerson"}, method = RequestMethod.GET)
    public String findPerson(Model model){
        PersonForm findPersonForm = new PersonForm();
        model.addAttribute("findPersonForm",findPersonForm);
        return "findPerson";
    }

    @RequestMapping(value = {"/findPerson"}, method = RequestMethod.POST)
    public String findPerson(Model model, @ModelAttribute("findPersonForm") PersonForm findPersonForm){
        if(findPersonForm.getFirstName() != null && findPersonForm.getFirstName().length() > 0
           && findPersonForm.getSecondName() != null && findPersonForm.getSecondName().length() > 0 ){
            return "findPersonResult";
        }
        model.addAttribute("errorMessage", errorMessage);
        return "findPerson";
    }


    // К сожалению, я пока не смог разобраться, почему Лист с схожденями нормально не мапится на findPersonResult.html
    // Буду благодарен за любую подсказку )

    @RequestMapping(value = {"/findPersonResult"}, method = RequestMethod.GET)
    public String findPersonResult(Model model, @ModelAttribute("findPersonForm") PersonForm findPersonForm){
        if (persons.findByName(findPersonForm.getFirstName(),findPersonForm.getSecondName()).get(0) == null){
            return "personNotFound";
      }
        model.addAttribute("findPersons", persons.findByName(findPersonForm.getFirstName(),findPersonForm.getSecondName()));

        return "findPersonResult";
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
        String secondName = personForm.getSecondName();
        String salary = personForm.getSalary();
        String mail = personForm.getMail();
        String workPlace = personForm.getWorkPlace();
        if (id != null && id.length() > 0
            &&firstName != null && firstName.length() > 0
            && secondName != null && secondName.length() > 0
            && salary != null && salary.length() > 0
            && mail != null && mail.length() > 0
            && workPlace != null && workPlace.length() > 0){
            Person newPerson = new Person(id, firstName, secondName, salary, mail, workPlace);
            persons.addPerson(newPerson);
            return "redirect:/personList";
        }
        model.addAttribute("errorMessage", errorMessage);
        return "addPerson";
    }

}
