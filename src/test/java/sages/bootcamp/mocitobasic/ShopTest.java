package sages.bootcamp.mocitobasic;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class ShopTest {
    @Test
    public void shouldGetProductsView(){
        //given
        Storage storage = Mockito.mock(Storage.class);
        Shop shop = new Shop(storage);
        Mockito.when(storage.retrive()).thenReturn(Arrays.asList("Kawa", "Kasza"));
        String expectedProductsView = "Kawa, Kasza";

        //when
        String actualProductsView = shop.getProductsView();

        //then
        Assert.assertEquals(expectedProductsView, actualProductsView);
    }

}