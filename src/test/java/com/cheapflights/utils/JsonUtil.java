package com.cheapflights.utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonUtil {
    static Gson gson = new Gson();
    private static String fileName;

    public static <T> T readJson(String fileName, Class<T> c) {
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(fileName));
            return gson.fromJson(jsonReader, c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFileName(){
        return fileName;
    }
    public static void setFileName(String fileName){
        JsonUtil.fileName = fileName;
    }


}
