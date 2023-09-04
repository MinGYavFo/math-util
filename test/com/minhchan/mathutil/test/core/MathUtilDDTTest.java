/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minhchan.mathutil.test.core;

import com.minhchan.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ADMIN
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
   @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {
            {0, 1}, 
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
        };
    }
    @Parameterized.Parameter(value =0)
    public int n;
    @Parameterized.Parameter(value =1)
    public long exp;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(exp, MathUtil.getFactorial(n));
    }
}
