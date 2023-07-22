public class BoardPath {

    static int count = 0;

    public static void main(String[] args) {
        int n =3;
        Boardh(n,0,"");
        System.out.println(count);
    
    }

    private static void Boardh(int n, int curr, String ans) {
        if(curr==n){
            System.out.println(ans);
            count++;
            return;
        }

        if(curr>n){
            return;
        }

        for(int dice = 1;dice<n; dice++){
            Boardh(n,curr+dice,ans+dice);
        }
    }
    
}
