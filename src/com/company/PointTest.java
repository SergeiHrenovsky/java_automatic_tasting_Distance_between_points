package com.company;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void distance() {
        int in_x1 = 1;
        int in_y1 = 1;
        int in_x2 = 3;
        int in_y2 = 3;
        double expect = 2.82;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expect, out, 0.01);
    }
}
