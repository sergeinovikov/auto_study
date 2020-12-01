package main.lesson12.task3;

import com.google.gson.GsonBuilder;

public class JsonHelper<T> {

    public T deserialize(String data, Class<T> clazz) {
        return new GsonBuilder().create().fromJson(data, clazz);
    }
}
