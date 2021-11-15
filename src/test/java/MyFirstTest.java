import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
//    private List<String> names; //Douglas lecture
//
//    @Before
//    public void runThisBefore(){ //Douglas lecture
//        this.names = new ArrayList<>();
//        this.names.add("Douglas");
//    }
//
//    @Test
//    public void testHelloWorld(){ //Douglas lecture
//        System.out.println("Hello World");
//    }
//
//    //When you're using floating points values, a third parameter is required (Delta) which represents a positive margin of error of decimals.
//    @Test
//    public void testIfChangeIsCorrect(){ //Douglas lecture
//        Double price = 10.0;
//        Double discount = 4.5;
//        assertEquals(5.5, price - discount, 0);
//        assertEquals(5.1, price - discount, 0.5);
//        assertNotEquals(10, price - discount, 0.5);
//    }
//
//    @Test
//    public void testIfArrayEquals(){ //Douglas lec
//        char[] expected = {'j'};
//        char[] actual = "j".toCharArray();
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testIfGreaterOrLesserThanWorks(){ //Douglas lec
//        boolean learningTDD = true;
//
//        assertTrue(learningTDD);
//        assertTrue("5 is greater than 4", 5 > 4);
//        assertFalse("10 is greater than 6", 10 < 6); //have messages remain true to the test for clarity
//    }
//
//    @Test
//    public void testIfObjectsAreDifferent() { //Douglas lec
//        Object dog = new Object();
//        Object sheep = new Object();
//        Object clonedSheep = sheep;
//
//        assertNotSame(sheep, dog);
//        assertSame(sheep, clonedSheep);
//    }
//
//    @Test
//    public void testIfInstanceIsNull() { //Douglas lec
//        Object phone = new Object();
//        Object laptop = null;
//
//        assertNull(null);
//        assertNotNull(phone);
//        assertNull(laptop);
//    }
//
//    @Test
//    public void testIfNamesIsInitialized(){ //Douglas lecture
//        assertNotNull(names);
//    }

    @Test
    public void testIfCodeupNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfListsAreDifferent(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfContains(){
        String language = "PHP";
//        language.contains("H"); // use assertTrue for this statement
//        language.contains("J"); // use assertFalse for this statement

        assertFalse(language.contains("J"));
        assertTrue(language.contains("H"));
    }
}
