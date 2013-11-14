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

import bz.davide.dmweb.client.leaflet.LatLng;
import bz.davide.dmweb.client.leaflet.Map;
import bz.davide.dmweb.shared.view.DMClickEvent;
import bz.davide.dmweb.shared.view.DMClickHandler;

import com.google.gwt.core.client.Callback;
import com.google.gwt.geolocation.client.Geolocation;
import com.google.gwt.geolocation.client.Geolocation.PositionOptions;
import com.google.gwt.geolocation.client.Position;
import com.google.gwt.geolocation.client.PositionError;

public class ShowGPSPositionClick implements DMClickHandler
{
   Map map;

   public ShowGPSPositionClick(Map map)
   {
      super();
      this.map = map;
   }

   @Override
   public void onClick(DMClickEvent event)
   {
      PositionOptions positionOptions = new PositionOptions();
      positionOptions.setHighAccuracyEnabled(true);
      positionOptions.setTimeout(10000);

      Geolocation geoloc = Geolocation.getIfSupported();
      geoloc.getCurrentPosition(new Callback<Position, PositionError>()
      {
         @Override
         public void onSuccess(Position result)
         {
            ShowGPSPositionClick.this.map.setView(new LatLng(result.getCoordinates().getLatitude(),
                                                             result.getCoordinates().getLongitude()), 15);
         }

         @Override
         public void onFailure(PositionError reason)
         {

         }

      }, positionOptions);
   }
}
