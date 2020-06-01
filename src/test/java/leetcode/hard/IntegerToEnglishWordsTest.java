package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToEnglishWordsTest {

    @Test
    void testConvertIntegerToEnglishString12345() {
        String res = IntegerToEnglishWords.numberToWords(12345);

        assertEquals("Twelve Thousand Three Hundred Forty Five", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString0() {
        String res = IntegerToEnglishWords.numberToWords(0);

        assertEquals("Zero", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString1() {
        String res = IntegerToEnglishWords.numberToWords(1);

        assertEquals("One", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString10() {
        String res = IntegerToEnglishWords.numberToWords(10);

        assertEquals("Ten", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString11() {
        String res = IntegerToEnglishWords.numberToWords(11);

        assertEquals("Eleven", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString19() {
        String res = IntegerToEnglishWords.numberToWords(19);

        assertEquals("Nineteen", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString20() {
        String res = IntegerToEnglishWords.numberToWords(20);

        assertEquals("Twenty", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString29() {
        String res = IntegerToEnglishWords.numberToWords(29);

        assertEquals("Twenty Nine", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString30() {
        String res = IntegerToEnglishWords.numberToWords(30);

        assertEquals("Thirty", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString99() {
        String res = IntegerToEnglishWords.numberToWords(99);

        assertEquals("Ninety Nine", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString100() {
        String res = IntegerToEnglishWords.numberToWords(100);

        assertEquals("One Hundred", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString101() {
        String res = IntegerToEnglishWords.numberToWords(101);

        assertEquals("One Hundred One", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString110() {
        String res = IntegerToEnglishWords.numberToWords(110);

        assertEquals("One Hundred Ten", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString999() {
        String res = IntegerToEnglishWords.numberToWords(999);

        assertEquals("Nine Hundred Ninety Nine", res) ;
    }

    @Test
    void testConvertIntegerToEnglishString1000() {
        String res = IntegerToEnglishWords.numberToWords(1000);

        assertEquals("One Thousand", res);
    }

    @Test
    void testConvertIntegerToEnglishString1001() {
        String res = IntegerToEnglishWords.numberToWords(1001);

        assertEquals("One Thousand One", res);
    }

    @Test
    void testConvertIntegerToEnglishString1000000() {
        String res = IntegerToEnglishWords.numberToWords(1000000);

        assertEquals("One Million", res);
    }

    @Test
    void testConvertIntegerToEnglishString100000() {
        String res = IntegerToEnglishWords.numberToWords(100000);

        assertEquals("One Hundred Thousand", res);
    }
}