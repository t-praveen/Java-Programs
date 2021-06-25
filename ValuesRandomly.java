//PROGRAM TO PRINT RANDOM VALUES LESS THAN 100//

import java.util.Random;
class ValuesRandomly
{
    public static void main(String args[])
    {
        Random r=new Random();
        int a[]=new int[20];
        for(int i=0;i<a.length;i++)
            a[i]=r.nextInt(100);//To print random values less than 100//
        for(int i:a)
            System.out.println(i);
    }
}
