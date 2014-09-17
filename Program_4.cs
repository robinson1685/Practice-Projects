using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Auto
{
    class Program
    {
        static void Main(string[] args)
        {
            Automobile myCar = new Automobile();
            myCar.Speed = 0;
            myCar.Make = "Cadillac";
            myCar.Model = "CTS";
            myCar.Year = 2014;
            myCar.Color = "Black";
            myCar.Miles = 30000;

            Console.WriteLine(myCar.Make + " " + myCar.Model);

            myCar.Accelerate();
            myCar.Accelerate();
            myCar.Accelerate();
            myCar.Decelerate();
            Console.ReadLine();

        }
    }
}
