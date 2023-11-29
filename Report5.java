public class Report5{
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
          } catch (NullPointerException err) {
            System.out.println("長さを確認できません。");
            System.err.println(err.getMessage());
          }
    }
}