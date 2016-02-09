public class Leetspeak {
  public static void main(String[] args){}

    public String isNotLeetspeak(String word){
      return word;
    }
//seems like this method is obsolete after your tests
    public String isLeetspeak(String word) {
    word = word.toLowerCase();
    for (Integer i=0; i <= word.length(); i++){
      word = word.replaceAll("o", "0");
      word = word.replaceAll("e", "3");
      word = word.replaceAll("i", "1");
      if (word.startsWith("s")){
        word = word.replaceAll("s", "z");
        word = word.replaceFirst("z", "s");
      } else {
        word = word.replaceAll("s", "z");
      }
      word = word.replaceAll(" z", " s");
    }
    return word;
  }
}
