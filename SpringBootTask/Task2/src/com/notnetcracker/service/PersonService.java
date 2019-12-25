package com.notnetcracker.service;

import com.notnetcracker.model.Person;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private static List<Person> personList = new ArrayList<>();

    private int getCurrentSize() {
        return personList.size();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findPerson(int id) {
        if (id > getCurrentSize())
            return null;
        else
            return personList.get(id);
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

    public void writeInFile(Person person) throws IOException {
        //    File file = new File("D:\\NetCracker\\Java\\NetCrackerJavaCourse\\SpringBootTask\\Task1\\resources\\userfiles\\PersonOfList.txt");
        File file = new File(System.getProperty("user.dir") + "/Task2/resources/userfiles/PersonOfList.txt");
        FileWriter writer = new FileWriter(file, true);
        writer.append(person.toString());
        writer.append('\n');
        writer.close();
    }
/*    public void clearFileInfo(File file){
        try {
            FileWriter fstream1 = new FileWriter(file.getPath());
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();
        } catch (Exception e)
        {System.err.println("Error in file cleaning: " + e.getMessage());}
    }*/
}
