using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    //IEnumerable可枚举类型--可迭代类型
    //IEnumerator枚举器
    //Enum枚举
    //yield是一个迭代器，相当于实现了IEnumerator枚举器
    public class Class1
    {
        public void show()
        {
            student student1 = new student { id=1};
            int[] arr = { 1, 2, 3, 4, 5 };
            string s = "sasdfa";
            foreach (var i in student1)
            {
                Console.WriteLine(i);
            }
        }
    }
    class student:IEnumerable
    {
        public int id { get; set; }

        public IEnumerator GetEnumerator()
        {
            yield return "asdfas1";
            yield return "asdfas2";
            yield return "asdfas3";
        }
    }
}
