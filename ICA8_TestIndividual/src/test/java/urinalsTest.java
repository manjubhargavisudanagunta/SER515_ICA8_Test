import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    urinals obj=new urinals();

    @Test
    void testgoodstring() {
        System.out.println("========Test one Executed ============");
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
        System.out.println("========Test two Executed ============");
        assertEquals(0,obj.Counturinals("1001"));
        assertEquals(-1,obj.Counturinals("1101"));
        assertEquals(0,obj.Counturinals("0100"));
        assertEquals(-1,obj.Counturinals("011"));
        assertEquals(0,obj.Counturinals("1"));
    }

    @Test
    void fileRead() {
        System.out.println("file reading is happening successfully");
        assertEquals("to open file" /src/urinals.dat);
    }

    @Test
    void fileWrite() {
        system.out.println("file writing is happening successfully");
        assertEquals("to write the file" /src/output.txt);
    }
}