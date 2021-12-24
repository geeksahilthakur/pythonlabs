package com.iamsahil.pylabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thereisnospon.codeview.CodeView
import thereisnospon.codeview.CodeViewTheme

class utube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utube)


        val cdv1 = findViewById<CodeView>(R.id.cdv1)
        cdv1.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        cdv1.showCode("import tkinter\n" +
                "from pytube import YouTube\n" +
                "\n" +
                "root = tkinter.Tk()\n" +
                "root.geometry('500x300')\n" +
                "root.resizable(0,0)\n" +
                "root.title(\"IT SOURCECODE Youtube Video Downloader\")\n" +
                "\n" +
                "\n" +
                "tkinter.Label(root, text ='Youtube Video Downloader', font ='arial 20 bold').pack()\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "##enter link\n" +
                "link = tkinter.StringVar()\n" +
                "\n" +
                "tkinter.Label(root, text ='Paste Link Here:', font ='arial 15 bold').place(x= 160, y = 60)\n" +
                "link_enter = tkinter.Entry(root, width = 70, textvariable = link).place(x = 32, y = 90)\n" +
                "\n" +
                "\n" +
                "\n" +
                "#function to download video\n" +
                "\n" +
                "\n" +
                "def Downloader():\n" +
                "     \n" +
                "    url =YouTube(str(link.get()))\n" +
                "    video = url.streams.first()\n" +
                "    video.download()\n" +
                "    tkinter.Label(root, text ='DOWNLOADED', font ='arial 15').place(x= 180, y = 210)\n" +
                "\n" +
                "\n" +
                "tkinter.Button(root, text ='DOWNLOAD', font ='arial 15 bold', bg ='blue', padx = 2, command = Downloader).place(x=180, y = 150)\n" +
                "\n" +
                "\n" +
                "\n" +
                "root.mainloop()\n");
    }
}