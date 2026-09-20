
public class Program7
{
    static boolean isPalindrome(int[] Arr)
    {
        int start = 0;
        int end = Arr.length - 1;

        while(start < end)
        {
            if(Arr[start] != Arr[end])
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[] Arr = {1, 2, 3, 2, 1};

        if(isPalindrome(Arr))
        {
            System.out.println("Array is Palindrome");
        }
        else
        {
            System.out.println("Array is Not Palindrome");
        }
    }
}