/*
 * GrokerAi.java
 *
 * Copyright (C) 2015 Pixelgaffer
 *
 * This work is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or any later
 * version.
 *
 * This work is distributed in the hope that it will be useful, but without
 * any warranty; without even the implied warranty of merchantability or
 * fitness for a particular purpose. See version 2 and version 3 of the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pixelgaffer.turnierserver.groker.ai;

import org.pixelgaffer.turnierserver.ailibrary.Ai;

public abstract class GrokerAi extends Ai {
		
	public GrokerAi(String[] args) {
		super(args);
	}
	
	@Override
	protected String update(String answer) {
		String[] split = answer.split(";");
		return Integer.toString(einsatz(new AiDaten(split[0]), new AiDaten(split[1])));
	}
	
	/**
	 * Diese Methode soll den Einsatz dieser KI zurückgeben
	 * 
	 * @param du Die AiDaten dieser KI der letzten Runde
	 * @param gegner Die AiDaten der Gegner-Ki der letzten Runde
	 * @return Eine Zahl >= 1, der Einsatz dieser KI für diese Runde
	 */
	public abstract int einsatz(AiDaten du, AiDaten gegner);
	
}
