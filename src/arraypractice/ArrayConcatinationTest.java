//package arraypractice;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class ArrayConcatinationTest {
//
//    @Test
//    void testNormalCase() {
//        String[] input = {"My", "name", "is", "Rimjhim"};
//        String expected = "My name is Rimjhim ";
//        assertEquals(expected, ArrayConcatination.arrayConcatenate(input));
//    }
//
//    @Test
//    void testEmptyArray() {
//        String[] input = {};
//        String expected = "";
//        assertEquals(expected, ArrayConcatination.arrayConcatenate(input));
//    }
//
//    @Test
//    void testSingleElement() {
//        String[] input = {"Hello"};
//        String expected = "Hello ";
//        assertEquals(expected, ArrayConcatination.arrayConcatenate(input));
//    }
//
//    @Test
//    void testArrayWithEmptyStrings() {
//        String[] input = {"", "", ""};
//        String expected = "  ";
//        assertEquals(expected, ArrayConcatination.arrayConcatenate(input));
//    }
//
//    @Test
//    void testArrayWithNullElements() {
//        String[] input = {null, "World"};
//        String expected = "null World ";
//        assertEquals(expected, ArrayConcatination.arrayConcatenate(input));
//    }
//}
//
