package com.split.tools;


import static java.util.Arrays.asList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class SplitTest
{
    @Test
    public void oneDivisorCharTest()
    {
        List<String> realResult = mySplit.splitMe("a,,b,c", ",");
        List<String> expectedResult = asList("a", "b", "c");

        assertEquals(expectedResult.size(), realResult.size());
    }

    @Test
    public void emptyStringsTest()
    {
        List<String> realResult = mySplit.splitMe("adbcda", "db");
        List<String> expectedResult = asList("a", "cda");

        assertEquals(expectedResult.size(), realResult.size());
    }

    @Test
    public void soniasHellTest()
    {
        List<String> realResult = mySplit.splitMe("bc,bc,abc,bdbcbc,abbbc,bc,", "bc,");
        List<String> expectedResult = asList("a", "bdbc", "abb");

        assertEquals(expectedResult.size(), realResult.size());
    }
}
