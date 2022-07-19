package edu.avishek.testdatastructures.multithreadfileread;

import java.io.File;
import java.io.InvalidObjectException;
import java.util.*;

public class FileProcessing {

    private static final int NO_OF_THREADS = 10;
    private static Map<String, Long> fileSizeMap = new HashMap<>();

    public static void main(String[] args) throws InvalidObjectException {
        File filePath = new File("C:\\Program Files (x86)");
        File[] fileList = filePath.listFiles();

        Thread[] threads = new Thread[NO_OF_THREADS];

        if(fileList == null) {
            throw new InvalidObjectException("Null List of Files");
        }

        final int filesPerThread = fileList.length/NO_OF_THREADS;
        final int remainingFiles = fileList.length%NO_OF_THREADS;

        for(int thread = 0; thread < NO_OF_THREADS; thread++) {
            int finalThread = thread;
            threads[thread] = new Thread(() -> runThread(fileList, finalThread, filesPerThread, remainingFiles));
        }

        for(Thread t1 : threads) {
            t1.start();
        }
        for(Thread t2 : threads) {
            try {
                t2.join();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileSizeMap);
    }

    private static void runThread(File[] fileList, int thread, int filesPerThread, int remainingFiles) {

        List<File> files = new ArrayList<>(Arrays.asList(fileList).subList(thread * filesPerThread, (thread + 1) * filesPerThread));

        if(thread == FileProcessing.NO_OF_THREADS -1 && remainingFiles > 0) {
            files.addAll(Arrays.asList(fileList).subList(fileList.length - remainingFiles, fileList.length));
        }

        for(File file : files) {
            synchronized (file) {
                fileSizeMap.put(file.getName(), file.length());
            }
            System.out.println("Processing file " + file.getName() + " in thread " + Thread.currentThread().getName());
        }
    }
}
