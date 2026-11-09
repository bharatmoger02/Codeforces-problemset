using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Legs
    {
        static void Main(string[] args)
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t-->0)
            {
                int n = Convert.ToInt32(Console.ReadLine());
                int count = 0;
                if (n <= 4)
                {
                    Console.WriteLine(1);
                    continue;
                }
                else
                {
                    count = n / 4;
                    count += ((n % 4) / 2);
                }
                Console.WriteLine(count);
            }
        }
    }
}
