import bymay.vlad.Organization;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

//    @Test
//    public void Organs() throws IOException {
//        int years = 20;;
//        List<Boolean> allOrgans = new ArrayList<>();
//        Boolean zero = person.youngs(years);
//        Boolean first = person.notYoungers(years);
//        Boolean second = person.workAge(years);
//        Boolean third = person.onlyOld(years);
//        allOrgans.add(zero);
//        allOrgans.add(first);
//        allOrgans.add(second);
//        allOrgans.add(third);
//        FileWriter writer = new FileWriter("threeHomes.txt");
//        person.Organs(allOrgans, writer);
//        writer.close();
//    }



}
