package org.example;

import org.apache.commons.lang3.StringUtils;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String badMetin = " M e       d       i p  o  l";
        //TODO: METINI DUZELT
        System.out.printf("Hatali Metin: " + badMetin + "\n");

        String fixedMetin = StringUtils.deleteWhitespace(badMetin);
        System.out.printf("Duzgun Metin: " + fixedMetin);

    }
}