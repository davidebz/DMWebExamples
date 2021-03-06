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

import bz.davide.dmweb.shared.view.AttachEvent;
import bz.davide.dmweb.shared.view.AttachListener;

/**
 * @author Davide Montesin <d@vide.bz>
 */
public class PhotoGalleryAttachListener implements AttachListener
{
   PhotoGallery gallery;

   public PhotoGalleryAttachListener(PhotoGallery gallery)
   {
      super();
      this.gallery = gallery;
   }

   protected PhotoGalleryAttachListener(Void void1)
   {
   }

   @Override
   public void onAttachOrDetach(AttachEvent event)
   {
      if (event.isAttached())
      {
         this.gallery.start();
      }

   }
}
