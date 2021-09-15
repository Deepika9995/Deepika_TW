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
}
