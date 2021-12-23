package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class opp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opp)

        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("class Parrot:\n" +
                "    pass");

        val cdv2 = findViewById<CodeView>(R.id.cdv2)
        cdv2.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv2.showCode("obj = Parrot()");

        val cdv3 = findViewById<CodeView>(R.id.cdv3)
        cdv3.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv3.showCode("class Parrot:\n" +
                "\n" +
                "    # class attribute\n" +
                "    species = \"bird\"\n" +
                "\n" +
                "    # instance attribute\n" +
                "    def __init__(self, name, age):\n" +
                "        self.name = name\n" +
                "        self.age = age\n" +
                "\n" +
                "# instantiate the Parrot class\n" +
                "blu = Parrot(\"Blu\", 10)\n" +
                "woo = Parrot(\"Woo\", 15)\n" +
                "\n" +
                "# access the class attributes\n" +
                "print(\"Blu is a {}\".format(blu.__class__.species))\n" +
                "print(\"Woo is also a {}\".format(woo.__class__.species))\n" +
                "\n" +
                "# access the instance attributes\n" +
                "print(\"{} is {} years old\".format( blu.name, blu.age))\n" +
                "print(\"{} is {} years old\".format( woo.name, woo.age))");

        val cdv4 = findViewById<CodeView>(R.id.cdv4)
        cdv4.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv4.showCode("Blu is a bird\n" +
                "Woo is also a bird\n" +
                "Blu is 10 years old\n" +
                "Woo is 15 years old");




    }
}