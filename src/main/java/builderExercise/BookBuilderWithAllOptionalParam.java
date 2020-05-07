package builderExercise;

public class BookBuilderWithAllOptionalParam {
  private final String title;
  private final String author;
  private final String publisher;

  public BookBuilderWithAllOptionalParam(Builder builder) {
    this.title = builder.title;
    this.author = builder.author;
    this.publisher = builder.publisher;
  }

  public static class Builder{
    private String title = "Let Us C";
    private String author = "Yashvant Karnetkar";
    private String publisher = "abc";

    public Builder setTitle(String value){
      title = value;
      return this;
    }
    public Builder setAuthor(String value){
      author = value;
      return this;
    }
    public Builder setPublisher(String value){
      publisher = value;
      return this;
    }

    public BookBuilderWithAllOptionalParam build(){
      return new BookBuilderWithAllOptionalParam(this);
    }
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", publisher='" + publisher + '\'' +
        '}';
  }

}
