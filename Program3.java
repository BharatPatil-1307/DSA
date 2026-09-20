public class Program3
{
    public static void main(String[] args)
    {
        int[] Arr = {13 , 34 , 2 , 56 , 34};

        int iMax = Arr[0];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];;
            }
        }

        System.out.println("Max number is  : " + iMax);
    }
}
