public class StringLab
{
    public static void main(String[] args)
    {
        String str = "Welcome to the Java String Lab!";
        String strlower = str.toLowerCase();
        String strupper = str.toUpperCase();
        String replaceString = str.replace('t','e');
        String str2 = "java string lab!";
        String[] arrOfStr = str.split("e", 5);
        char result = str.charAt(7);
        System.out.println("string length is: " + str.length());
        System.out.println(str.trim()+"how are you");
        System.out.println(strlower);
        System.out.println(strupper);
        System.out.println(replaceString);
        System.out.println(str.contains("Lab"));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str2));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.substring(13, 17));
        System.out.println(result);
        
        
        for (String a : arrOfStr)
        System.out.println(a);

        StringBuilder sb = new StringBuilder();

        sb.append("Learning java");
        System.out.println(sb.toString());
        sb.insert(13," is fun ");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.delete(13, 21);
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer();

        sb2.append("MultiThreading lab");
        System.out.println(sb2.toString());
        sb2.insert(18," is fun ");
        System.out.println(sb2.toString());
        sb2.reverse();
        System.out.println(sb2.toString());
        sb2.delete(5, 13);
        System.out.println(sb2.toString());









        




    }

}