package pl.gswistak.mavenreleasetest;

import java.io.Serializable;

public class ClassWithField implements Serializable {

    private String field;

    public ClassWithField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
