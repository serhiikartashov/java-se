package org.kartashov.part9_streams.examples.presentation.ex8_count;

import org.kartashov.part9_streams.examples.presentation.common.Gender;
import org.kartashov.part9_streams.examples.presentation.common.Person;

import java.util.Arrays;
import java.util.List;

public class Sample {
  public static List<Person> createPeople() {
    return Arrays.asList(
	    new Person("Sara", Gender.FEMALE, 20),
	    new Person("Sara", Gender.FEMALE, 22),
	    new Person("Bob", Gender.MALE, 20),
	    new Person("Paula", Gender.FEMALE, 32),
	    new Person("Paul", Gender.MALE, 32),
	    new Person("Jack", Gender.MALE, 2),
	    new Person("Jack", Gender.MALE, 72),
	    new Person("Jill", Gender.FEMALE, 12)
	  );
  }
  
	public static void main(String[] args) {
	  List<Person> people = createPeople();

    System.out.println(
      people.stream()
            .filter(person -> person.getAge() < 18)
            .count());
	}
}
