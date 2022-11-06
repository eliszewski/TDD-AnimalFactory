package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testConstructor(){
        String givenName = "Whiskey";
        Date givenDate = new Date();
        Integer givenID = 42033;

        Dog goodBoy = new Dog(givenName,givenDate, givenID);

        String retrievedName = goodBoy.getName();
        Date retrievedBirthDate = goodBoy.getBirthDate();
        Integer retrievedId = goodBoy.getId();
        Assert.assertEquals(givenName,retrievedName);
        Assert.assertEquals(givenDate,retrievedBirthDate);
        Assert.assertEquals(givenID, retrievedId);
    }
    @Test
    public void  testSpeak(){
        //given
        String expected = "bark!";
        Dog dog = new Dog("",new Date(), 0);
        //when
        String output = dog.speak();
        //then
        Assert.assertEquals(expected,output);
    }
    @Test
    public void testSetBirthDate(){
        Dog dog = new Dog("", new Date(), 0);
        Date expectedDate = new Date();
        dog.setBirthDate(new Date());
        Assert.assertEquals(expectedDate,dog.getBirthDate());
    }
    @Test
    public void testEatFood(){
        Dog dog = new Dog("", new Date(), 0);
        int expected = dog.getNumberOfMealsEaten() + 1;
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetID(){
        Integer expected = 1234;
        Dog dog = new Dog("", new Date(),expected);
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimalInheritance(){
        boolean expected = true;
        Dog dog = new Dog("", new Date(), 0);
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMammalInheritance(){
        boolean expected = true;
        Dog dog = new Dog("", new Date(), 0);
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }
}
