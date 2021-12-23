package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class ifelse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ifelse)


        val codeview1 = findViewById<CodeView>(R.id.codeview1)
        codeview1.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview1.showCode("if test expression:\n" +
                "    statement(s)");

        val codeview2 = findViewById<CodeView>(R.id.codeview2)
        codeview2.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview2.showCode("# If the number is positive, we print an appropriate message\n" +
                "\n" +
                "num = 3\n" +
                "if num > 0:\n" +
                "    print(num, \"is a positive number.\")\n" +
                "print(\"This is always printed.\")\n" +
                "\n" +
                "num = -1\n" +
                "if num > 0:\n" +
                "    print(num, \"is a positive number.\")\n" +
                "print(\"This is also always printed.\")");

        val codeview3 = findViewById<CodeView>(R.id.codeview3)
        codeview3.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview3.showCode("3 is a positive number\n" +
                "This is always printed\n" +
                "This is also always printed");

        val codeview4 = findViewById<CodeView>(R.id.codeview4)
        codeview4.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview4.showCode("if test expression:\n" +
                "    Body of if\n" +
                "else:\n" +
                "    Body of else");

        val codeview5 = findViewById<CodeView>(R.id.codeview5)
        codeview5.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview5.showCode("# Program checks if the number is positive or negative\n" +
                "# And displays an appropriate message\n" +
                "\n" +
                "num = 3\n" +
                "\n" +
                "# Try these two variations as well. \n" +
                "# num = -5\n" +
                "# num = 0\n" +
                "\n" +
                "if num >= 0:\n" +
                "    print(\"Positive or Zero\")\n" +
                "else:\n" +
                "    print(\"Negative number\")");

        val codeview6 = findViewById<CodeView>(R.id.codeview6)
        codeview6.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview6.showCode("Positive or Zero");

        val codeview7 = findViewById<CodeView>(R.id.codeview7)
        codeview7.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview7.showCode("if test expression:\n" +
                "    Body of if\n" +
                "elif test expression:\n" +
                "    Body of elif\n" +
                "else: \n" +
                "    Body of else");


        val codeview8 = findViewById<CodeView>(R.id.codeview8)
        codeview8.setTheme(CodeViewTheme.DARKULA).fillColor();
        codeview8.showCode("'''In this program, \n" +
                "we check if the number is positive or\n" +
                "negative or zero and \n" +
                "display an appropriate message'''\n" +
                "\n" +
                "num = 3.4\n" +
                "\n" +
                "# Try these two variations as well:\n" +
                "# num = 0\n" +
                "# num = -4.5\n" +
                "\n" +
                "if num > 0:\n" +
                "    print(\"Positive number\")\n" +
                "elif num == 0:\n" +
                "    print(\"Zero\")\n" +
                "else:\n" +
                "    print(\"Negative number\")");
    }
}