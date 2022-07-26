package edu.avishek.testdatastructures.java9features.version;

public class VersionInfo {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Current Version: " + version.version());
        System.out.println("Major Version Number: " + version.major());
        System.out.println("Minor version number "+version.minor()); // Getting minor version number
        System.out.println("Security version number "+version.security());  // Getting security version number
        System.out.println("Pre-released information "+version.pre());      // Getting pre-release version information
        System.out.println("Build Number "+version.build());                // Getting Optional build number
    }
}