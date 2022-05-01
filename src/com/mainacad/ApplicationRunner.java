package com.mainacad;

import com.mainacad.service.NumberManipulationService;
import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        String testText = "abc1de 2fg3h i4jk15mn";

        String modifiedText = testText.trim();
        String[] words = modifiedText.split(StringUtils.SPACE);

        LOGGER.info("Original " + testText);
        LOGGER.info("Trimmed " + modifiedText);
        LOGGER.info("Word: " + StringUtils.join(words, ", "));

        String name ="\"Yaroslav\"";
        int age = 30;
        LOGGER.info(String.format("My name is %s, I'm %d years old.", name, age));

        modifiedText = modifiedText.replaceAll("[a-zA-Z]", StringUtils.EMPTY);
        LOGGER.info("Modified: " + modifiedText);

//        StringBuilder stringBuilder = new StringBuilder("some text for string builder");
//        stringBuilder.append(" , add sone new text");
//
//        LOGGER.info(stringBuilder.toString());
//
//        StringBuffer stringBuffer = new StringBuffer("some text for string buffer");
//        stringBuffer.append(" , add sone new text");
//-
//        LOGGER.info(stringBuffer.toString());
//
//        LOGGER.info(stringBuffer.reverse().toString());




//        LOGGER.info("Sum by division for 12345 is " +
//                NumberManipulationService.getSumByDivision(12345));

//        LOGGER.info("Sum by type manipulation for 12345 is " +
//                NumberManipulationService.getSumByTypeManipulation(12345));

    }
}
