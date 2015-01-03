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

import java.awt.Component;

import javax.swing.JOptionPane;

public class Dialogs {

	public static void showErrorDialog(Component parent, String message, Throwable t) {
		t.printStackTrace();
		JOptionPane.showMessageDialog(parent, message+"\n"+t.toString()+"\n\nSee the console for more details.", "Error",
			JOptionPane.ERROR_MESSAGE, Resources.getPNGIconAsset("iface/error-32"));
	}

}
