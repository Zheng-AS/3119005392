package com.pan.util;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import com.pan.exception.FileException;

public class FileUtil {
    /**
     * @param filepath 文件路径
     */
    public static String readFile(String filepath) throws FileException {
        if(filepath==null ||"".equals(filepath)){
            throw new FileException("文件路径为空");
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filepath);
        }catch (Exception e){
            throw new FileException("文件为空");
        }

        String result = fileReader.readString();
        return result;
    }
    public static Boolean writeFile(String filepath,String content) {
        FileWriter writer = new FileWriter(filepath);
        try {
            writer.write(content);
        }catch (Exception e){
            System.out.println("答案文件输出异常，答案为："+content);
        }
        return true;
    }
}
