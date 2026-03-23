package com.fox.homework11.task1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileNameReaderTest {

    @Test
    void shouldReadAndCleanNames() throws Exception {
        File tempFile = File.createTempFile("names", ".txt");

        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("Ivan\n");
            writer.write("  Maria  \n");
            writer.write("\n");
            writer.write("Peter\n");
        }

        List<String> result = FileNameReader.readNames(tempFile.getAbsolutePath());

        assertEquals(List.of("Ivan", "Maria", "Peter"), result);
    }
}