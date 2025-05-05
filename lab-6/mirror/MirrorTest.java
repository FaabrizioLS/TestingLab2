package tudelft.mirror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    @Test
    public void testMirrorWithFullMatch() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    public void testMirrorWithPartialMatch() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testMirrorWithSingleCharMatch() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    public void testMirrorWithNoMatch() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("xyz"));
    }

    @Test
    public void testMirrorWithEmptyString() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    public void testMirrorWithSingleCharacter() {
        Mirror mirror = new Mirror();
        assertEquals("x", mirror.mirrorEnds("x"));
    }

    @Test
    public void testMirrorWithEvenLengthFullMatch() {
        Mirror mirror = new Mirror();
        assertEquals("abba", mirror.mirrorEnds("abbaabba"));
    }
}
