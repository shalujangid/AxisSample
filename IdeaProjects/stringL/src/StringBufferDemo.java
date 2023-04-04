public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer strbuf=new StringBuffer("Shalu");
        System.out.println(strbuf.length()+"\n");
        strbuf.append(" Jangid");
        System.out.println(strbuf+"\n");
        strbuf.insert(6,"sh");
        System.out.println(strbuf+"\n");
        strbuf.setCharAt(5,' ');
        System.out.println(strbuf+"\n");
        strbuf.charAt(4);
        System.out.println(strbuf+"\n");
        strbuf.deleteCharAt(6);
        System.out.println(strbuf+"\n");
        System.out.println("Capacity of string buffer");
        System.out.println(strbuf.capacity());
        System.out.println(strbuf.reverse());
        strbuf.reverse();
        strbuf.substring(4);
        System.out.println(strbuf+"\n");
        strbuf.subSequence(1,2);
        System.out.println(strbuf+"\n");

    }
}
