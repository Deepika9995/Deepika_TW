package com.tw.ttt.rectangletest;

import com.tw.ttt.rectangle.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldReturnOneAsArea() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1, rectangle.calculateArea(1.0, 1.0), 0);
    }

    @Test
    public void shouldReturnAreaValue() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(24.0, rectangle.calculateArea(8.0, 3.0), 0);
    }

    @Test
    public void shouldReturnPerimeter() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(4.0, rectangle.calculatePerimeter(1.0, 1.0), 0);
    }

}
