package com.notnetcracker.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.notnetcracker.model.Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private static List<Person> personList = new ArrayList<>();

    public PersonService() {
        personList.addAll(readObjectFile());
    }

    private int getCurrentSize() {
        return personList.size();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void addPersonList(List<Person> people){
        personList.addAll(people);
    }

    public Person findPerson(int id) {
        if (id > getCurrentSize())
            return null;
        else
            return personList.get(id);
    }

    public List<Person> findByName(String firstName, String secondName) {
        List<Person> personList1 = new ArrayList<>();
        for (Person person : personList) {
            if (firstName.equals(person.getFirstName()) && secondName.equals(person.getSecondName())) {
                personList1.add(person);
            }
        }
        return personList1;
    }

    public void removePerson(int id) {
        personList.remove(id);
    }

    public Person replacePerson(int id, Person person) {
        if (id > getCurrentSize()) {
            return null;
        } else {
            personList.add(id, person);
            return person;
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }


        public void writeInObjectFile(Person person) throws IOException{
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/userfiles/PersonOfList.json");
        BufferedWriter bfw = new BufferedWriter(new FileWriter(file, true));
        Map<String,Object> tempPerson = new HashMap<>();
            tempPerson.put("id", person.getId());
            tempPerson.put("firstName", person.getFirstName());
            tempPerson.put("secondName", person.getSecondName());
            tempPerson.put("salary", person.getSalary());
            tempPerson.put("mail", person.getMail());
            tempPerson.put("workPlace", person.getWorkPlace());
        Gson gson = new Gson();
        bfw.write(gson.toJson(tempPerson));
        bfw.write('\n');
        bfw.flush();
        bfw.close();

    }

    public List<Person> readObjectFile(){
        List<Person> personList = new ArrayList<>();
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/userfiles/PersonOfList.json");
        ArrayList<JsonObject> json = new ArrayList<>();
        Gson gson = new Gson();
        JsonObject obj;
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null){
                obj = (JsonObject) new JsonParser().parse(line) ;
                json.add(obj);
            }
            reader.close();
            for (JsonObject object: json) {
               personList.add(gson.fromJson(object,Person.class));
            }
           return personList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}