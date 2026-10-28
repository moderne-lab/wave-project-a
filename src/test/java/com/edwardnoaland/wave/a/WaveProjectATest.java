package com.edwardnoaland.wave.a;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectATest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-a:7", WaveProjectA.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectA.calculate(0));
    }
}
