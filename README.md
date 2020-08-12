# 122KeyModelM
Config file for 122 key IBM Model M with Soarer's Converter.

Layout given as PNG. 
Utilize [soarer's tools](https://geekhack.org/index.php?topic=17458.0) to build binary and push to your board.

In the event the geekhack page linked above ever goes down, I have provided the folder from the version 1.10 upload on this repo. I do not claim any ownership nor did I have any hand in creating these tools.

Quick rundown if you haven't used the tools before. All you'll need to do is:
``` 
    scas 122_config.sc 122_config.scb
    scwr 122_config.scb
```

If you want to change the layout, feel free to modify my config. Use the program [HID_Listen](https://www.pjrc.com/teensy/hid_listen.html) to get the HID codes of the keys to change the binds or macros.

<p align='center'>
  <img src='Layout.png'>
</p>

Note: my Linux hot key in i3 is ctrl-shift-s -- obviously this may work for "save as" in some applications. The windows screenshot macro is windows-shift-s.
