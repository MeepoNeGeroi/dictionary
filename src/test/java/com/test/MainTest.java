package com.test;

import com.application.service.impl.DictionaryService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testTranslate(){
        List<String> expected = Arrays.asList("Translate is: море", "Translate is: океан",
                "Translate is: бутылка", "Translate is: машинка");
        List<String> actual = new ArrayList<>();

        actual.add(DictionaryService.getInstance().getWord("sea"));
        actual.add(DictionaryService.getInstance().getWord("ocean"));

        DictionaryService.getInstance().addWord("bottle", "бутылка");

        actual.add(DictionaryService.getInstance().getWord("bottle"));

        DictionaryService.getInstance().addWord("car", "машинка");

        actual.add(DictionaryService.getInstance().getWord("car"));

        Assert.assertArrayEquals(new List[]{expected}, new List[]{actual});
    }
}
