package leetcode.hard;

import org.junit.jupiter.api.Test;

import java.util.List;


class AutocompleteSystemTest {

    @Test
    void testAutocompleteSystem() {
        String[] sentences = {"i love you", "island", "iroman", "i love leetcode"};
        int[] times = {5, 3, 2, 2};
        AutocompleteSystem autocompleteSystem = new AutocompleteSystem(sentences, times);

        List<String> top = autocompleteSystem.input('i');
    }

}