package main.lesson12.task1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import main.lesson12.task1.model.Generatable;

public class XmlHelper implements SerializeHelper{
    @Override
    public <T extends Generatable> T deserialize(String data, Class<T> clazz) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(data, clazz);
    }

    @Override
    public <T extends Generatable> String serialize(T object) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(object);
    }
}
