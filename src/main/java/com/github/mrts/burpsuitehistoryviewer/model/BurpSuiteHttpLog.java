package com.github.mrts.burpsuitehistoryviewer.model;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Reader;
import java.util.List;

@XmlRootElement(name = "items")
public class BurpSuiteHttpLog {

    private List<HttpLogItem> items;

    @XmlElement(name = "item")
    public List<HttpLogItem> getItems() {
        return items;
    }

    public void setItems(List<HttpLogItem> items) {
        this.items = items;
    }

    public static BurpSuiteHttpLog deserialize(Reader xml) {
        return JAXB.unmarshal(xml, BurpSuiteHttpLog.class);
    }

}
