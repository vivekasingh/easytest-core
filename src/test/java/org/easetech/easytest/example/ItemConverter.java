
package org.easetech.easytest.example;

import java.util.Map;
import org.easetech.easytest.converter.AbstractConverter;

public class ItemConverter extends AbstractConverter<Item> {

    public Item convert(Map<String, Object> convertFrom) {
        Item item = null;
        System.out.println("Param Name is : " + getParamName());

        if (convertFrom != null) {
            item = new Item();
            item.setDescription((String) convertFrom.get("itemDescription"));
            System.out.println(convertFrom.get("itemId"));
            item.setItemId(new ItemId(Long.valueOf((String) convertFrom.get("itemId"))));
            item.setItemType((String) convertFrom.get("itemType"));
        }
        return item;
    }

}
