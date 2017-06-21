package sages.bootcamp.mocitobasic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;



public class StorageTest {
    @Test
            public void shouldBeEmptyAfterCreation() throws Exception{
        //given
        Storage storage = new Storage();
        List<String> expectedProducts = new ArrayList<String>();

        //when
        List<String> actualProducts = storage.retrive();


        //then
        Assert.assertEquals(expectedProducts, actualProducts);


    }
    @Test
    public void OnTheBegginingStorageIsEmpty(){
        //given
        Storage storage = new Storage();
        List<String> expectedProducts = new ArrayList<String>();

        //when
        List<String> actualProducts = storage.retrive();

        //then
        Assert.assertEquals(expectedProducts, actualProducts);

    }
}