public class StringMethodDemo {
    public static void main(String[] args) {
        String s1="jonathan";
        String s2="john ";
        String s3="";

        System.out.println(s1+"\n");
        System.out.println(s1.equals(s2)+"\n");
        System.out.println(s1.charAt(3)+"\n");
        System.out.println(s1.length()+"\n");
        System.out.println(s1.compareTo(s2)+"\n");
        System.out.println(s1.replace('j','s')+"\n");
        System.out.println(s1.indexOf("jo")+"\n");
        System.out.println(s1.substring(2)+"\n");
        System.out.println(s1.substring(2,6)+"\n");
        System.out.println(s1.concat(s2)+"\n");
        System.out.println(s1.contains("tha")+"\n");
        System.out.println(s1.endsWith("han")+"\n");
        System.out.println(s3.isEmpty()+"\n");
        System.out.println(s1.toUpperCase()+"\n");
        System.out.println(s2.trim()+"\n");
        char c[];
        c=s1.toCharArray();
        for(int i=0;i<c.length;i++)
        System.out.print(c[i] +" ");

    }
}
