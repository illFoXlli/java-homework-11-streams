package com.fox.homework11.task1;

import java.util.List;

public class Task1Main {

    public static void main(String[] args) {
        String path = "src/main/resources/names.txt";

        List<String> names = FileNameReader.readNames(path);

        String result = OddIndexNamesFormatter.format(names);

        System.out.println(result);
    }
}