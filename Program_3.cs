using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MyFirstProject.MyFirstDataTypes;

namespace MyFirstProject
{
    class Program
    {
        static void Main(string[] args)
        {
            #region Old Class-related code
            //Person john = new Person("John", "Doe"),
            //       jane = new Person("Jane");

            //string greeting = john.SayHello(jane);

            //Console.WriteLine(greeting);    
            //string[] names = new string[]
            //{
            //    "James",
            //    "John",
            //    "Jennifer",
            //    "Jackie"
            //};
            #endregion

            #region Adding names
            //Person jermey = new Person("Jeremy", "McPeak");

            //Console.WriteLine(jermey.SayHello(names));
            //Console.WriteLine(jermey.SayHello("James", "John", "Jennifer", "Jackie",
            //    "Josh", "Jermey"));
            # endregion

            #region List
            //var namesList = new List<string>();
            //namesList.AddRange(names);

            //var newList = namesList.FindAll((s) => s[1] == 'a');

            //foreach (var name in newList)
            //{
            //    Console.WriteLine(name);
            //}
            #endregion

            #region Dictionary
            //var dictionary = new Dictionary<string, string>();
            //dictionary.Add("a", "Jeremy");
            //dictionary.Add("bill", "Jeffery");

            //foreach (var kvp in dictionary)
            //{
            //    Console.WriteLine(kvp.Key + " = " + kvp.Value);
            //}

            //string value = dictionary["a"]; // Jeremy
            #endregion

            #region Object
            //Person jeremy = new Person("Jeremy", "McPeak");
            //object foo = jeremy;
            //Person jeremy2 = (Person)foo;

            //Console.WriteLine(foo);
            #endregion

            #region Virtural
            //Employee jermey = new Employee("Jeremy", "McPeak", "Owner");
            //Person customer = new Person("John", "Doe");

            //Console.WriteLine(jermey.SayHello(customer));
            #endregion

            #region Shapes
            //Shape shape = new Square(12);
            //Square square = new Square(10);

            //Console.WriteLine(shape.Area);
            #endregion

            #region Salary
            //ISalariable emp = new Employee("John", "Doe", "Sales Clerk", 2000);

            //decimal salary = emp.Salary;
            //emp.PaySalary();
            # endregion

            #region Polygon
            //Square square = new Square(10);
            //Circle circle = new Circle(10);

            //Console.WriteLine(ShapeUtility.IsPolygon(square));
            //Console.WriteLine(ShapeUtility.IsPolygon(circle));
            #endregion

            #region emp
            //Employee emp = new Employee("John", "Doe", EmployeePosition.Manager, 200000);
            #endregion

            #region Color
            //Square square = new Square(10, Color.Red);
            //Circle circle = new Circle(10, Color.White);
            #endregion

            #region Delgate

            //    List<string> names = new List<string>{
            //        "Jeremy",
            //        "Jeffrey",
            //        "John",
            //        "Jennifer",
            //        "Jackie",
            //        "Julianne"
            //    };

            //    Func<string, bool> fn = FindNamesWithE;
            //    //Predicate<string> pred = n =>
            //    //    n.IndexOf("e") == 1;

            //    Func<int, string, bool> fn2 = (i, s) => {
            //        return true;
            //    };
            //    bool result = fn("e");

            //    var namesWithE = names.FindAll (n =>
            //        n.IndexOf("e") == 1);

            //    foreach (var name in namesWithE)
            //    {
            //        Console.WriteLine(name);
            //    }
            //}

            //static bool FindNamesWithE(string name)
            //{
            //    return name.IndexOf("e") == 1;
            //}
            #endregion

            #region Exception Handling
            //try
            //{
            //    //throw new System.Net.WebException();
            //    //throw new System.IO.FileNotFoundException();
            //    //throw new OutOfMemoryException();
            //}
            //catch (System.Net.WebException webEx)
            //{
            //    Console.WriteLine("We cannot retrive the requested web resource");
            //}
            //catch (System.IO.FileNotFoundException fileEx)
            //{
            //    Console.WriteLine("We cannot find the file needed to save the document");
            //}
            //            catch (Exception ex)
            //{
                
            //    Console.WriteLine("Something happened");
            //}
            //finally
            //{
            //    Console.WriteLine("We're in the finally block");
            //}
            #endregion

            WriteTimesTime(2);

            Console.WriteLine("We're out of WriteTimesTable");

        }
        static void WriteTimesTime(int multiplier)
        {
            for (int i = 1; i < 13; i++)
            {
                string str = string.Format("{0} * {1} = {2}", i, multiplier, i * multiplier);

                Console.WriteLine(str);
            }
        }
    }
}