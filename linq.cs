using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class linq
    {
        ///<summary>
        ///Linq to object（数组、list集合） 内存里面的数据
        ///Linq to sql(查询数据库用的） 在数据库数据
        ///Lin去 to XMl 查询XML文件

        #region 初始化对象
        List<student1> studentlist = new List<student1>()
        {
            new student1()
            {
                Id = 1,
                Name = "Test",
                classid = 1,
                age = 1,
            },
            new student1()
            {
                Id = 1,
                Name = "Test",
                classid = 1,
                age = 1,
            },
            new student1()
            {
                Id = 1,
                Name = "Test",
                classid = 1,
                age = 1,
            },
            new student1()
            {
                Id = 1,
                Name = "Test",
                classid = 1,
                age = 1,
            },
             new student1()
            {
                Id = 2,
                Name = "Test1",
                classid = 2,
                age = 2,
            },

              new student1()
            {
                Id = 3,
                Name = "Test2",
                classid = 3,
                age = 3,
            },
               new student1()
            {
                Id = 45,
                Name = "Test3",
                classid = 4,
                age = 4,
            },
        };

        #endregion
        public void show()
        {
            List<student1> list = new List<student1>();
            List<student1>list2=antwere(studentlist,test);
            //自定义linq
            List<student1>list3=antwere(studentlist,x=>x.Id==1);
            //官方linq   扩展方法版
            List<student1>list4=studentlist.Where(x=>x.classid==2).ToList();
            var list5=studentlist.Where(x=>x.classid==2);
            //表达式版
            var list1=(from s in studentlist
                                where s.Id==1
                                select s).Count();

            //foreach (var item in studentlist)
            //{
            //    if (item.Id == 1)
            //    {
            //        list.Add(item);
            //    }
            //}
            //foreach (var item in studentlist)
            //{
            //    if (item.age > 1)
            //    {
            //        list.Add(item);
            //    }
            //}
        }
        public List<student1> antwere(List<student1>resource,Func<student1,bool>func) 
        {
            List<student1>list = new List<student1>();
            foreach (var item in resource)
            {
                //if (item.Id==1)
                //{
                //    list.Add(item);
                //}
                if (func.Invoke(item))
                {
                    list.Add(item);
                }
            }
            return list;
        }
        Func<student1, bool> func=test;
        public static bool test (student1 student1)
        {
            return student1.Id == 1;
        }
    }

}
