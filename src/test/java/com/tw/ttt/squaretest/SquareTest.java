package com.tw.ttt.squaretest;

import com.tw.ttt.square.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldReturnOneAsArea(){
        Square square = new Square();
        Assert.assertEquals(1.0,square.calculateArea(1.0),0);
    }

    @Test
    public void shouldReturnPerimeter(){
        Square square = new Square();
        Assert.assertEquals(20.0, square.calculatePerimeter(5.0), 0);
    }
}
