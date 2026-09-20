public class Program5
{
    public static void main(String[] args)
    {
        int[] Arr = {13 , 34 , 2 , 56 , 34};

        int iMin = Arr[0];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }

        System.out.println("Min number is  : " + iMin);
    }
}
