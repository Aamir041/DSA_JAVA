// link : https://leetcode.com/problems/assign-cookies/description/
import java.util.Arrays;
public class AssignCookies {
    public static void main(String[] args) {
       int[] g = {1,2};
       int[] s = {1,2,3};
       System.out.println(findContentChildren(g, s));
    }

    static int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int numChild = 0;
        int i = 0;
        int j = 0;

        while(i < g.length && j < s.length ){
            if(s[j] >= g[i]){
                numChild++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return numChild;
    }
}
