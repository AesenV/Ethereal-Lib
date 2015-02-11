/*
 *  Ethereal Lib
 *  Copyright (C) 2014-2015 Aesen Vismea and Falkreon
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
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Dialogs {

	public static void showErrorDialog(Component parent, String message, Throwable t) {
		t.printStackTrace();
		JOptionPane.showMessageDialog(parent, message+"\n"+t.toString()+"\n\nSee the console for more details.", "Error",
			JOptionPane.ERROR_MESSAGE, Resources.getPNGIconAsset("iface/error-32"));
	}

	public static JDialog createAboutDialog(Window owner, String product) {
		final JDialog about = new JDialog(owner, "About Ethereal "+product);
		about.setContentPane(Box.createVerticalBox());
		about.add(Components.center(new JLabel(new ImageIcon(owner.getIconImages().get(1)))));
		about.add(Components.center(new JLabel("Ethereal "+product)));
		about.add(Components.center(new JLabel("A member of the Ethereal Suite")));
		about.add(Components.center(new JLabel("https://ethereal.gameminers.com/"+product.toLowerCase()+".html")));
		about.add(Box.createVerticalStrut(20));
		about.add(Components.center(new JLabel("© 2014-2015 Aesen Vismea")));
		about.add(Box.createVerticalStrut(20));
		about.add(Components.center(new JLabel("This program is free software; you can distribute it according")));
		about.add(Components.center(new JLabel("to the terms of the GNU GPLv3 or any later version.")));
		about.add(Box.createVerticalGlue());
		JButton ok = Components.center(new JButton("Okay"));
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				about.dispose();
			}
		});
		about.add(ok);
		about.pack();
		about.setLocationRelativeTo(owner);
		return about;
	}

}
