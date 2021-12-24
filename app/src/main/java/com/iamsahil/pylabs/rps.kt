package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class rps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rps)




        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\" Rock Paper Scissors\n" +
                "----------------------------------------\n" +
                "\"\"\"\n" +
                "import random\n" +
                "import os\n" +
                "import re\n" +
                "os.system('cls' if os.name=='nt' else 'clear')\n" +
                "while (1 < 2):\n" +
                "    print \"\\n\"\n" +
                "    print \"Rock, Paper, Scissors - Shoot!\"\n" +
                "    userChoice = raw_input(\"Choose your weapon [R]ock], [P]aper, or [S]cissors: \")\n" +
                "    if not re.match(\"[SsRrPp]\", userChoice):\n" +
                "        print \"Please choose a letter:\"\n" +
                "        print \"[R]ock, [S]cissors or [P]aper.\"\n" +
                "        continue\n" +
                "    // Echo the user's choice\n" +
                "    print \"You chose: \" + userChoice\n" +
                "    choices = ['R', 'P', 'S']\n" +
                "    opponenetChoice = random.choice(choices)\n" +
                "    print \"I chose: \" + opponenetChoice\n" +
                "    if opponenetChoice == str.upper(userChoice):\n" +
                "        print \"Tie! \"\n" +
                "    #if opponenetChoice == str(\"R\") and str.upper(userChoice) == \"P\"\n" +
                "    elif opponenetChoice == 'R' and userChoice.upper() == 'S':      \n" +
                "        print \"Scissors beats rock, I win! \"\n" +
                "        continue\n" +
                "    elif opponenetChoice == 'S' and userChoice.upper() == 'P':      \n" +
                "        print \"Scissors beats paper! I win! \"\n" +
                "        continue\n" +
                "    elif opponenetChoice == 'P' and userChoice.upper() == 'R':      \n" +
                "        print \"Paper beat rock, I win! \"\n" +
                "        continue\n" +
                "    else:       \n" +
                "        print \"You win!\"");
    }
}