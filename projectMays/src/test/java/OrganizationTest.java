import bymay.vlad.Organization;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganizationTest {
    Organization person = new Organization();

    @Test
    public void testYoungs(){
        boolean expected = false;
        boolean actual = person.youngs(39);

        assertEquals(expected, actual);
    }

    @Test
    public void testYoungs2(){
        boolean expected= false;
        boolean actual = person.youngs(18);

        assertEquals(expected, actual);
    }

    @Test
    public void testYoungs3(){
        boolean expected = true;
        boolean actual = person.youngs(17);

        assertEquals(expected, actual);
    }
    @Test
    public void testNotYoungs(){
        boolean expected = true;
        boolean actual = person.notYoungers(39);

        assertEquals(expected, actual);
    }
    @Test
    public void testNatYoungs2(){
        boolean expected= true;
        boolean actual = person.notYoungers(18);

        assertEquals(expected, actual);
    }

    @Test
    public void testNotYoungs3(){
        boolean expected = false;
        boolean actual = person.notYoungers(17);

        assertEquals(expected, actual);
    }
    @Test
    public void workAge(){
        boolean expected = true;
        boolean actual = person.workAge(64);

        assertEquals(expected, actual);
    }
    @Test
    public void workAge4(){
        boolean expected = false;
        boolean actual = person.workAge(65);

        assertEquals(expected, actual);
    }


    @Test
    public void onlyOld(){
        boolean expected= true;
        boolean actual = person.onlyOld(66);

        assertEquals(expected, actual);
    }

    @Test
    public void onlyOld1(){
        boolean expected = false;
        boolean actual = person.onlyOld(65);

        assertEquals(expected, actual);
    }



}
