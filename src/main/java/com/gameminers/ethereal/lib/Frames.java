/*
 *  Ethereal Lib
 *  Copyright (C) 2014-2015 Aesen Vismea
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gameminers.ethereal.lib;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Frames {
	public static void initLAF() {
		try {
			// try to set GTK+ first so we don't look hideous on Linux
			// XXX - on a Windows system, will this set GTK+ if it's installed?
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (Exception e) {
			try {
				// otherwise, do what this JVM thinks is best
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception ex) {}
		}
	}

	public static JFrame create(String product) {
		JFrame window = new JFrame("Ethereal "+product);
		window.setIconImages(Resources.getPNGAsset("iface/icon", "iface/icon-32"));
		window.setSize(854, 480);
		window.setLocationByPlatform(true);
		window.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		return window;
	}
}
