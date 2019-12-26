package scrambleWordUseCase;

import java.util.Arrays;
import java.util.List;

public class regexApacheBeam {
  public static void main(String[] args) {
    String regex1 = "gs://india/sales/*";
    String regex2 = "gs://india/events/*";
    List<String> regexList = Arrays.asList(regex1,regex2);
    for (String regex  : regexList){
    StringBuilder out = new StringBuilder("^");
    for(int i = 0; i < regex.length(); ++i) {
      final char ch = regex.charAt(i);
      switch(ch) {
        case '*': out.append(".*"); break;
        case '?': out.append('.'); break;
        case '.': out.append("\\."); break;
        case '\\': out.append("\\\\"); break;
        default: out.append(ch);
      }
    }
    out.append('$');
    System.out.println(out);
    }



  }
}
