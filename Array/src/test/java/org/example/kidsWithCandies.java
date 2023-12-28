package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class kidsWithCandies {
    @Test
    void Test1(){
        List<Boolean> ans = List.of(true,true,true,false,true);

        assertIterableEquals(ans,LeetCode.kidsWithCandies(new int[]{2,3,5,1,3},3));
    }
    @Test
    void Test2(){
        List<Boolean> ans = List.of(true,false,false,false,false);

        assertIterableEquals(ans,LeetCode.kidsWithCandies(new int[]{4,2,1,1,2},1));
    }
    @Test
    void Test3(){
        List<Boolean> ans = List.of(true,false,true);

        assertIterableEquals(ans,LeetCode.kidsWithCandies(new int[]{12,1,12},10));
    }

}