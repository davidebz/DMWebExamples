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

import bz.davide.dmweb.shared.view.AttachListener;

public class Example01AttachListener implements AttachListener
{
   Example01 example01;

   public Example01AttachListener(Example01 example01)
   {
      this.example01 = example01;
   }

   protected Example01AttachListener(Void void1)
   {
   }

   @Override
   public void onAttachOrDetach(bz.davide.dmweb.shared.view.AttachEvent event)
   {
      if (event.isAttached())
      {
         // the component is added to the page
      }
      else
      {
         // the component is removed from the page
      }
   }
}
