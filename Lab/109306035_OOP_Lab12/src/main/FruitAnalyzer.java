package main;

import lab.practice.Fruit;

public class FruitAnalyzer implements Analyzer{

	@Override
	public double measurer(Object object) {
		// TODO Auto-generated method stub
		//Double aDouble=(Double)object;
		Fruit fruit=(Fruit)object;
		fruit.getPrice();
		fruit.getSales();
		double value=0;
		double sale=0;
		for(int i=0;i<fruit.getSales().size();i++) {
			sale+=fruit.getSales().get(i);
		}
		value=fruit.getPrice()*sale;
		return value;
	}

	@Override
	public String getName(Object object) {
		// TODO Auto-generated method stub
		Fruit fruit=(Fruit)object;
		fruit.getName();
		return fruit.getName();
	}

}
