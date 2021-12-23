package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class io : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_io)

        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("f = open(\"test.txt\")      # equivalent to 'r' or 'rt'\n" +
                "f = open(\"test.txt\",'w')  # write in text mode\n" +
                "f = open(\"img.bmp\",'r+b') # read and write in binary mode");

        val cdv2 = findViewById<CodeView>(R.id.cdv2)
        cdv2.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv2.showCode("with open(\"test.txt\",'w',encoding = 'utf-8') as f:\n" +
                "   f.write(\"my first file\\n\")\n" +
                "   f.write(\"This file\\n\\n\")\n" +
                "   f.write(\"contains three lines\\n\")");


        val cdv3 = findViewById<CodeView>(R.id.cdv3)
        cdv3.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv3.showCode(">>> f = open(\"test.txt\",'r',encoding = 'utf-8')\n" +
                ">>> f.read(4)    # read the first 4 data\n" +
                "'This'\n" +
                "\n" +
                ">>> f.read(4)    # read the next 4 data\n" +
                "' is '\n" +
                "\n" +
                ">>> f.read()     # read in the rest till end of file\n" +
                "'my first file\\nThis file\\ncontains three lines\\n'\n" +
                "\n" +
                ">>> f.read()  # further reading returns empty sting\n" +
                "''");
        val cdv4 = findViewById<CodeView>(R.id.cdv4)
        cdv4.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv4.showCode("f = open(\"test.txt\", encoding = 'utf-8')\n" +
                "# perform file operations\n" +
                "f.close()");
    }
}