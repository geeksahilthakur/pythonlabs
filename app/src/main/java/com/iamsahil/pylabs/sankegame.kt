package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class sankegame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sankegame)


        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\"Snake, classic arcade game.\n" +
                "\n" +
                "Exercises\n" +
                "\n" +
                "1. How do you make the snake faster or slower?\n" +
                "2. How can you make the snake go around the edges?\n" +
                "3. How would you move the food?\n" +
                "4. Change the snake to respond to mouse clicks.\n" +
                "\"\"\"\n" +
                "\n" +
                "from random import randrange\n" +
                "from turtle import *\n" +
                "\n" +
                "from freegames import square, vector\n" +
                "\n" +
                "food = vector(0, 0)\n" +
                "snake = [vector(10, 0)]\n" +
                "aim = vector(0, -10)\n" +
                "\n" +
                "\n" +
                "def change(x, y):\n" +
                "    \"\"\"Change snake direction.\"\"\"\n" +
                "    aim.x = x\n" +
                "    aim.y = y\n" +
                "\n" +
                "\n" +
                "def inside(head):\n" +
                "    \"\"\"Return True if head inside boundaries.\"\"\"\n" +
                "    return -200 < head.x < 190 and -200 < head.y < 190\n" +
                "\n" +
                "\n" +
                "def move():\n" +
                "    \"\"\"Move snake forward one segment.\"\"\"\n" +
                "    head = snake[-1].copy()\n" +
                "    head.move(aim)\n" +
                "\n" +
                "    if not inside(head) or head in snake:\n" +
                "        square(head.x, head.y, 9, 'red')\n" +
                "        update()\n" +
                "        return\n" +
                "\n" +
                "    snake.append(head)\n" +
                "\n" +
                "    if head == food:\n" +
                "        print('Snake:', len(snake))\n" +
                "        food.x = randrange(-15, 15) * 10\n" +
                "        food.y = randrange(-15, 15) * 10\n" +
                "    else:\n" +
                "        snake.pop(0)\n" +
                "\n" +
                "    clear()\n" +
                "\n" +
                "    for body in snake:\n" +
                "        square(body.x, body.y, 9, 'black')\n" +
                "\n" +
                "    square(food.x, food.y, 9, 'green')\n" +
                "    update()\n" +
                "    ontimer(move, 100)\n" +
                "\n" +
                "\n" +
                "setup(420, 420, 370, 0)\n" +
                "hideturtle()\n" +
                "tracer(False)\n" +
                "listen()\n" +
                "onkey(lambda: change(10, 0), 'Right')\n" +
                "onkey(lambda: change(-10, 0), 'Left')\n" +
                "onkey(lambda: change(0, 10), 'Up')\n" +
                "onkey(lambda: change(0, -10), 'Down')\n" +
                "move()\n" +
                "done()");
    }
}