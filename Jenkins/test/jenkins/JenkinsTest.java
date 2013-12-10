package jenkins;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quentin Luc G34799
 */

public class JenkinsTest {
    
    @Test
    public void test1() {
        int nb1 = 5;
        int nb2 = 3;
        assertEquals(Jenkins.getSomme(nb1, nb2), 8);
    }
    
    @Test
    public void test2() {
        int nb1 = 5;
        int nb2 = 3;
        assertEquals(Jenkins.getSoustraction(nb1, nb2), 2);
    }
}