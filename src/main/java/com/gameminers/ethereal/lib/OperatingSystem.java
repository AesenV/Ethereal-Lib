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

public enum OperatingSystem {
	WINDOWS,
	MAC,
	LINUX,
	OTHER;
	
	public static OperatingSystem getCurrentOS() {
	    String os = System.getProperty("os.name");
        if (os.equalsIgnoreCase("AIX"))
            return LINUX;
        if (os.equalsIgnoreCase("Digital Unix"))
            return LINUX;
        if (os.equalsIgnoreCase("FreeBSD"))
            return LINUX;
        if (os.equalsIgnoreCase("HP UX"))
            return LINUX;
        if (os.equalsIgnoreCase("Irix"))
            return LINUX;
        if (os.equalsIgnoreCase("Linux"))
            return LINUX;
        if (os.contains("OS X"))
            return MAC;
        if (os.equalsIgnoreCase("MPE/iX"))
            return LINUX;
        if (os.equalsIgnoreCase("Solaris"))
            return LINUX;
        if (os.startsWith("Windows"))
            return WINDOWS;
        return OTHER;
	}
}