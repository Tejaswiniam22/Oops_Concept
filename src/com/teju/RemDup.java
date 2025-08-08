package com.teju;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemDup {

    public void RemoveDuplicate(){
        List<Integer> rem= Arrays.asList(1,2,2,3,4,4,4,4,5);
        List<Integer> un=rem.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(un);
    }
}
