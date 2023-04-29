class calculate{
    int countvowles(String str){
        int count = 0;
        for( int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        return count;
    }
}
public class Count_vowles {
    public static void main(String[] args) {
        String str = "My name is shraboni";
        calculate c1 = new calculate();
        System.out.println(c1.countvowles(str));

    }
}
