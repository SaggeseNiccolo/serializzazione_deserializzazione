package com.saggese;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.*;

public class App {

    XmlMapper mapper = new XmlMapper();

    public static void whenJavaGotFromXmlStr_thenCorrect()
            throws JsonParseException, JsonMappingException, IOException {
        File file = new File("deserializzazione_xml/classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Root value = xmlMapper.readValue(file, Root.class);
        System.out.println("La classe " + value.getClasse() + value.getSpecializzazione() + " si trova nell'aula "
                + value.getAula().getNome() + " ed è composta dai seguenti studenti:");
        for (int i = 0; i < value.getStudenti().size(); i++) {
            System.out.println("- " + value.getStudenti().get(i).getCognome());
        }
    }

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        whenJavaGotFromXmlStr_thenCorrect();
    }
}
