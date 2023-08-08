package com.training.demo1;

import java.util.List;

import com.training.model.Person;
import com.training.utility.PersonData;

public class RoboCallTest06 {
   
   public static void main(String[] args){ 
 
     List<Person> pl = PersonData.gatherPersons();
     
     System.out.println("\n=== Print List ===");
     pl.forEach(p -> System.out.println(p));
         
   }
 }
