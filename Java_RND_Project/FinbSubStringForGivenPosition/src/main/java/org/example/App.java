package org.example;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        String inputStr = "I am a good man. But I am again a bad man. I am again a funny man";
        String subStr = "am";
        System.out.println(inputStr);
        String afterReplace = replaceSubStringAtIndex(1, inputStr, subStr, "was");
        System.out.println(afterReplace);
    }

    public static String replaceSubStringAtIndex(int index, String inputStr, String subStr, String replaceStr){
        int posAt =  indexOfSubstringAt(inputStr, subStr, index);
        StringBuilder sb = new StringBuilder(inputStr);
        sb.replace(posAt, subStr.length()+posAt, replaceStr);
        return  sb.toString();
    }

    public static int indexOfSubstringAt(String inputStr, String subStr, int n) {
        int pos = -1;
        do {
            pos = inputStr.indexOf(subStr, pos + 1);
        } while (n-- > 0 && pos != -1);
        return pos;
    }
}
