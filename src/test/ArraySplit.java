package test;

import java.util.Arrays;
import java.util.List;

public class ArraySplit {
    public static void main(String[] args) {
        byte[] TestArray = new byte[] {13, 10, 15, 0, 12, 12, 0, 19, 21, 20, 0, 21}; // Delimiter is 0
        System.out.println("Before split -> "+Arrays.toString(TestArray));

        List<byte[]> Result = tools.ArraySplit.split(TestArray, new byte[] {0});

        System.out.print("After split -> ");
        for(byte[] segment : Result) {
            System.out.print(Arrays.toString(segment) + ", ");
        }
        System.out.print("\n");
    }
}
