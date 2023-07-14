package com.example.testcode.unit;

import com.example.testcode.unit.beverage.Americano;
import com.example.testcode.unit.beverage.Latte;

public class CafeKioskRunner {
    public static void main(String[] args) {
        CafeKiosk kiosk = new CafeKiosk();
        kiosk.add(new Americano());
        System.out.println(">>>>아메리카노 추가");

        kiosk.add(new Latte());
        System.out.println(">>>>라떼 추가");

        int totalPrice = kiosk.calculateTotalPrice();
        System.out.println("총 주문 가격 : " + totalPrice);

    }
}
