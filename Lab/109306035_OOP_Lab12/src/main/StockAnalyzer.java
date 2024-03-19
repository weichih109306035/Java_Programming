package main;

import lab.practice.Stock;

public class StockAnalyzer implements Analyzer{

	@Override
	public double measurer(Object object) {
		// TODO Auto-generated method stub
		Stock stock=(Stock)object;
		stock.getClosingPrice();
		stock.getOpeningPrice();
		stock.getVolume();
		double value=(stock.getClosingPrice()-stock.getOpeningPrice())*stock.getVolume()*1000;
		return value;
	}

	@Override
	public String getName(Object object) {
		// TODO Auto-generated method stub
		Stock s=(Stock)object;
		s.getSymbol();
		return s.getSymbol();
	}

}
