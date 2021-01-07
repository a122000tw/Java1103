
package ocp16;

import com.ocp16_exception.Power;
import org.junit.Assert;
import org.junit.Test;



public class Test_Power {
    @Test
    public void testV() {
        Power power = new Power();
        int w = 1000;
        int a = 100;
        int exp = 10;
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
   }
    @Test
    public void testA() {
        Power power = new Power();
        int w = 1000;
        int v = 10;
        int exp = 100;
        int act = power.getA(w, v);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void testW() {
        Power power = new Power();
        int a = 100;
        int v = 10;
        int exp = 1000;
        int act = power.getW(v, a);
        Assert.assertEquals(exp, act);
    }
    
}
