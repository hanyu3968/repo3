package cn.murong.test;

import cn.murong.junit.Calaculator;
import org.junit.Test;

public class CalaculatorTest {
    @Test
    public void testAdd(){
        Calaculator c = new Calaculator();
        int result = c.add(1,1);
        System.out.println(result);
    }
}
