
package com.ocp10.computer;

public class ComputerStore {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        System.out.println(pc.add(10, 20));
        System.out.println(pc.getName());
        System.out.println(Computer.volt);
        Computer computer = new IPhone();
        System.out.println(computer.add(10, 20));
        System.out.println(computer.getName());
        System.out.println(Computer.volt);
    }
}
