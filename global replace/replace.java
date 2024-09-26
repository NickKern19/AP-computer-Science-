import java.util.ArrayList;
import java.util.List;

public class replace
{

  private static List<String> savedText = new ArrayList<>();
  public static String replaceOne(String text, int i, int n, String sub)
  {
    return text.substring(0, i) + sub + text.substring(i + n);
  }
  public static String replaceAll(String text, String what, String sub)
  {

    savedText.add(text);
    String modifiedText = text;
    int whatLength = what.length();
    int subLength = sub.length();
    int index = modifiedText.indexOf(what);
    while (index != -1) {
      modifiedText = replaceOne(modifiedText, index, whatLength, sub);
      index = modifiedText.indexOf(what);
    }
    return modifiedText;
  }
  public static String undoReplaceAll()
  {
    if (savedText.isEmpty()) {
      return null;
    }
    return savedText.remove(savedText.size() - 1);
  }

  public static void main(String[] args)
  {
    String text = "never say never";
    System.out.println(text);
    text = replaceAll(text, "never", "sometimes");
    System.out.println(text);
    text = replaceAll(text, "say", "think");
    System.out.println(text);
    text = undoReplaceAll();
    System.out.println(text);
    text = undoReplaceAll();
    System.out.println(text);
  }
}