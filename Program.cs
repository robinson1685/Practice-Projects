using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day1
{
    class Program
    {
        static void Main(string[] args)
        {
            string line1 = " ";

            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("Type in the numbers and press Return: ");
            line1 = Console.ReadLine();
            if (line1 == "4 8 15 16 23 42")
            {
                Console.WriteLine("Recalibeating energy core ... Complete");
            }
            else
            {
                Console.WriteLine("FAILURE!");
                Console.Beep();
            }
        }
    }
}
