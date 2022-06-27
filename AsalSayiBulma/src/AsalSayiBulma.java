public class AsalSayiBulma {
    public static void main(String[] args) throws Exception {
        int sayac=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1)continue;
                else if(i%j==0)sayac++;
            }
            if(sayac==2)System.out.print(i+" ");
            sayac=0;
        }
    }
}
