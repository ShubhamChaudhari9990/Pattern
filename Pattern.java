public class Pattern {
    public static void main(String[] args) {

//       1
//     2 1 2
//   3 2 1 2 3 
// 4 3 2 1 2 3 4
        // int n=4;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=i;j<=n;j++)
        //     {
        //         System.out.print("  ");   
        //     }
        //     for(int j=i;j>0;j--)
        //     {
        //         // j++;
        //         System.out.print(" "+j);   
        //     }
        //     for(int j=2;j<=i;j++)
        //     {
        //         System.out.print(" "+j+" ");   
        //     }
        //     System.out.println();
        // }
        


    //      4
    //     345
    //    23456
    //   1234567
        // int a=4;
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=i;j<4;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int p=a;p<=4;p++)
        //     {
        //         System.out.print(p);
        //     }
        //     a--;   
        //     int b=5;                   
        //     for(int j=2;j<=i;j++)
        //     {
                
        //         System.out.print(b);
        //         b++;
        //     }          
        //     System.out.println();
        // }


    //      1
    //     232
    //    34543
    //   4567654

        int b=2;                   
        for(int i=1;i<=4;i++)
        {
            for(int j=i;j<4;j++)
            {
                System.out.print(" ");
            }
            int a=i;
            for(int j=1;j<=i;j++,a++)
            {
                System.out.print(a);
            }
            if(i>=2)
            {  
                for(int j=b;j>=i;j--)
                {
                    System.out.print(j);
                }
                b=b+2; 
            }       
            System.out.println();        
        }
    }
}