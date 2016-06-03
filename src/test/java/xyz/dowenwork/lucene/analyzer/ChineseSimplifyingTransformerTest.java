package xyz.dowenwork.lucene.analyzer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChineseSimplifyingTransformerTest {
    @Test
    public void testTraditionalToSimplified() {
        String origin = "占門廁外正南";
        String simplified = ChineseSimplifyingTransformer.traditionalToSimplified(origin);
        assertNotNull(simplified);
        assertEquals("占门厕外正南", simplified);
    }

}