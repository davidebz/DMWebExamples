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

package bz.davide.dmwebexamples.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bz.davide.dmweb.shared.i18n.I18NData;
import bz.davide.dmweb.shared.view.AbstractHtmlElementView;
import bz.davide.dmweb.shared.view.AttachListener;
import bz.davide.dmweb.shared.view.DMWidgetSerializationData;
import bz.davide.dmwebexamples.shared.Example01;
import bz.davide.dmwebexamples.shared.Example01Marshaller;
import bz.davide.dmxmljson.marshalling.json.JSONStructure;

public class Example01Servlet extends HttpServlet
{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
                                                                         IOException
   {
      try
      {
         AbstractHtmlElementView.clientSide = false;

         PrintWriter printWriter = new PrintWriter(resp.getWriter());
         printWriter.println("<!doctype html>"); // HTML5 doctype
         printWriter.println("<html>");
         printWriter.println("<title>Example01</title>");
         printWriter.println("<link type=\"text/css\" rel=\"stylesheet\" href=\"DMWebExamples.css\">");
         printWriter.println("<script type=\"text/javascript\" src=\"dmwebexamples/dmwebexamples.nocache.js\"></script>");
         printWriter.println("<body>");

         Example01 example01 = new Example01();

         String htmlCode = generateHtmlCode(example01);
         printWriter.println(htmlCode);

         printWriter.println("</body>");
         printWriter.println("</html>");

         printWriter.flush();

      }
      catch (Exception exxx)
      {
         throw new ServletException(exxx);
      }
   }

   static String generateHtmlCode(AbstractHtmlElementView view) throws Exception
   {
      ArrayList<AttachListener> domReady = new ArrayList<AttachListener>();
      I18NData i18n = new I18NData("en", new HashMap<String, String>());
      DMWidgetSerializationData serializationData = new DMWidgetSerializationData(domReady, i18n);
      StringBuffer htmlCode = new StringBuffer();
      AbstractHtmlElementView.generateServerSideHtml(serializationData, view, htmlCode);

      JSONStructure jsonStructure = new JSONStructure();
      Example01Marshaller marshaller = new Example01Marshaller();
      marshaller.marschall(serializationData, jsonStructure);

      htmlCode.append("<script>\nvar bz_davide_dm_widgets = ");
      htmlCode.append(jsonStructure.toString());
      htmlCode.append("</script>\n");

      return htmlCode.toString();
   }
}
