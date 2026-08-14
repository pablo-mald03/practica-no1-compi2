package com.pablocompany.practica.no1.compi2.infrastructure.semantic.services;

import com.pablocompany.practica.no1.compi2.infrastructure.semantic.services.enums.IdentifierFormatEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TranslateExpressionService {

    /*
     * This is the universal translate method
     */
    private String translate(String identifier) {
        if (identifier == null || identifier.isEmpty()) {
            return identifier;
        }

        IdentifierFormatEnum format = detectFormat(identifier);

        String baseTranslation = translateBase(identifier.toLowerCase());

        return applyFormat(baseTranslation, format, identifier);
    }

    /*
     * This method detects the identifier format
     */
    private IdentifierFormatEnum detectFormat(String identifier) {
        if (identifier == null || identifier.isEmpty()) {
            return IdentifierFormatEnum.LOWERCASE;
        }

        boolean hasUnderscore = identifier.contains("_");
        boolean isAllUpperCase = true;
        boolean isAllLowerCase = true;
        boolean isFirstUpperCase = Character.isUpperCase(identifier.charAt(0));
        boolean hasLowerCaseAfterFirst = false;
        boolean hasUpperCaseAfterFirst = false;
        boolean hasMultipleWords = false;

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);

            // Saltar guiones bajos para análisis de mayúsculas/minúsculas
            if (c == '_') {
                continue;
            }

            if (Character.isUpperCase(c)) {
                isAllLowerCase = false;
                if (i > 0) {
                    hasUpperCaseAfterFirst = true;
                    if (i > 0 && identifier.charAt(i - 1) != '_') {
                        hasMultipleWords = true;
                    }
                }
            } else if (Character.isLowerCase(c)) {
                isAllUpperCase = false;
                if (i > 0) {
                    hasLowerCaseAfterFirst = true;
                }
            }
        }

        if (hasUnderscore && isAllUpperCase) {
            return IdentifierFormatEnum.UPPER_SNAKE;
        }

        if (hasUnderscore && isAllLowerCase) {
            return IdentifierFormatEnum.LOWER_SNAKE;
        }

        if (isAllUpperCase && !hasUnderscore) {
            return IdentifierFormatEnum.UPPERCASE;
        }

        if (isFirstUpperCase && isAllLowerCase && !hasUnderscore && identifier.length() > 0) {
            boolean onlyFirstUpperCase = true;
            for (int i = 1; i < identifier.length(); i++) {
                if (Character.isUpperCase(identifier.charAt(i))) {
                    onlyFirstUpperCase = false;
                    break;
                }
            }
            if (onlyFirstUpperCase) {
                return IdentifierFormatEnum.CAPITALIZED;
            }
        }

        if (!isFirstUpperCase && hasUpperCaseAfterFirst && !hasUnderscore) {
            return IdentifierFormatEnum.CAMEL_CASE;
        }

        if (isFirstUpperCase && hasUpperCaseAfterFirst && !hasUnderscore) {
            return IdentifierFormatEnum.PASCAL_CASE;
        }

        return IdentifierFormatEnum.LOWERCASE;
    }

    /*
     * Base translation identifier
     */
    private String translateBase(String identifier) {
        if (identifier == null || identifier.isEmpty()) {
            return identifier;
        }

        char firstChar = identifier.charAt(0);

        if (isVowel(firstChar)) {
            return identifier + "way";
        } else {
            return translateConsonantStart(identifier);
        }
    }

    /*
     * Translate following the first rule
     */
    private String translateConsonantStart(String identifier) {
        int firstVowelIndex = findFirstVowelIndex(identifier);

        if (firstVowelIndex == -1) {
            return identifier + "ay";
        }

        String consonants = identifier.substring(0, firstVowelIndex);
        String rest = identifier.substring(firstVowelIndex);

        return rest + consonants + "ay";
    }

    /*
     * Find the first vowel index
     */
    private int findFirstVowelIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    /*
     *Verify if the first word is a vowel
     */
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú';
    }

    /*
     * This method translate the identifier with the format
     */
    private String applyFormat(String translated, IdentifierFormatEnum format, String original) {
        switch (format) {
            case UPPERCASE:
                return translated.toUpperCase();

            case CAPITALIZED:
                return Character.toUpperCase(translated.charAt(0)) + translated.substring(1);

            case UPPER_SNAKE:
                return translated.toUpperCase();

            case LOWER_SNAKE:
                return translated.toLowerCase();

            case CAMEL_CASE:
                String camelResult = translated.toLowerCase();
                return toCamelCase(camelResult);

            case PASCAL_CASE:
                return Character.toUpperCase(translated.charAt(0)) + translated.substring(1);

            case LOWERCASE:
            default:
                return translated.toLowerCase();
        }
    }

    /*
    * Converts to camel case rule
    */
    private String toCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '_') {
                capitalizeNext = true;
                continue;
            }

            if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }

    // ===== PUBLIC METHODS (USE ACCORDING THE CASE) =====
    public String translatePreserveCase(String identifier) {
        return translate(identifier);
    }

    public String translateUpperCase(String identifier) {
        return translate(identifier).toUpperCase();
    }

    public String translateLowerCase(String identifier) {
        return translate(identifier).toLowerCase();
    }

    public List<String> translateIdentifiers(List<String> identifiers) {
        if (identifiers == null) {
            return new ArrayList<>();
        }
        return identifiers.stream()
                .map(this::translate)
                .collect(Collectors.toList());
    }

}
