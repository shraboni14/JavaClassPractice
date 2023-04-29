public class Clss_enum {
    enum day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
    public static void main(String[] args) {
        for(day d : day.values())
        {
            System.out.println(d);
        }
        day myday = day.Wednesday;
        System.out.println(myday);
        int a =5 ;
        int b = 6;
        a = ++a;
        b = b++;
        System.out.println();

    }
}
