public class StringExerxise2 {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));//jam
        System.out.println(getSandwich("xxbreadjambreadyy"));//jam
        System.out.println(getSandwich("xxbreadyy"));//""
        //System.out.println(countBread("breadjambread"));
        //betweenBread();

        //1. считаем "bread"
        //2. находим что есть между "bread"
    }

    private static String betweenBread(String str) {


        return "";
    }

    private static String getSandwich(String str) {
        int breadStart = str.indexOf("bread");
        int breadEnd = str.lastIndexOf("bread");
        if (breadStart != -1 && breadEnd != -1 && breadStart != breadEnd) {
            return str.substring(breadStart + 5, breadEnd);
        }

        return "";
    }

    private static int countBread(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            String temp = str.substring(i, i + 5);
            //System.out.println(temp);
            if (temp.contains("bread")) {
                count++;

            }
        }
        return count;
    }
}


