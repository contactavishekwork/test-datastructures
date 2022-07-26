package edu.avishek.testdatastructures.java9features.tryresources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("abv.txt");
        // Can also do: try(FileOutputStream fos = new FileOutputStream("abv.txt")) {...}
        try (fos) {
            String greet = "Hello from the other side.";
            fos.write(greet.getBytes(StandardCharsets.UTF_8));
            System.out.println("Write Complete.");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
