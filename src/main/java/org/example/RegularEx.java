package org.example;

public class RegularEx {
    public static boolean phoneNumberValidations(String number) {
        return number.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
    }
    public static String replaceSpacesWithOne(String text) {
        return text.replaceAll("\\s+", " ");
    }
    public static String removeHTMLTag(String text) {
        return text.replaceAll("<[^>]+>", "");
    }
}
