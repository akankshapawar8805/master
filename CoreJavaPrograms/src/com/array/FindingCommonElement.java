package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingCommonElement {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Finding common elements using nested loops
        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements.add(array1[i]);
                }
            }
        }
        System.out.println("Common elements using loops: " + commonElements);

        System.out.println("\n*********** Another method ************");
        System.out.println("Using ArrayList with retainAll method:");

        // Correct way to convert int[] to List<Integer>
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());

        list1.retainAll(list2);  // Modifies list1 to keep only common elements
        System.out.println("Common elements using retainAll: " + list1);

        System.out.println("\nUsing Stream API:");
        String[] arr3 = {"java", "javascript", "c", "c++"};
        String[] arr4 = {"python", "c#", "java", "C++"};

        List<String> list3 = new ArrayList<>(Arrays.asList(arr3));
        List<String> list4 = new ArrayList<>(Arrays.asList(arr4));

        List<String> commonStr = list3.stream()
                .filter(list4::contains)
                .collect(Collectors.toList());

        System.out.println("Common elements in string arrays: " + commonStr);
    }
}
