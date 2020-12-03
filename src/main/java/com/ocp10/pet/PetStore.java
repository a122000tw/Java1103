
package com.ocp10.pet;

import com.ocp10.pet.service.PetService;
import com.ocp10.pet.entity.Pet;


public class PetStore {
    public static void main(String[] args) {
        PetService service = new PetService();
        Pet[] pets = service.getPets();
        service.print(pets);
        int totalPrice = service.allPrice(pets);
        System.out.printf("Total price: %,d\n", totalPrice);
        int totalPriceByShiba = service.getPriceByShiba(pets);
        System.out.printf("Total price: %,d\n", totalPriceByShiba);
        //--------------------------------------------------------------
        // 印出每一個寵物的總價
        System.out.println("\n印出每一個寵物的總價");
        service.printEachTotalPriceByPet(pets);
        // 印出嘴高價的寵物
        System.out.println("印出最高價的寵物");
        service.printMaxPriceByPet(pets);
        
    }
}
