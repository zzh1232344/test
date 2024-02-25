using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//扩展方法
//静态类里的静态方法，参数列表最前面加个thi+要扩展的类型
//使用场景：在不修改源代码的情况下为其他类型增加功能  或者说增加方法
namespace ConsoleApp2
{

    public class Class2
    {
        public void show()
        {
            calcuate calcuate = new calcuate();
            int ?i = 0;

        }
    }
    class calcuate
    {
        public int add(int a,int b)
        {
            return a + b;
        }
    }
    static class calauatenew
    {
        public static int add1(this calcuate cal,int a, int b,int c)
        {
            return a + b+c;
        }
        public static int toint(this int? i)
        {
            if (i == null)
            {
                return 0;
            }
            else
            {
                return i.Value;
            }
        }
    }
    
}
