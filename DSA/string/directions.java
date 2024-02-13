package DSA.string;

public class directions {

public static float shortestpath(String str) {
    int x=0,y=0;
    for(int i=0;i<str.length();i++){
        char dir = str.charAt(i);
        //south
        if(dir == 'S'){
            y--;
        }
        //north side
        else if(dir == 'N'){
            y++;
        }
        //west side
        else if(dir == 'W'){
            x--;
        }
        //east side
        else {
            x++;
        }
    }
    int x2 = x*x;
    int y2 = y*y;
    return (float)Math.sqrt(x2+y2);
}

    public static void main(String[] args) {
        String str ="WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}
