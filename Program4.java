public class Program4
{
    public static void main(String[] args)
    {
        int[] Arr = {13 , 34 , 2 , 56 , 34};

        int iEven = 0;
        int iOdd = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Even number is  : " + iEven);
        System.out.println("Oddd number is  : " + iOdd);
    }
}
