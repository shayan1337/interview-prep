package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    @Test
    void testMaxArea() {
        assertEquals(2, ContainerWithMostWater.maxArea(new int[]{1, 2, 1}));
    }

    @Test
    void testMaxArea1() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void testMaxAreaFast() {
        assertEquals(2, ContainerWithMostWater.maxAreaFast(new int[]{1, 2, 1}));
    }

    @Test
    void testMaxAreaFast1() {
        assertEquals(49, ContainerWithMostWater.maxAreaFast(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}