package com.training.streams.filters;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Snippet {
	 public static void main(String[] args) {
	         
Path file = new File("tempest.txt").toPath();
         
         try{
             
             long matches = Files.lines(file)
                 .flatMap(line -> Stream.of(line.split(" ")))
                 .filter(word -> word.contains("my"))
                 .peek(s -> System.out.println("Match: " + s))
                 .count();
             
             System.out.println("# of Matches: " + matches);

	  }
         catch(Exception e ) {
        	 
         }
	 }
	
}

