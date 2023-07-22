public class Subsequene {

    public static void main(String[] args) {
        String s = "abc";
        printsub(s,"");
    }

    public static void printsub(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans+" ");
            return;
        }

        char ch = ques.charAt(0);
        printsub(ques.substring(1), ans);
        printsub(ques.substring(1), ans+ch);
    }
    
}
