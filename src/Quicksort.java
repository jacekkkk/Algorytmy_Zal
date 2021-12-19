public class Quicksort {
    static void quick_sort(int[] a, int h, int j) {
        if (h < j) {

            int z = partition(a, h, j);

            quick_sort(a, h, j);

            quick_sort(a, h + 1, j);

        }
    }

    private static int partition(int[] a, int h, int j)
    {
        int x = a[h];

        int y = h - 1, g = j + 1;

        for (; ;)
        {
            while (a[--g] > x);

            while (a[++y] < x);

            if (y < g)

                swap(ref a[y], ref a[g], ref a[6]);

            else

                return j;


            static void swap(ref int a, ref int b,  ref int c)
            {
                int x;

                x=a;

                a=b;

                b=x;

                c++;


                if (c <= 3)
                    Console.Writeline((a -1) + "" + (b - 1));

            }

            static void Main(string[] args)
            {
                int[] tablica = { 6, 5, 4, 3, 2, 1, 9, 8, 7, 0 };

                quick_sort(tablica, 0, 8);
            }

        }


    }





}
