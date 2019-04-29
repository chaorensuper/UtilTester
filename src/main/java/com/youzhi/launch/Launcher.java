package com.youzhi.launch;

import com.jfinal.core.JFinal;

public class Launcher {
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 8080, "/UtilTester", 5);
	}
}
