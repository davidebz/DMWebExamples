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

import bz.davide.dmweb.shared.view.DMClickEvent;
import bz.davide.dmweb.shared.view.DMClickHandler;
import bz.davide.dmweb.shared.view.SpanView;
import bz.davide.dmwebexamples.shared.component.Calculator;
import bz.davide.dmwebexamples.shared.component.PhotoGallery;

public class ButtonClickListener implements DMClickHandler
{
   Example01 example01;

   public ButtonClickListener(Example01 example01)
   {
      super();
      this.example01 = example01;
   }

   protected ButtonClickListener(Void void1)
   {

   }

   @Override
   public void onClick(DMClickEvent event)
   {
      this.example01.appendChild(new SpanView("Button pressed!"));
      this.example01.appendChild(new Calculator());
      this.example01.appendChild(new PhotoGallery(new String[] { "Butterfly 1", "Butterfly 2", "Cloud", "Sea" },
                                                  new String[] { "images/DSCF2562.JPG",
                                                           "images/DSCF2756.JPG",
                                                           "images/DSCF2848.JPG",
                                                           "images/DSCF2871.JPG" }));
   }
}
