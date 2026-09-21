public class Program8
{
    public static void main(String[] args)
    {
        int[] Arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] > largest)
            {
                secondLargest = largest;
                largest = Arr[i];
            }
            else if (Arr[i] > secondLargest && Arr[i] < largest)
            {
                secondLargest = Arr[i];
            }
        }

        System.out.println("Second Max : " + secondLargest);
    }
}