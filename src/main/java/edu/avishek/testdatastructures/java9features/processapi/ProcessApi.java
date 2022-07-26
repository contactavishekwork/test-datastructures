package edu.avishek.testdatastructures.java9features.processapi;

public class ProcessApi {
    public static void main(String[] args) {
        ProcessHandle processHandle = ProcessHandle.current();
        System.out.println("Process ID: " + processHandle.pid());
        System.out.println("Direct Children: " + processHandle.children());
        System.out.println("Class Name" + processHandle.getClass());
        System.out.println("All Processes: " + ProcessHandle.allProcesses());
        System.out.println("Process Info: " + processHandle.info());
        System.out.println("Is Process Alive? " + (processHandle.isAlive()));
        System.out.println("Process Parent: " + processHandle.parent());
    }
}
