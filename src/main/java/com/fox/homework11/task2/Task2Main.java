package com.fox.homework11.task2;

import com.fox.homework11.task1.FileNameReader;

import java.util.List;

public class Task2Main {

    public static void main(String[] args) {
        String path = "src/main/resources/names.txt";

        List<String> names = FileNameReader.readNames(path);

        List<String> result = DescendingUppercaseSorter.sort(names);

        System.out.println(result);
    }
}