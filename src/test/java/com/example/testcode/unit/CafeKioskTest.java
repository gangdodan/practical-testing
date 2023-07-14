package com.example.testcode.unit;

import com.example.testcode.unit.beverage.Americano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeKioskTest {
    @Test
     void add(){
        CafeKiosk kiosk = new CafeKiosk();
        kiosk.add(new Americano());
        System.out.println();
    }

}