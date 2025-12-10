public class strings {
    public static void main(String[] args) {
        String name = "JAVA FULL STACK";
        System.out.println(name.length());
        System.out.println(name.trim());
        System.out.println(name.substring(4,7));
        System.out.println(name.equalsIgnoreCase("Java"));
        System.out.println(name.equals("Java FULL STACK"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name.startsWith("java"));
        System.out.println(name.endsWith("python"));
        System.out.println(name.contains("python"));
        System.out.println(name.substring(4,7));
        System.out.println(name.replace('V', 'v'));
        System.out.println(name.compareTo("python full stack"));
        System.out.println(name.indexOf("A"));
        System.out.println(name.substring(-3,-1));
    }
}
