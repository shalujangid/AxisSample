import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is shalu"," ");

        while (st.hasMoreTokens()) {
            System.out.println(st.countTokens());
            System.out.println(st.nextToken());
        }
    }
}