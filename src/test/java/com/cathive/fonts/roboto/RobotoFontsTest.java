/*
 * Copyright (c) 2011-2012, The Cat Hive Developers
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cathive.fonts.roboto;

import static org.testng.Assert.assertNotNull;
import javafx.scene.text.Font;

import org.testng.annotations.Test;

/**
 * Some unit tests to make sure that all the fonts can be used
 * from your Java/JavaFX application without any problems.
 * @author Benjamin P. Jung
 */
@Test
public class RobotoFontsTest {

    static final String[] FILE_NAMES = {
        "Roboto-Black.ttf",
        "Roboto-BlackItalic.ttf",
        "Roboto-BoldItalic.ttf",
        "Roboto-Italic.ttf",
        "Roboto-Medium.ttf",
        "Roboto-Black.ttf",
        "Roboto-Bold.ttf",
        "Roboto-LightItalic.ttf",
        "Roboto-Regular.ttf",
        "Roboto-Light.ttf",
        "Roboto-ThinItalic.ttf",
        "Roboto-BoldCondensed.ttf",
        "Roboto-MediumItalic.ttf",
        "Roboto-Thin.ttf",
	"RobotoCondensed-Bold.ttf",
	"RobotoCondensed-BoldItalic.ttf",
	"RobotoCondensed-Italic.ttf",
	"RobotoCondensed-Light.ttf",
	"RobotoCondensed-LightItalic.ttf",
	"RobotoCondensed-Regular.ttf"
    };

    @Test
    public void testFontLoading() {
        for (String fileName: FILE_NAMES) {
            fileName = String.format("/com/cathive/fonts/roboto/%s", fileName);
            assertNotNull(Font.loadFont(getClass().getResourceAsStream(fileName), 12.0), String.format("Couldn't load font file: %s.", fileName));
        }
    }

}
