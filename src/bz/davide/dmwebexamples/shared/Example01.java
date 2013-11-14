/*
DMWebExamples - Examples for the Java DMWeb framework - http://www.davide.bz/dmweb

Copyright (C) 2013 Davide Montesin <d@vide.bz> - Bolzano/Bozen - Italy

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>
*/

package bz.davide.dmwebexamples.shared;

import bz.davide.dmweb.shared.view.ButtonView;
import bz.davide.dmweb.shared.view.DivView;
import bz.davide.dmweb.shared.view.SpanView;
import bz.davide.dmwebexamples.shared.component.Calculator;
import bz.davide.dmwebexamples.shared.component.Notepad;
import bz.davide.dmwebexamples.shared.component.PhotoGallery;

public class Example01 extends DivView
{
   public Example01()
   {
      this.appendChild(new SpanView("Hello World"));

      this.appendChild(new Notepad("note1"));
      //this.appendChild(new Notepad("note2"));

      ButtonView buttonView = new ButtonView("PressMe");
      buttonView.addClickHandler(new ButtonClickListener(this));
      this.appendChild(buttonView);
      this.appendChild(new Calculator());
      this.appendChild(new PhotoGallery(new String[] { "Butterfly 1", "Butterfly 2", "Cloud", "Sea" },
                                        new String[] { "images/DSCF2562.JPG",
                                                 "images/DSCF2756.JPG",
                                                 "images/DSCF2848.JPG",
                                                 "images/DSCF2871.JPG" }));

      // run the listener when this object/component is attached to the web page
      this.addAttachHandler(new Example01AttachListener(this));
   }

   protected Example01(Void void1)
   {
      super(void1);
   }
}
