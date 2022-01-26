package com.apache;

import org.apache.commons.lang3.StringUtils;

public class StringWithLang3 {
    public static void main(String[] args) {
       boolean result = StringUtils.isNumeric("123ff");
        System.out.println(result);
    }
}
