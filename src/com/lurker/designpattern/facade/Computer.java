package com.lurker.designpattern.facade;

public class Computer {

    private CPU cpu;

    private Memory memory;

    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("begin start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer has been started");
    }

    public void shutdown() {
        System.out.println("begin shutdown the computer");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("computer has been shutdown");
    }

}
