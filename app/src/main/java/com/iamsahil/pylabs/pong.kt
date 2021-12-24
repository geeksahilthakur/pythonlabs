package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class pong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pong)

        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\"Pong, classic arcade game.\n" +
                "\n" +
                "Exercises\n" +
                "\n" +
                "1. Change the colors.\n" +
                "2. What is the frame rate? Make it faster or slower.\n" +
                "3. Change the speed of the ball.\n" +
                "4. Change the size of the paddles.\n" +
                "5. Change how the ball bounces off walls.\n" +
                "6. How would you add a computer player?\n" +
                "6. Add a second ball.\n" +
                "\"\"\"\n" +
                "\n" +
                "from random import choice, random\n" +
                "from turtle import *\n" +
                "\n" +
                "from freegames import vector\n" +
                "\n" +
                "\n" +
                "def value():\n" +
                "    \"\"\"Randomly generate value between (-5, -3) or (3, 5).\"\"\"\n" +
                "    return (3 + random() * 2) * choice([1, -1])\n" +
                "\n" +
                "\n" +
                "ball = vector(0, 0)\n" +
                "aim = vector(value(), value())\n" +
                "state = {1: 0, 2: 0}\n" +
                "\n" +
                "\n" +
                "def move(player, change):\n" +
                "    \"\"\"Move player position by change.\"\"\"\n" +
                "    state[player] += change\n" +
                "\n" +
                "\n" +
                "def rectangle(x, y, width, height):\n" +
                "    \"\"\"Draw rectangle at (x, y) with given width and height.\"\"\"\n" +
                "    up()\n" +
                "    goto(x, y)\n" +
                "    down()\n" +
                "    begin_fill()\n" +
                "    for count in range(2):\n" +
                "        forward(width)\n" +
                "        left(90)\n" +
                "        forward(height)\n" +
                "        left(90)\n" +
                "    end_fill()\n" +
                "\n" +
                "\n" +
                "def draw():\n" +
                "    \"\"\"Draw game and move pong ball.\"\"\"\n" +
                "    clear()\n" +
                "    rectangle(-200, state[1], 10, 50)\n" +
                "    rectangle(190, state[2], 10, 50)\n" +
                "\n" +
                "    ball.move(aim)\n" +
                "    x = ball.x\n" +
                "    y = ball.y\n" +
                "\n" +
                "    up()\n" +
                "    goto(x, y)\n" +
                "    dot(10)\n" +
                "    update()\n" +
                "\n" +
                "    if y < -200 or y > 200:\n" +
                "        aim.y = -aim.y\n" +
                "\n" +
                "    if x < -185:\n" +
                "        low = state[1]\n" +
                "        high = state[1] + 50\n" +
                "\n" +
                "        if low <= y <= high:\n" +
                "            aim.x = -aim.x\n" +
                "        else:\n" +
                "            return\n" +
                "\n" +
                "    if x > 185:\n" +
                "        low = state[2]\n" +
                "        high = state[2] + 50\n" +
                "\n" +
                "        if low <= y <= high:\n" +
                "            aim.x = -aim.x\n" +
                "        else:\n" +
                "            return\n" +
                "\n" +
                "    ontimer(draw, 50)\n" +
                "\n" +
                "\n" +
                "setup(420, 420, 370, 0)\n" +
                "hideturtle()\n" +
                "tracer(False)\n" +
                "listen()\n" +
                "onkey(lambda: move(1, 20), 'w')\n" +
                "onkey(lambda: move(1, -20), 's')\n" +
                "onkey(lambda: move(2, 20), 'i')\n" +
                "onkey(lambda: move(2, -20), 'k')\n" +
                "draw()\n" +
                "done()\n" +
                "Logo\n" +
                "\n" +
                "Free Python Games\n" +
                "\n" +
                "\n" +
                "Donate\n" +
                "If you or your organization uses Free Games, consider donating:\n" +
                "\n" +
                "Donate to Free Python Games\n" +
                "\n" +
                "Related Topics\n" +
                "Documentation overview\n" +
                "Previous: Bounce\n" +
                "Next: Life\n" +
                "Quick search\n");
    }
}