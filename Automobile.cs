using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Auto
{
    class Automobile
    {
        public string Make;
        public string Model;
        public int Year;
        public string Color;
        public int Miles;
        public int Speed;

        public void Accelerate()
        {
            Speed++;
            Console.WriteLine("Current Speed: " + Speed.ToString());

        }

        public void Decelerate()
        {
            Speed--;
            Console.WriteLine("Current Speed: " + Speed.ToString());
        }
    }
}
