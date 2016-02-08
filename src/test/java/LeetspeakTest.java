import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest{

  @Test
  public void isNotLeetspeak_returnsSameStringIfNoLeetspeakIsPresent_wordDoesntChange(){
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("happy", LeetspeakTest.isNotLeetspeak("happy"));
  }

  @Test
  public void isLeetspeak_returnCorrectRegardlessOfCase_wordChanges () {
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("1 scr3am", LeetspeakTest.isLeetspeak("I scream"));
  }

  @Test
  public void isLeetspeak_returns3ifletterisE_wordChanges() {
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("3l3phant", LeetspeakTest.isLeetspeak("elephant"));
  }

  @Test
  public void isLeetspeak_returns0ifletterisO_wordChanges() {
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("b00 b00", LeetspeakTest.isLeetspeak("boo boo"));
  }

  @Test
  public void isLeetspeak_returns1ifletterisI_wordChanges() {
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("1 l1k3 1k3", LeetspeakTest.isLeetspeak("i like ike"));
  }

  @Test
  public void isLeetspeak_returnsZifletterisS_wordChanges() {
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("r0z3z ar3 r3d", LeetspeakTest.isLeetspeak("roses are red"));
  }

  @Test
  public void isLeetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    Leetspeak LeetspeakTest = new Leetspeak();
    assertEquals("sazzy sunzh1n3", LeetspeakTest.isLeetspeak("sassy sunshine"));
  }
}
