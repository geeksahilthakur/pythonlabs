package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class numgss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numgss)


        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("\"\"\" Number Guessing Game\n" +
                "----------------------------------------\n" +
                "\"\"\"\n" +
                "import random\n" +
                "attempts_list = []\n" +
                "def show_score():\n" +
                "    if len(attempts_list) <= 0:\n" +
                "        print(\"There is currently no high score, it's yours for the taking!\")\n" +
                "    else:\n" +
                "        print(\"The current high score is {} attempts\".format(min(attempts_list)))\n" +
                "def start_game():\n" +
                "    random_number = int(random.randint(1, 10))\n" +
                "    print(\"Hello traveler! Welcome to the game of guesses!\")\n" +
                "    player_name = input(\"What is your name? \")\n" +
                "    wanna_play = input(\"Hi, {}, would you like to play the guessing game? (Enter Yes/No) \".format(player_name))\n" +
                "    // Where the show_score function USED to be\n" +
                "    attempts = 0\n" +
                "    show_score()\n" +
                "    while wanna_play.lower() == \"yes\":\n" +
                "        try:\n" +
                "            guess = input(\"Pick a number between 1 and 10 \")\n" +
                "            if int(guess) < 1 or int(guess) > 10:\n" +
                "                raise ValueError(\"Please guess a number within the given range\")\n" +
                "            if int(guess) == random_number:\n" +
                "                print(\"Nice! You got it!\")\n" +
                "                attempts += 1\n" +
                "                attempts_list.append(attempts)\n" +
                "                print(\"It took you {} attempts\".format(attempts))\n" +
                "                play_again = input(\"Would you like to play again? (Enter Yes/No) \")\n" +
                "                attempts = 0\n" +
                "                show_score()\n" +
                "                random_number = int(random.randint(1, 10))\n" +
                "                if play_again.lower() == \"no\":\n" +
                "                    print(\"That's cool, have a good one!\")\n" +
                "                    break\n" +
                "            elif int(guess) > random_number:\n" +
                "                print(\"It's lower\")\n" +
                "                attempts += 1\n" +
                "            elif int(guess) < random_number:\n" +
                "                print(\"It's higher\")\n" +
                "                attempts += 1\n" +
                "        except ValueError as err:\n" +
                "            print(\"Oh no!, that is not a valid value. Try again...\")\n" +
                "            print(\"({})\".format(err))\n" +
                "    else:\n" +
                "        print(\"That's cool, have a good one!\")\n" +
                "if __name__ == '__main__':\n" +
                "    start_game()");



    }
}