package com.fox.homework11.task1;

import com.fox.homework11.task1.FileNameReader;
import com.fox.homework11.task1.OddIndexNamesFormatter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "src/main/resources/names.txt";

        List<String> names = FileNameReader.readNames(path);

        String result = OddIndexNamesFormatter.format(names);

        System.out.println(result);
    }
}