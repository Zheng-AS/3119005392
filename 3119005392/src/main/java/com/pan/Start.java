package com.pan;

import com.pan.util.FileUtil;
import com.pan.util.TokenizerUtil;

import java.util.List;
import java.util.Map;

public class Start {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(file1);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(file2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        System.out.println(aDouble);
        FileUtil.writeFile(args[2],String.valueOf(aDouble));
    }
}
