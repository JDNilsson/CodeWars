package testFolder;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.nio.charset.Charset;
import java.io.IOException;
import java.nio.file.*;
public class TestJavaSolutions {
  
  
  @Test
  public void testVowelCount() {
    String dummyString;
    try {
      dummyString = Files.readString(FileSystems.getDefault().getPath("C:\\Users\\minec\\gitRepon\\CodeWars\\src\\testFolder\\inputFiles\\300Words.txt"),Charset.defaultCharset());
    } catch (IOException e) {
      e.printStackTrace();
      dummyString = "";
    }
    System.out.println(dummyString);
    int expectedResult = 294;
    assertEquals(expectedResult, katas.kyu7.VowelCount.getCount(dummyString));
  }

}
