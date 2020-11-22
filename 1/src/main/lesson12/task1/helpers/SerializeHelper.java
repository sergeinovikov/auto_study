package main.lesson12.task1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import main.lesson12.task1.model.Generatable;

public interface SerializeHelper {

    <T extends Generatable> T deserialize(String data, Class<T> clazz) throws JsonProcessingException;

    <T extends Generatable> String serialize(T object) throws JsonProcessingException;

}
