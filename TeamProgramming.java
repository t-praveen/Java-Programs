package codeForces;
import java.util.*;
class TeamProgramming
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            
            if(p+v+t>=2)
            {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}