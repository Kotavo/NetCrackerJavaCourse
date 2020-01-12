package com.notnetcracker.api.controllers;

import com.notnetcracker.form.FindPersonForm;
import com.notnetcracker.form.PersonForm;
import com.notnetcracker.model.Person;
import com.notnetcracker.service.PersonService;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

    @Autowired
    private PersonService persons ;

    private String errorMessage = "Field values is required!";

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

/*    @RequestMapping(value = {"/index"}, method = RequestMethod.POST)
    public String index() {
        persons.addPersonList(persons.readObjectFile());
        return "redirect:/personList";
    }*/

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String personList(Model model) {
        model.addAttribute("persons", persons.getPersonList());
        //  model.addAttribute("persons",  persons.findByName("a","a"));
        return "personList";
    }

    @RequestMapping(value = {"/findPerson"}, method = RequestMethod.GET)
    public String findPerson(Model model){
        FindPersonForm findPersonForm = new FindPersonForm();
        model.addAttribute("findPersonForm",findPersonForm);
        return "findPerson";
    }

    @RequestMapping(value = {"/findPerson"}, method = RequestMethod.POST)
    public String findPerson(Model model, @ModelAttribute("findPersonForm") FindPersonForm findPersonForm, HttpServletRequest request){

        String fName = findPersonForm.getFirstName();
        String sName = findPersonForm.getSecondName();
        if(fName != null && fName.length() > 0
           && sName !=null && sName.length() > 0){
            request.getSession().setAttribute("fName", fName);
            request.getSession().setAttribute("sName", sName);
            return "redirect:/findPersonResult";
        }
        model.addAttribute("errorMessage", errorMessage);
        return "findPerson";
    }

    @RequestMapping(value = {"/findPersonResult"}, method = RequestMethod.GET)
    public String findPersonResult(Model model,HttpServletRequest request, @RequestHeader(value="User-Agent") String userAgent ){
        HttpSession session = request.getSession(true);
        String fName = (String) request.getSession().getAttribute("fName");
        String sName = (String) request.getSession().getAttribute("sName");
        Date lastAccessedTime = new Date(session.getLastAccessedTime());
        String accessedDate = ("Date: " + lastAccessedTime);
        String browserInfo = ("Browser:  " + userAgent);
        if(persons.findByName(fName,sName).isEmpty()){
            return "personNotFound";
        }
        model.addAttribute("foundPersons",persons.findByName(fName,sName));
        model.addAttribute("accessedTime", accessedDate);
        model.addAttribute("browserInfo", browserInfo);
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
            persons.writeInObjectFile(newPerson);
            return "redirect:/personList";

        }
        model.addAttribute("errorMessage", errorMessage);
        return "addPerson";
    }
}
