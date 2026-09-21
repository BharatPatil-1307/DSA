public class Program10
{
    public static void main(String[] args)
    {
        int[] Arr = {1, 2, 1, 3, 2, 1};

        boolean[] visited = new boolean[Arr.length];

        for (int i = 0; i < Arr.length; i++)
        {
            if (visited[i])
            {
                continue;
            }

            int iCount = 0;

            for (int j = 0; j < Arr.length; j++)
            {
                if (Arr[i] == Arr[j])
                {
                    iCount++;
                    visited[j] = true;
                }
            }

            System.out.println(Arr[i] + " -> " + iCount + " times");
        }
    }
}