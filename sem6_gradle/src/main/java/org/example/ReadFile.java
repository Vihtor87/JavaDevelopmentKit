package org.example;

import org.checkerframework.common.reflection.qual.GetClass;

import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println(new ReadFile().readFile());
    }

    public String readFile() {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("text.txt")) {
            String textFile = new String(inputStream.readAllBytes());
            return textFile;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
