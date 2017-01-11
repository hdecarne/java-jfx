/*
 * Copyright (c) 2016-2017 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.jfx.test;

import org.junit.Test;

import de.carne.jfx.test.application.TestApplication;
import javafx.application.Application;

/**
 * Test JFX application related code.
 */
public class ApplicationTest {

	/**
	 * Test JFX application code by starting a test application.
	 */
	@Test
	public void startStopApplication() {
		Application.launch(TestApplication.class);
	}

}