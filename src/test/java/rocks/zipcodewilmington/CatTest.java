package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        //given
        String expected = ("kevin");
        Cat cat = new Cat("",new Date(), 0);

        //when
        cat.setName(expected);
        //then
        Assert.assertEquals(expected,cat.getName());
    }
    @Test
    public void  testSpeak(){
        //given
        String expected = "meow!";
        Cat cat = new Cat("",new Date(), 0);
        //when
        String output = cat.speak();
        //then
        Assert.assertEquals(expected,output);
    }
    @Test
    public void testSetBirthDate(){
        Date firstDate = new Date();
        Cat cat = new Cat("", firstDate, 0);
        Date expectedDate = new Date();
        cat.setBirthDate(expectedDate);
        Assert.assertEquals(expectedDate,cat.getBirthDate());
    }
    @Test
    public void testEatFood(){
        Cat cat = new Cat("", new Date(), 0);
        int expected = cat.getNumberOfMealsEaten() + 1;
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetID(){
        Integer expected = 1234;
        Cat cat = new Cat("", new Date(),expected);
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimalInheritance(){
        boolean expected = true;
        Cat cat = new Cat("", new Date(), 0);
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMammalInheritance(){
        boolean expected = true;
        Cat cat = new Cat("", new Date(), 0);
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }

}
