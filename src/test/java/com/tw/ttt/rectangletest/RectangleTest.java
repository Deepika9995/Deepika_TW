package com.tw.ttt.rectangletest;

import com.tw.ttt.rectangle.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldReturnOneAsResult(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1,rectangle.calculateArea(1.0,1.0),0);
    }

}
