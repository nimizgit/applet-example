package ru.habr.applet;

import com.sun.jna.Native;
import javax.swing.JApplet;

public class AppletWithLibTest extends JApplet {

	private static GetPidLib LIB;

	static {
		LIB = (GetPidLib) Native.loadLibrary("getpid", GetPidLib.class);
	}

	public int getPid() {
		return LIB.myGetPid();
	}

}
