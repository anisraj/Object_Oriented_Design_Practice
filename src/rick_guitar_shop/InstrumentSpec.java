package rick_guitar_shop;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = properties;
        }
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec searchSpec) {
        for (Object keyValue : properties.keySet()) {
            String key = keyValue.toString();
            if (!properties.get(key).equals(searchSpec.getProperty(key))) {
                return false;
            }
        }
        return true;
    }
}
