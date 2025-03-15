public class MainCliente {
    public static void main(String[] args){
        String n = "-";
        String p = "-";
        String c = "123-4";

        System.out.println(n == p);
        System.out.println(n.charAt(n.length()-1) == p.charAt(p.length()-1));
        System.out.println(n.substring(0).equals("-"));

        if(c.length() >= 4 && c.charAt(3) == '-'){

        }

    }
}
