package com.example.demo;

import com.example.demo.entity.Course;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class JsonToArrayObjectRunner {

    public static void main(String[] args) throws IOException {

        // 0. Read JSON
        FileReader reader = new FileReader("D:/Adrien/Documents/DEVMIND/MOD_3/demo/src/main/resources/json/ex2.json");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.readTree(reader).toString();

        // 1. Convert JSON to Java object
        Course[] courses = objectMapper.readValue(json, Course[].class);

        // 2. Print Java object
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
