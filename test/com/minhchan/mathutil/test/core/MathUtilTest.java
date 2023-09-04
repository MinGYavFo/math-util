/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhchan.mathutil.test.core;

import com.minhchan.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
   
//    @Test(expected = NumberFormatException.class)
//        public void testGetFactorialGivenWrongArgumentThrowsException() {
//            MathUtil.getFactorial(1);
//        }
    
    @Test(expected = IllegalArgumentException.class)
        public void testGetFactorialGivenWrongArgumentThrowsException() {
            MathUtil.getFactorial(-5);
        }
    
        
        
//    @Test
//        public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//           assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
//            
////            MathUtil.getFactorial(-5);
//        }
    
    @Test
        public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
           try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("0<n<20", e.getMessage());
        }
            
//            MathUtil.getFactorial(-5);
        }
}
