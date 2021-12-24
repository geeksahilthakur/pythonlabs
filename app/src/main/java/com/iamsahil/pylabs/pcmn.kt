package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class pcmn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pcmn)



        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\"Pacman, classic arcade game.\n" +
                "\n" +
                "Exercises\n" +
                "\n" +
                "1. Change the board.\n" +
                "2. Change the number of ghosts.\n" +
                "3. Change where pacman starts.\n" +
                "4. Make the ghosts faster/slower.\n" +
                "5. Make the ghosts smarter.\n" +
                "\"\"\"\n" +
                "\n" +
                "from random import choice\n" +
                "from turtle import *\n" +
                "\n" +
                "from freegames import floor, vector\n" +
                "\n" +
                "state = {'score': 0}\n" +
                "path = Turtle(visible=False)\n" +
                "writer = Turtle(visible=False)\n" +
                "aim = vector(5, 0)\n" +
                "pacman = vector(-40, -80)\n" +
                "ghosts = [\n" +
                "    [vector(-180, 160), vector(5, 0)],\n" +
                "    [vector(-180, -160), vector(0, 5)],\n" +
                "    [vector(100, 160), vector(0, -5)],\n" +
                "    [vector(100, -160), vector(-5, 0)],\n" +
                "]\n" +
                "# fmt: off\n" +
                "tiles = [\n" +
                "    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0,\n" +
                "    0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0,\n" +
                "    0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,\n" +
                "    0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0,\n" +
                "    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,\n" +
                "    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,\n" +
                "]\n" +
                "# fmt: on\n" +
                "\n" +
                "\n" +
                "def square(x, y):\n" +
                "    \"\"\"Draw square using path at (x, y).\"\"\"\n" +
                "    path.up()\n" +
                "    path.goto(x, y)\n" +
                "    path.down()\n" +
                "    path.begin_fill()\n" +
                "\n" +
                "    for count in range(4):\n" +
                "        path.forward(20)\n" +
                "        path.left(90)\n" +
                "\n" +
                "    path.end_fill()\n" +
                "\n" +
                "\n" +
                "def offset(point):\n" +
                "    \"\"\"Return offset of point in tiles.\"\"\"\n" +
                "    x = (floor(point.x, 20) + 200) / 20\n" +
                "    y = (180 - floor(point.y, 20)) / 20\n" +
                "    index = int(x + y * 20)\n" +
                "    return index\n" +
                "\n" +
                "\n" +
                "def valid(point):\n" +
                "    \"\"\"Return True if point is valid in tiles.\"\"\"\n" +
                "    index = offset(point)\n" +
                "\n" +
                "    if tiles[index] == 0:\n" +
                "        return False\n" +
                "\n" +
                "    index = offset(point + 19)\n" +
                "\n" +
                "    if tiles[index] == 0:\n" +
                "        return False\n" +
                "\n" +
                "    return point.x % 20 == 0 or point.y % 20 == 0\n" +
                "\n" +
                "\n" +
                "def world():\n" +
                "    \"\"\"Draw world using path.\"\"\"\n" +
                "    bgcolor('black')\n" +
                "    path.color('blue')\n" +
                "\n" +
                "    for index in range(len(tiles)):\n" +
                "        tile = tiles[index]\n" +
                "\n" +
                "        if tile > 0:\n" +
                "            x = (index % 20) * 20 - 200\n" +
                "            y = 180 - (index // 20) * 20\n" +
                "            square(x, y)\n" +
                "\n" +
                "            if tile == 1:\n" +
                "                path.up()\n" +
                "                path.goto(x + 10, y + 10)\n" +
                "                path.dot(2, 'white')\n" +
                "\n" +
                "\n" +
                "def move():\n" +
                "    \"\"\"Move pacman and all ghosts.\"\"\"\n" +
                "    writer.undo()\n" +
                "    writer.write(state['score'])\n" +
                "\n" +
                "    clear()\n" +
                "\n" +
                "    if valid(pacman + aim):\n" +
                "        pacman.move(aim)\n" +
                "\n" +
                "    index = offset(pacman)\n" +
                "\n" +
                "    if tiles[index] == 1:\n" +
                "        tiles[index] = 2\n" +
                "        state['score'] += 1\n" +
                "        x = (index % 20) * 20 - 200\n" +
                "        y = 180 - (index // 20) * 20\n" +
                "        square(x, y)\n" +
                "\n" +
                "    up()\n" +
                "    goto(pacman.x + 10, pacman.y + 10)\n" +
                "    dot(20, 'yellow')\n" +
                "\n" +
                "    for point, course in ghosts:\n" +
                "        if valid(point + course):\n" +
                "            point.move(course)\n" +
                "        else:\n" +
                "            options = [\n" +
                "                vector(5, 0),\n" +
                "                vector(-5, 0),\n" +
                "                vector(0, 5),\n" +
                "                vector(0, -5),\n" +
                "            ]\n" +
                "            plan = choice(options)\n" +
                "            course.x = plan.x\n" +
                "            course.y = plan.y\n" +
                "\n" +
                "        up()\n" +
                "        goto(point.x + 10, point.y + 10)\n" +
                "        dot(20, 'red')\n" +
                "\n" +
                "    update()\n" +
                "\n" +
                "    for point, course in ghosts:\n" +
                "        if abs(pacman - point) < 20:\n" +
                "            return\n" +
                "\n" +
                "    ontimer(move, 100)\n" +
                "\n" +
                "\n" +
                "def change(x, y):\n" +
                "    \"\"\"Change pacman aim if valid.\"\"\"\n" +
                "    if valid(pacman + vector(x, y)):\n" +
                "        aim.x = x\n" +
                "        aim.y = y\n" +
                "\n" +
                "\n" +
                "setup(420, 420, 370, 0)\n" +
                "hideturtle()\n" +
                "tracer(False)\n" +
                "writer.goto(160, 160)\n" +
                "writer.color('white')\n" +
                "writer.write(state['score'])\n" +
                "listen()\n" +
                "onkey(lambda: change(5, 0), 'Right')\n" +
                "onkey(lambda: change(-5, 0), 'Left')\n" +
                "onkey(lambda: change(0, 5), 'Up')\n" +
                "onkey(lambda: change(0, -5), 'Down')\n" +
                "world()\n" +
                "move()\n" +
                "done()");


    }
}