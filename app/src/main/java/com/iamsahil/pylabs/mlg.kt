package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class mlg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mlg)


        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\" Mad Libs Generator\n" +
                "----------------------------------------\n" +
                "\"\"\"\n" +
                "//Loop back to this point once code finishes\n" +
                "loop = 1\n" +
                "while (loop < 10):\n" +
                "// All the questions that the program asks the user\n" +
                "    noun = input(\"Choose a noun: \")\n" +
                "    p_noun = input(\"Choose a plural noun: \")\n" +
                "    noun2 = input(\"Choose a noun: \")\n" +
                "    place = input(\"Name a place: \")\n" +
                "    adjective = input(\"Choose an adjective (Describing word): \")\n" +
                "    noun3 = input(\"Choose a noun: \")\n" +
                "// Displays the story based on the users input\n" +
                "    print (\"------------------------------------------\")\n" +
                "    print (\"Be kind to your\",noun,\"- footed\", p_noun)\n" +
                "    print (\"For a duck may be somebody's\", noun2,\",\")\n" +
                "    print (\"Be kind to your\",p_noun,\"in\",place)\n" +
                "    print (\"Where the weather is always\",adjective,\".\")\n" +
                "    print ()\n" +
                "    print (\"You may think that is this the\",noun3,\",\")\n" +
                "    print (\"Well it is.\")\n" +
                "    print (\"------------------------------------------\")\n" +
                "// Loop back to \"loop = 1\"\n" +
                "    loop = loop + 1");





    }
}