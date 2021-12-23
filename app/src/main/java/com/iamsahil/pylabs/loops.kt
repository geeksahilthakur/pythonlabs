package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class loops : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loops)



        val codeView = findViewById<CodeView>(R.id.codeview)
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        codeView.showCode("# Program to find the sum of all numbers stored in a list\n" +
                "\n" +
                "# List of numbers\n" +
                "numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]\n" +
                "\n" +
                "# variable to store the sum\n" +
                "sum = 0\n" +
                "\n" +
                "# iterate over the list\n" +
                "for val in numbers:\n" +
                "    sum = sum+val\n" +
                "\n" +
                "print(\"The sum is\", sum)\n");

        val codeView1 = findViewById<CodeView>(R.id.codeview1)
        codeView1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        codeView1.showCode("The sum is 48");

        val codeView2 = findViewById<CodeView>(R.id.codeview2)
        codeView2.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        codeView2.showCode("# Program to add natural\n" +
                "# numbers up to \n" +
                "# sum = 1+2+3+...+n\n" +
                "\n" +
                "# To take input from the user,\n" +
                "# n = int(input(\"Enter n: \"))\n" +
                "\n" +
                "n = 10\n" +
                "\n" +
                "# initialize sum and counter\n" +
                "sum = 0\n" +
                "i = 1\n" +
                "\n" +
                "while i <= n:\n" +
                "    sum = sum + i\n" +
                "    i = i+1    # update counter\n" +
                "\n" +
                "# print the sum\n" +
                "print(\"The sum is\", sum)");

        val codeView3 = findViewById<CodeView>(R.id.codeview3)
        codeView3.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        codeView3.showCode("Enter n: 10\n" +
                "The sum is 55");





    }
}