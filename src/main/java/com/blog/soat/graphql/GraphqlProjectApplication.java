package com.blog.soat.graphql;

import com.blog.soat.graphql.entities.Mission;
import com.blog.soat.graphql.entities.Person;
import com.blog.soat.graphql.repository.MissionRepository;
import com.blog.soat.graphql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    MissionRepository missionRepository;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {

//        personRepository.deleteAll();
//        missionRepository.deleteAll();
//
//        Mission missionAccor = Mission.builder().title("Mission Accor").build();
//        Mission missionSG = Mission.builder().title("Mission SG").build();
//        missionRepository.save(missionAccor);
//        missionRepository.save(missionSG);
//
//        personRepository.save(Person.builder().firstName("Lamine").lastName("Le loup").active(false).mission(missionAccor).build());
//        personRepository.save(Person.builder().firstName("Toto").lastName("Tata").active(true).build());

//		List<Person> personList = personRepository.findAll()findAll();
//
//		personList.forEach(person -> System.out.println("Name = " + person.getFirstName() + person.getLastName()));
    }

}
