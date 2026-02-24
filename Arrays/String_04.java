public class String_04 {
    public static void main(String[] args) {
        
        String s1="Avi";
        String s2="Avi";
        System.out.println(s1==s2); //dont make another object for s2 just inside s2 it store "Avi's" address

        StringBuffer sb=new StringBuffer("Abhisek");
        System.out.println(sb.capacity());
        sb.append(" PC");
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
