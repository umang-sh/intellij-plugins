package org.intellij.plugins.postcss.inspections;

import com.intellij.testFramework.TestDataPath;
import org.intellij.plugins.postcss.PostCssFixtureTestCase;
import org.jetbrains.annotations.NotNull;

@TestDataPath("$CONTENT_ROOT/testData/inspections/mediaRanges/")
public class PostCssMediaRangeInspectionTest extends PostCssFixtureTestCase {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    myFixture.enableInspections(PostCssMediaRangeInspection.class);
  }

  public void testIncorrectMediaRange() {
    doTest();
  }

  public void testIncorrectSignDirection() {
    doTest();
  }

  public void testIncorrectSignDirectionWithDifferentOperators() {
    doTest();
  }

  public void testCorrectSignDirection() {
    doTest();
  }

  public void testEqualSigns() {
    doTest();
  }

  public void testOneEqualSignOfTwo() {
    doTest();
  }

  public void testOneSign() {
    doTest();
  }

  private void doTest() {
    myFixture.testHighlighting(true, false, false, getTestName(true) + ".pcss");
  }

  @NotNull
  @Override
  protected String getTestDataSubdir() {
    return "mediaRanges";
  }
}