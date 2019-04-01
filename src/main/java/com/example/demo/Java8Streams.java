package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;



public class Java8Streams {
	final static Logger logger = Logger.getLogger(Java8Streams.class);
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("jack", 330),
                new Person("jack", 204),
                new Person("lawrence", 40)
        );

			
		Person result = (Person) persons.stream().filter(x -> "jack".equalsIgnoreCase(x.name)).findAny().orElse(null);
		logger.info("Nullddddd");  
		logger.info("jobList:"+result);
        Person result1 = (Person) persons.stream().filter(x -> "jack".equalsIgnoreCase(x.name)).findAny().orElse(null);
        logger.info("Nullddddd "+result1); 
        
        

	}

}
