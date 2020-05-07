package jsonparser;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.apache.commons.text.StringSubstitutor;

public class Template implements Function<String, String> {

  private final Map<String, String> context;

  public Template() {
    this.context = new HashMap<>();
  }

  public static Template with(String variable, String value) {
    return new Template().and(variable, value);
  }

  public Template and(String variable, String value) {
    context.put(variable, value);
    return this;
  }

  @Override
  public String apply(String template) {
    return StringSubstitutor.replace(template, context);
  }
}

