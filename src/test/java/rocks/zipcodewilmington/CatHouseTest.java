package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)` done
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetCatById(){
        CatHouse.clear();
        Integer catId = 10;
        Cat testCat = new Cat(null, null, catId);
        CatHouse.add(testCat);
        Cat actualCat = CatHouse.getCatById(catId);
        Assert.assertEquals(testCat, actualCat);
    }

    @Test
    public void testAddCat(){
        CatHouse.clear();// 0 cats
        Cat testCat = new Cat(null, null, 12);
        CatHouse.add(testCat); // 1 cat
        Integer numCat = CatHouse.getNumberOfCats();
        Cat actualCat = CatHouse.getCatById(12);
        Integer expectedCats = 1;
        Assert.assertEquals(numCat,expectedCats);
        Assert.assertEquals(testCat, actualCat);
    }
    @Test
    public void testRemoveById(){
        CatHouse.clear();
        Integer catsId = 10;
        Integer expectedCats = 0;
        Cat testCat = new Cat(null, null, catsId);
        CatHouse.add(testCat); // 1 cat
        CatHouse.remove(catsId); // 0 cat
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(actualCats, expectedCats);
    }
    @Test
    public void testRemoveByCat(){
        CatHouse.clear();
        Integer expectedCats = 0;
        Cat testCat = new Cat(null, null, null);
        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats, actualCats);
    }
    @Test
    public void testGetNumberOfCats(){
        //given
        Integer expectedCats = 1;
        CatHouse.clear(); // 0 cats
        Cat testCat = new Cat(null, null, null);
        //when
        CatHouse.add(testCat); // 1 cat
        //then
        Integer actualCats = CatHouse.getNumberOfCats(); // should return 1 
        Assert.assertEquals(actualCats, expectedCats);

    }
}
