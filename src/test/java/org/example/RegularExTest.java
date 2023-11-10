package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExTest {
    @Test
    void test1() {
        String number = "(+380)50-333-33-33";
        boolean result = RegularEx.phoneNumberValidations(number);
        assertTrue(result);

        number = "(380)50-333-33-33";
        result = RegularEx.phoneNumberValidations(number);
        assertFalse(result);

        number = "(+280)50-333-33-33";
        result = RegularEx.phoneNumberValidations(number);
        assertFalse(result);

        number = "(+380)509-333-33-33";
        result = RegularEx.phoneNumberValidations(number);
        assertFalse(result);
    }

    @Test
    void test2() {
        String text = "Я хочу    бути     програмістом";
        String result = RegularEx.replaceSpacesWithOne(text);
        assertEquals("Я хочу бути програмістом", result);
    }

    @Test
    void test3() {
        String text = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";
        String result = RegularEx.removeHTMLTag(text);
        System.out.println("Text cleaned of HTML tags: " + result);
    }
}