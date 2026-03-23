package com.fox.homework11.task4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearCongruentialGeneratorTest {

    @Test
    void shouldGenerateCorrectSequence() {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 1;

        List<Long> result = LinearCongruentialGenerator.generate(seed, a, c, m)
                .limit(3)
                .toList();

//        seed = 1
//        x[0] = 1
//        x[1] = (a * 1 + c) % m = 25214903928
//        x[2] = (a * 25214903928 + 11) % m = 206026503483683
        List<Long> expected = List.of(
                1L,
                25214903928L,
                206026503483683L
        );

        assertEquals(expected, result);
    }
}