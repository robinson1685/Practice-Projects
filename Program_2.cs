using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Day2Homework
{
    class Program
    {
        static void Main(string[] args)
        {
            StreamReader myReader = new StreamReader("DecodeThis.txt");
            string line = "";

            while (line != null)
            {
                line = myReader.ReadLine();
                if (line != null)
                {
                   char[] charArray = line.ToCharArray();
                   Array.Reverse(charArray);
                   Console.WriteLine(charArray);
                }
         }
            
            myReader.Close();
            Console.ReadLine();

        }
    }
}
