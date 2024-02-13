package DSA.string;

public class substring {

    // public static String Substring(String str,int si,int ei) {
    //     String substr=" ";
    //     for(int i=si;i<ei;i++) {
    //         substr+=str.charAt(i);
    //     }
    //     return substr;
    // }
    // public static void main(String[] args) {
    //     String str ="HelloWorld";
    //     System.out.println(Substring(str,0,5));
    // }

    //now instead of writing this logic java has an inbuilt functon for substring
    //i.e str.substring ....lets use it 
    public static void main(String[] args) {
        String str="Helloworld";
        System.out.println(str.substring(0,4));
    } 
}
