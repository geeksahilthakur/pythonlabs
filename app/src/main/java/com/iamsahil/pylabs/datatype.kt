package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class datatype : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datatype)



        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cdv1.showCode("a = 5\n" +
                "print(a, \"is of type\", type(a))\n" +
                "\n" +
                "a = 2.0\n" +
                "print(a, \"is of type\", type(a))\n" +
                "\n" +
                "a = 1+2j\n" +
                "print(a, \"is complex number?\", isinstance(1+2j,complex))\n");


        val cdv2 = findViewById<CodeView>(R.id.cdv2)
        cdv2.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv2.showCode("5 is of type <class 'int'>\n" +
                "2.0 is of type <class 'float'>\n" +
                "(1+2j) is complex number? True");

        val cdv3 = findViewById<CodeView>(R.id.cdv3)
        cdv3.setTheme(CodeViewTheme.DARKULA).fillColor();
        cdv3.showCode("a = [5,10,15,20,25,30,35,40] #list \n" +
                "\n" +
                "# a[2] = 15\n" +
                "print(\"a[2] = \", a[2])\n" +
                "\n" +
                "# a[0:3] = [5, 10, 15]\n" +
                "print(\"a[0:3] = \", a[0:3])\n" +
                "\n" +
                "# a[5:] = [30, 35, 40]\n" +
                "print(\"a[5:] = \", a[5:])\n");

        val cdv6 = findViewById<CodeView>(R.id.cdv6)
        cdv6.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv6.showCode("a[2] =  15\n" +
                "a[0:3] =  [5, 10, 15]\n" +
                "a[5:] =  [30, 35, 40]");


        val cdv5 = findViewById<CodeView>(R.id.cdv5)
        cdv5.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv5.showCode("t = (5,'program', 1+3j) #tuple\n" +
                "\n" +
                "# t[1] = 'program'\n" +
                "print(\"t[1] = \", t[1])\n" +
                "\n" +
                "# t[0:3] = (5, 'program', (1+3j))\n" +
                "print(\"t[0:3] = \", t[0:3])\n" +
                "\n" +
                "# Generates error\n" +
                "# Tuples are immutable\n" +
                "t[0] = 10\n");

        val cdv4 = findViewById<CodeView>(R.id.cdv4)
        cdv4.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv4.showCode("t[1] =  program\n" +
                "t[0:3] =  (5, 'program', (1+3j))\n" +
                "Traceback (most recent call last):\n" +
                "  File \"test.py\", line 11, in <module>\n" +
                "    t[0] = 10\n" +
                "TypeError: 'tuple' object does not support item assignment")
        val cdv7 = findViewById<CodeView>(R.id.cdv7)
        cdv7.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv7.showCode("s = \"This is a string\"\n" +
                "print(s)\n" +
                "s = '''A multiline\n" +
                "string'''\n" +
                "print(s)\n");

        val cdv8 = findViewById<CodeView>(R.id.cdv8)
        cdv8.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv8.showCode("This is a string\n" +
                "A multiline\n" +
                "string");

        val cdv9 = findViewById<CodeView>(R.id.cdv9)
        cdv9.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv9.showCode("a = {5,2,3,1,4}\n" +
                "\n" +
                "# printing set variable\n" +
                "print(\"a = \", a)\n" +
                "\n" +
                "# data type of variable a\n" +
                "print(type(a))\n");

        val cdv10 = findViewById<CodeView>(R.id.cdv10)
        cdv10.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv10.showCode("a =  {1, 2, 3, 4, 5}\n" +
                "<class 'set'>");


        val cdv11 = findViewById<CodeView>(R.id.cdv11)
        cdv11.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv11.showCode("d = {1:'value','key':2} #dictionary\n" +
                "print(type(d))\n" +
                "\n" +
                "print(\"d[1] = \", d[1])\n" +
                "\n" +
                "print(\"d['key'] = \", d['key'])\n" +
                "\n" +
                "# Generates error\n" +
                "print(\"d[2] = \", d[2])\n");

        val cdv12 = findViewById<CodeView>(R.id.cdv12)
        cdv12.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv12.showCode("<class 'dict'>\n" +
                "d[1] =  value\n" +
                "d['key'] =  2\n" +
                "Traceback (most recent call last):\n" +
                "  File \"<string>\", line 9, in <module>\n" +
                "KeyError: 2");




    }
}