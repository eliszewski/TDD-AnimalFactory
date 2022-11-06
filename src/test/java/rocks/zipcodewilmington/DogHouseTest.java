package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear(); // 0 dogs
        Integer expectedDogs = 1;

        // When
        DogHouse.add(animal); // 1 dog


        // Then
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actualDogs, expectedDogs);
    }
    @Test
    public void testAddDog(){
        DogHouse.clear();
        Dog testDog = new Dog(null, null, 12);
        Integer expectedDogs = 1;

        DogHouse.add(testDog);

        Dog actualDog = DogHouse.getDogById(12);
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs, actualDogs);
        Assert.assertEquals(testDog, actualDog);
    }
    @Test
    public void testRemoveDogById(){
        DogHouse.clear();
        Integer dogId = 12;
        Integer expectedDogs = 0;
        Dog testDog = new Dog(null, null, dogId);
        DogHouse.add(testDog);
        DogHouse.remove(dogId);
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actualDogs, expectedDogs);
    }
    @Test
    public void testRemoveDogByDog(){
        DogHouse.clear();
        Integer expectedDogs = 0;
        Dog testDog = new Dog(null, null, null);
        DogHouse.add(testDog);
        DogHouse.remove(testDog);
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs,actualDogs);
    }
    @Test
    public void testGetDogById(){
        DogHouse.clear();
        Integer dogId = 103;
        Dog testDog = new Dog(null, null, dogId);
        DogHouse.add(testDog);
        Dog retrievedDog = DogHouse.getDogById(dogId);
        Assert.assertEquals(testDog, retrievedDog);
    }
}
