package pl.gswistak.mavenreleasetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.*;

class ClassWithFieldTest {

    private static final String DEFAULT_FIELD_VALUE = "DEFAULT_FIELD_VALUE";
    private static final String CHANGED_FIELD_VALUE = "CHANGED_FIELD_VALUE";

    private ClassWithField classWithField;

    @BeforeEach
    void setUp() {
        this.classWithField = new ClassWithField(DEFAULT_FIELD_VALUE);
    }

    @Test
    void getField() {
        assertEquals(DEFAULT_FIELD_VALUE, classWithField.getField());
    }

    @Test
    void setField() {
        classWithField.setField(CHANGED_FIELD_VALUE);

        assertEquals(CHANGED_FIELD_VALUE, classWithField.getField());
    }

    @Test
    void shouldImplementSerializable() {

        assertTrue(classWithField instanceof Serializable);
    }
}