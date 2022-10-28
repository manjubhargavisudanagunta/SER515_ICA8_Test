import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    urinals obj=new urinals();

    @Test
    void testgoodstring() {
        assertEquals(0,obj.goodstring("1100"));
        assertEquals(1,obj.goodstring("1010"));
        assertEquals(0,obj.goodstring("1011"));
        assertEquals(1,obj.goodstring("0000"));

    }

    @Test
    void main() {
    }

    @Test
    void counturinals() {
        assertEquals(0,obj.Counturinals("1001"));
        assertEquals(-1,obj.Counturinals("11001"));
        assertEquals(0,obj.Counturinals("0100"));
        assertEquals(-1,obj.Counturinals("011"));
    }
}