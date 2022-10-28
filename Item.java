package com.sample.main;

public class Item {
 String ItemId;
 Integer itemType;
public Item(String itemId, Integer itemType) {
	
	ItemId = itemId;
	this.itemType = itemType;
}
public String getItemId() {
	return ItemId;
}
public void setItemId(String itemId) {
	ItemId = itemId;
}
public Integer getItemType() {
	return itemType;
}
public void setItemType(Integer itemType) {
	this.itemType = itemType;
}





}


/*
 * enum ItemTypeEnum{ public int Pretest = 0; public int Operational = 1;
 * 
 * }
 */