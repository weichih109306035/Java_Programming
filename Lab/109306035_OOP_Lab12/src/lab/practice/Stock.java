package lab.practice;

public class Stock {
	private String symbol;
	private double openingPrice;
	private double closingPrice;
	private double volume;
	public Stock(String symbol, double openingPrice, double closingPrice, double volume) {
		this.symbol=symbol;
		this.openingPrice=openingPrice;
		this.closingPrice=closingPrice;
		this.volume=volume;
	}
	public String getSymbol() {
		return symbol;
	}
	public double getOpeningPrice() {
		return openingPrice;
	}
	public double getClosingPrice() {
		return closingPrice;
	}
	public double getVolume() {
		return volume;
	}

}
