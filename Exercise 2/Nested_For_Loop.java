public class Nested_For_Loop {
    public static void main(String[] args)
    {
        int count = 1;
        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
