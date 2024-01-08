package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNegatives {
    @Test
    void Test1(){
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        assertEquals(8,Searching.countNegatives(grid));
    }

}