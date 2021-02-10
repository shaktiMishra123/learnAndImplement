package stack;

public class SimplifyPath {

  //ip:  /c/./a/b/d/../e/../..//./f/../../
  //op: /c

  // array [c,.,a,b,d,..,e,..,..,,.,f,..,..]
  // [c]

  public static void main(String[] args) {
    String unixPath = "/c/./a/b/d/../e/../..//./f/../../a/f";
    simplifyPath(unixPath);
    System.out.println(simplifyPath(unixPath));
  }

  //Time Complexity O(2n) = O(n)
  // Space Complexity O(n)
  public static String simplifyPath(String unixPath){
    Stack<String> unixPathStack = new Stack<>();
    String[] unixPaths = unixPath.split("/");
    for (String path : unixPaths ){
      if(!path.equals(".") && !path.equals("")){
        if(path.equals("..")){
          unixPathStack.pop();
        }
        else {
          unixPathStack.push(new Node<>(path));
        }
      }
    }
    String returnedPath = "";
    while (!unixPathStack.isEmpty()){
      returnedPath = "/" + unixPathStack.pop().data + returnedPath;
    }
    return returnedPath;
  }
}
