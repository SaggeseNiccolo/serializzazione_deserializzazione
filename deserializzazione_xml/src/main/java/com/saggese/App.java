package com.saggese;

import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.*;

public class App {
    // serializzazione xml
    public static void whenJavaSerializedToXmlStr_thenCorrect() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new Root());
        System.out.println("*** Serializzazione XML ***");
        System.out.println(xml);
    }

    // serializzazione json
    public static void whenJavaSerializedToJsonStr_thenCorrect() throws JsonProcessingException {
        ObjectMapper json_mapper = new ObjectMapper();
        String json_str = json_mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new Root());
        System.out.println("*** Serializzazione JSON ***");
        System.out.println(json_str);
    }

    // deserializzazione
    public static void whenJavaGotFromXmlStr_thenCorrect()
            throws JsonParseException, JsonMappingException, IOException {
        File file = new File("deserializzazione_xml/classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Root value = xmlMapper.readValue(file, Root.class);
        System.out.println();
        System.out.println("*** DESERIALIZZAZIONE XML ***");
        System.out.println("La classe " + value.getClasse() + value.getSpecializzazione() + " si trova nell'aula "
                + value.getAula().getNome() + " ed è composta dai seguenti studenti:");
        for (int i = 0; i < value.getStudenti().size(); i++) {
            System.out.println("- " + value.getStudenti().get(i).getCognome());
        }
        System.out.println();
    }

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        whenJavaGotFromXmlStr_thenCorrect();
        whenJavaSerializedToXmlStr_thenCorrect();
        whenJavaSerializedToJsonStr_thenCorrect();
    }
}
