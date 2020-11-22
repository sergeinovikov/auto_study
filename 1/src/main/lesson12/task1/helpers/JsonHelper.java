package main.lesson12.task1.helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.lesson12.task1.model.Generatable;

public class JsonHelper implements SerializeHelper{
    @Override
    public <T extends Generatable> T deserialize(String data, Class<T> clazz) {
        return new GsonBuilder().create().fromJson(data, clazz);
    }

    @Override
    public <T extends Generatable> String serialize(T object) {
        return new Gson().toJson(object);
    }
}
