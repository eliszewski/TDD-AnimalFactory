package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        Date theDate = new Date();
        String dogName = "Kevin";
        Dog expectedDog  = AnimalFactory.createDog(dogName, theDate);
        boolean isDog = expectedDog instanceof Dog;
        Integer dogId = expectedDog.getId();
        Assert.assertEquals(dogId, DogHouse.getNumberOfDogs());
        Assert.assertEquals(true, isDog);
        Assert.assertEquals(dogName, expectedDog.getName());
        Assert.assertEquals(theDate, expectedDog.getBirthDate());


    }

    @Test
    public void testCreateCat(){
        Date theDate = new Date();
        String catName = "Kevin";
        Cat kitty = AnimalFactory.createCat(catName,theDate);
        boolean isCat = kitty instanceof Cat;
        Integer catId = kitty.getId();
        Assert.assertEquals(catId, CatHouse.getNumberOfCats());
        Assert.assertEquals(true, isCat);
        Assert.assertEquals(catName, kitty.getName());
        Assert.assertEquals(theDate, kitty.getBirthDate());
    }
}
