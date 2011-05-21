package ru.habr.applet;

import com.sun.jna.Library;

public interface GetPidLib extends Library{

    int myGetPid();

}
