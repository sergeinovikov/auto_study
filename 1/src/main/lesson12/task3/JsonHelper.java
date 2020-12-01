package main.lesson12.task3;

import com.google.gson.GsonBuilder;

public class JsonHelper {

        public Object deserialize(String data, Class clazz) {
            return new GsonBuilder().create().fromJson(data, clazz);
        }
}
