package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class confor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confor)


        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\"Connect Four\n" +
                "\n" +
                "Exercises\n" +
                "\n" +
                "1. Change the colors.\n" +
                "2. Draw squares instead of circles for open spaces.\n" +
                "3. Add logic to detect a full row.\n" +
                "4. Create a random computer player.\n" +
                "5. How would you detect a winner?\n" +
                "\"\"\"\n" +
                "\n" +
                "from turtle import *\n" +
                "\n" +
                "from freegames import line\n" +
                "\n" +
                "turns = {'red': 'yellow', 'yellow': 'red'}\n" +
                "state = {'player': 'yellow', 'rows': [0] * 8}\n" +
                "\n" +
                "\n" +
                "def grid():\n" +
                "    \"\"\"Draw Connect Four grid.\"\"\"\n" +
                "    bgcolor('light blue')\n" +
                "\n" +
                "    for x in range(-150, 200, 50):\n" +
                "        line(x, -200, x, 200)\n" +
                "\n" +
                "    for x in range(-175, 200, 50):\n" +
                "        for y in range(-175, 200, 50):\n" +
                "            up()\n" +
                "            goto(x, y)\n" +
                "            dot(40, 'white')\n" +
                "\n" +
                "    update()\n" +
                "\n" +
                "\n" +
                "def tap(x, y):\n" +
                "    \"\"\"Draw red or yellow circle in tapped row.\"\"\"\n" +
                "    player = state['player']\n" +
                "    rows = state['rows']\n" +
                "\n" +
                "    row = int((x + 200) // 50)\n" +
                "    count = rows[row]\n" +
                "\n" +
                "    x = ((x + 200) // 50) * 50 - 200 + 25\n" +
                "    y = count * 50 - 200 + 25\n" +
                "\n" +
                "    up()\n" +
                "    goto(x, y)\n" +
                "    dot(40, player)\n" +
                "    update()\n" +
                "\n" +
                "    rows[row] = count + 1\n" +
                "    state['player'] = turns[player]\n" +
                "\n" +
                "\n" +
                "setup(420, 420, 370, 0)\n" +
                "hideturtle()\n" +
                "tracer(False)\n" +
                "grid()\n" +
                "onscreenclick(tap)\n" +
                "done()");


    }
}