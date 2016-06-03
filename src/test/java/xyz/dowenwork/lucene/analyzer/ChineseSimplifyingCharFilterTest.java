package xyz.dowenwork.lucene.analyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.*;

public class ChineseSimplifyingCharFilterTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws IOException {
        String origin = "占門廁外正南";
        ChineseSimplifyingCharFilter charFilter = new ChineseSimplifyingCharFilter(new StringReader(origin));
        int nc;
        StringBuilder builder = new StringBuilder();
        while ((nc = charFilter.read()) != -1) {
            builder.append((char) nc);
        }
        assertEquals("占门厕外正南", builder.toString());
    }
}