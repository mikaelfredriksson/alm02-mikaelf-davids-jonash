package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 224Mi
 */
public class TranslatorTest {
    
    Translator trans = new Translator();
    
    public TranslatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFortune method, of class Translator.
     */
    @Test
    public void testGetFortune() {
        /*System.out.println("getFortune");
        Translator instance = new Translator();
        String expResult = "";
        String result = instance.getFortune();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of calculateFortune method, of class Translator.
     */
    @Test
    public void testCalculateFortune() {
        /*System.out.println("calculateFortune");
        Person person = null;
        Translator instance = new Translator();
        instance.calculateFortune(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of randomNumber method, of class Translator.
     */
    @Test
    public void testRandomNumber() {
        assertEquals(trans.randomNumber(2), "1-5");
        assertEquals(trans.randomNumber(4), "1-5");
        assertEquals(trans.randomNumber(6), "6-10");
        assertEquals(trans.randomNumber(8), "6-10");
    }

    /**
     * Test of gender method, of class Translator.
     */
    @Test
    public void testGender() {
        /*System.out.println("gender");
        String gender = "";
        Translator instance = new Translator();
        String expResult = "";
        String result = instance.gender(gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of age method, of class Translator.
     */
    @Test
    public void testAge() {
        /*System.out.println("age");
        String ageString = "";
        Translator instance = new Translator();
        String expResult = "";
        String result = instance.age(ageString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}