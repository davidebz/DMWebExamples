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

package bz.davide.dmwebexamples.shared.component;

import bz.davide.dmweb.shared.view.ButtonView;
import bz.davide.dmweb.shared.view.DivView;
import bz.davide.dmweb.shared.view.TextAreaView;

public class Notepad extends DivView
{
   TextAreaView textArea;
   String       localStorageKeyName;

   public Notepad(String localStorageKeyName)
   {
      this.localStorageKeyName = localStorageKeyName;
      this.textArea = new TextAreaView(25, 80);
      this.appendChild(this.textArea);
      ButtonView save = new ButtonView("Save");
      this.appendChild(save);
      save.addClickHandler(new NotepadSave(this));
      this.addAttachHandler(new NotepadAttach(this));
   }

   protected Notepad(Void void1)
   {
      super(void1);
   }
}
