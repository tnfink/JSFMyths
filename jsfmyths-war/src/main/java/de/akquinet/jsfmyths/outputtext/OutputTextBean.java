package de.akquinet.jsfmyths.outputtext;

import javax.inject.Named;

@Named
public class OutputTextBean {

    private final String text1="Hello World";

    private final String text2="Hello <b>fat World</b>!";

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
