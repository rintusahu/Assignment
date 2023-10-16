public class Answer3 {
    public String panagram(String s){
        s = s.toLowerCase();
        for (char ch ='a'; ch<='z'; ch++){
            if (s.indexOf(ch)==-1){
                return "not a panargam";
            }
        }
        return "a panagram";
    }

    public static void main(String[] args) {
        Answer3 a = new Answer3();
        String s = a.panagram("abcdefghijKlmnopqrstuvwxyZ");
        System.out.println(s);
    }
}
