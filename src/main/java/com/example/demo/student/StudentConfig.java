package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam =  new Student(
                    1L,
                    "Mariam",
                    "m@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5),
                    21
            );
            Student s =  new Student(
                    "Sergio",
                    "s@gmail.com",
                    LocalDate.of(1995, Month.DECEMBER,16),
                    26
            );

            List<Student> lista = Arrays.asList(mariam,s);
            repository.saveAll(
                        lista
            );
        };
    }

}
