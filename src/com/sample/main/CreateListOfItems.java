package com.sample.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class CreateListOfItems {
	public static void main(String args[]){		
		List<Item> items=new ArrayList<Item>();
		for(int i=0;i<10;i++) {
			if(i <4) {			 
				Item item=new Item("Pretest"+i,0);
				items.add(item);
			}else {			
				Item item1=new Item("Operational"+Integer.toString(i),1);
				items.add(item1);
			}


		}
		System.out.println("******Normal List*********");
		for(int i=0;i<items.size();i++){
			System.out.println(items.get(i).ItemId+" "+items.get(i).itemType);
		} 

		Collections.shuffle(items, new Random());
		System.out.println("*********RandomList******");
		for(int j=0;j<items.size();j++) {
			System.out.println( items.get(j).ItemId+" "+items.get(j).itemType);
		}
		MovePretestItemsToStart(items);	
	}

	public static void MovePretestItemsToStart(List<Item> items)
	{

		Item firstPretest=null;
		List<Item> pretestList=new ArrayList<Item>();
		List<Item> mixedList=new ArrayList<Item>();
		List<Item> finalList=new ArrayList<Item>();

		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getItemType() == 0 && pretestList.size()<2 )
			{        	 
				firstPretest=new Item(items.get(i).getItemId(),items.get(i).getItemType());

				pretestList.add(firstPretest);
			}else {
				mixedList.add(items.get(i));
			}


		}
		finalList.addAll(pretestList);
		finalList.addAll(mixedList);
		System.out.println("***********FinalList***********");
		for(int k=0;k<finalList.size();k++) { 
			System.out.println("ItemName:"+finalList.get(k).ItemId+" "+"ItemIdType:"+finalList.get(k).itemType); 
		}

	}

}
