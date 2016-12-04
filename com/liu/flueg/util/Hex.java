package com.liu.flueg.util.*;
import java.io.*;

public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b: data) {
            if (n % 16 ==0 ) result.append(String.format("%05X: ", n));
        result.append(String.format("%02X: ", b));
        n++;
        if (n % 16 ==0 ) result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }

    public static class Test {
        public static void main(String[] args) throws Exception {
            if (args.length == 0) 
                Print.print(format(BinaryFile.read("Hex.class")));
            else
                Print.print(format(BinaryFile.read(new File(args[0]))));
        }
    }
}
