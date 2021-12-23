package com.iamsahil.pylabs
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class pyvar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyvar)


        val codeView = findViewById<CodeView>(R.id.cv1)
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        codeView.showCode("website = \"apple.com\"\n" +
                "print(website)\n" +
                "\n" +
                "# assigning a new value to website\n" +
                "website = \"geekjnr.com\"\n" +
                "\n" +
                "print(website)\n");


        val cv2 = findViewById<CodeView>(R.id.cv2)
        cv2.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv2.showCode("x = (1 == True)\n" +
                "y = (1 == False)\n" +
                "a = True + 4\n" +
                "b = False + 10\n" +
                "\n" +
                "print(\"x is\", x)\n" +
                "print(\"y is\", y)\n" +
                "print(\"a:\", a)\n" +
                "print(\"b:\", b)\n");

        val cv3 = findViewById<CodeView>(R.id.cv3)
        cv3.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv3.showCode("drink = \"Available\"\n" +
                "food = None\n" +
                "\n" +
                "def menu(x):\n" +
                "    if x == drink:\n" +
                "        print(drink)\n" +
                "    else:\n" +
                "        print(food)\n" +
                "\n" +
                "menu(drink)\n" +
                "menu(food)\n");

        val cv4 = findViewById<CodeView>(R.id.cv4)
        cv4.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv4.showCode("fruits = [\"apple\", \"mango\", \"orange\"] #list\n" +
                "numbers = (1, 2, 3) #tuple\n" +
                "alphabets = {'a':'apple', 'b':'ball', 'c':'cat'} #dictionary\n" +
                "vowels = {'a', 'e', 'i' , 'o', 'u'} #set\n" +
                "\n" +
                "print(fruits)\n" +
                "print(numbers)\n" +
                "print(alphabets)\n" +
                "print(vowels)\n");


        val cv5 = findViewById<CodeView>(R.id.cv5)
        cv5.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv5.showCode("['apple', 'mango', 'orange']\n" +
                "(1, 2, 3)\n" +
                "{'a': 'apple', 'b': 'ball', 'c': 'cat'}\n" +
                "{'e', 'a', 'o', 'i', 'u'}");



        val cv6 = findViewById<CodeView>(R.id.cv6)
        cv6.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv6.showCode("x is True\n" +
                "y is False\n" +
                "a: 5\n" +
                "b: 10\n");


        val cv7 = findViewById<CodeView>(R.id.cv7)
        cv7.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv7.showCode("Available\n" +
                "None");


        val cv8 = findViewById<CodeView>(R.id.cv8)
        cv8.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        cv8.showCode("apple.com\n" +
                "geekjnr.com")


    }
}