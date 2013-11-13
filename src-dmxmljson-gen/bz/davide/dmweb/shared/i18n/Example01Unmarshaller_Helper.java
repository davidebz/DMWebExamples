/*********************************************************************************
 *                                                                               *
 * WARNING: File automatically generated by DMXmlJson. DON'T CHANGE IT manually! *
 *                                                                               *
 *********************************************************************************/

package bz.davide.dmweb.shared.i18n;


public class Example01Unmarshaller_Helper extends bz.davide.dmwebexamples.shared.Example01Unmarshaller_Helper
{
   protected Example01Unmarshaller_Helper()
   {
      this.putInstanceFactory("bz.davide.dmweb.shared.i18n.I18NData", new bz.davide.dmxmljson.unmarshalling.InstanceFactory() {
         @Override public Object newInstance() throws Exception {
            return new bz.davide.dmweb.shared.i18n.I18NData((Void)null);
         }
      });

      this.putClassUnmarshaller("bz.davide.dmweb.shared.i18n.I18NData", new bz.davide.dmxmljson.unmarshalling.ClassUnmarshaller() {
         @Override public void unmarshall(bz.davide.dmxmljson.unmarshalling.Structure structure, Object obj, java.util.HashMap<String, Object> identities) throws Exception {
            internalUnmarschall(structure, "bz.davide.dmweb.shared.i18n.I18N", obj, identities);
            String id = structure.getId();
            if (id != null)
               identities.put(id, obj);
            bz.davide.dmxmljson.unmarshalling.Value value;
            // language
            if ((value = structure.property("language")) != null)
               if (value.isNull())
                  ((I18NData)obj).language = null;
               else
               {
                  ((I18NData)obj).language = value.string();
               }
            // map
            if ((value = structure.property("map")) != null)
               if (value.isNull())
                  ((I18NData)obj).map = null;
               else
               {
                  //hashmap
                  bz.davide.dmxmljson.unmarshalling.Array arr = value.array();        
                  java.util.HashMap hashMap = new java.util.HashMap();       
                  while ((value = arr.nextItem()) != null) {                       
                     bz.davide.dmxmljson.unmarshalling.Array item = value.array();        
                     Object key = item.nextItem().string();
                     hashMap.put(key,item.nextItem().string());
                  }                       
                  ((I18NData)obj).map = hashMap;
               }
         }
      });
      this.putInstanceFactory("bz.davide.dmweb.shared.i18n.I18N", new bz.davide.dmxmljson.unmarshalling.InstanceFactory() {
         @Override public Object newInstance() throws Exception {
            return null;
         }
      });

      this.putClassUnmarshaller("bz.davide.dmweb.shared.i18n.I18N", new bz.davide.dmxmljson.unmarshalling.ClassUnmarshaller() {
         @Override public void unmarshall(bz.davide.dmxmljson.unmarshalling.Structure structure, Object obj, java.util.HashMap<String, Object> identities) throws Exception {
            String id = structure.getId();
            if (id != null)
               identities.put(id, obj);
            bz.davide.dmxmljson.unmarshalling.Value value;
         }
      });

   }
}
