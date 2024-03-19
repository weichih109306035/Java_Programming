package main;

import java.util.Arrays;

public class Fruit {
	private String name;
	private int price,totalSales;
	private int[]sale;
	int i;
	public Fruit(String name,int price) {
		this.name = name;
		this.price = price;
		name = "";
		price = 0;
		totalSales = 0;
		sale = new int[3];
		i=0;
		}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void updateTotalsales(int amount) {
		if(i<sale.length) {
			sale[i]=amount;
			i++;
			totalSales = totalSales + amount;
		}
	}
	public String getInfo() {
		String Info = "";
		Info=Info+String.format("Fruit name: %-6s\n",getName());
		Info=Info+String.format("Fruit price: %-5d\n", getPrice());
		Info=Info+"Indiv sales: ";
		Arrays.sort(sale);
		for(int sale:sale) {
			if(sale!=0) {
				Info=Info+String.format("%d,",sale);
			}
		}
		Info =Info +String.format("\nTotal sales: %-5d\n", getTotalSales());
		return Info;
	}
}