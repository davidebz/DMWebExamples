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

import bz.davide.dmweb.shared.view.DMClickEvent;
import bz.davide.dmweb.shared.view.DMClickHandler;

import com.google.gwt.storage.client.Storage;

public class NotepadSave implements DMClickHandler
{
   Notepad notepad;

   public NotepadSave(Notepad notepad)
   {
      this.notepad = notepad;
   }

   protected NotepadSave(Void void1)
   {
   }

   @Override
   public void onClick(DMClickEvent event)
   {
      final Storage localStorage = Storage.getLocalStorageIfSupported();
      localStorage.setItem(this.notepad.localStorageKeyName, this.notepad.textArea.getValue());
   }

}
