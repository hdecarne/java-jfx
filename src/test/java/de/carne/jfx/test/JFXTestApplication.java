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

import de.carne.boot.check.Check;
import de.carne.boot.check.Nullable;
import de.carne.jfx.stage.StageController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Test application containing a UI utilizing all features to test.
 */
public class JFXTestApplication extends Application {

	@Override
	public void start(@Nullable Stage primaryStage) throws Exception {
		StageController.loadPrimaryStage(Check.notNull(primaryStage), JFXTestController.class).show();
	}

}
