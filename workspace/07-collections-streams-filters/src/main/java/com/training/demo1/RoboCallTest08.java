package com.training.demo1;

import java.util.List;
import java.util.function.Predicate;

import com.training.model.Person;
import com.training.utility.PersonData;

public class RoboCallTest08 {  
   public static void main(String[] args){ 
     List<Person> pl = PersonData.gatherPersons();
    
     
     // Predicates
     Predicate<Person> allPilots = 
         p -> p.getAge() >= 23 && p.getAge() <= 65;
     
     System.out.println("\n=== Calling all Drivers Variable ===");
        pl.stream()
           .filter(allPilots)
           .forEach(p -> MakeCall2.roboCall(p));       
   }
}