package DSA.Linearsearch;

public class stringsearch {
    public static void main(String[] args) {
        String name = "Ankita";
        char target = 'k';
        System.out.println(search(name,target));


    }

    static boolean search(String str,char taregt){
        if(str.length()==0) return false;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)==taregt){
            return true;
        }
       
    }
    return false;
  }
}
