package com.saggese;

import com.fasterxml.jackson.dataformat.xml.*;

public class App {

    XmlMapper mapper = new XmlMapper();

    public void whenJavaGotFromXmlStr_thenCorrect() {
        XmlMapper xmlMapper = new XmlMapper();
        root value = xmlMapper.readValue("<SimpleBean><x>1</x><y>2</y></SimpleBean>", root.class);
        assertTrue(value.getX() == 1 && value.getY() == 2);
    }

    public static void main(String[] args) {
    }
}
