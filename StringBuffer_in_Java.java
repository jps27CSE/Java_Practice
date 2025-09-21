public class StringBuffer_in_Java {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Jack");

        sb.append(" Pritom");

        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        
    }
}
