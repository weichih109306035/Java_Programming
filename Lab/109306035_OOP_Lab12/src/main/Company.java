package main;
import java.util.*;
public class Company {
	private ArrayList<String> rankingNames;
	private ArrayList<Double> rankingValues;
	private Analyzer analyzer;
	private double netValue;
	public Company(Analyzer analyzer) {
		rankingNames=new ArrayList<String>();
		rankingValues=new ArrayList<Double>();
		this.analyzer=analyzer;
	}
	
	public void add(Object object) {
		rankingNames.add(analyzer.getName(object));
		rankingValues.add(analyzer.measurer(object));
	}
	public void calcNetValue() {
		for(int i=0;i<rankingValues.size();i++) {
			netValue+=rankingValues.get(i);
		}
	}
	public String getInfo() {
		calcNetValue();
		String info="";
	    info+=String.format("Net value: %.2f\n",netValue);
	    info+="\nName         Value\n";
	    info+="----------------------\n";
	    for(int i=0;i<rankingNames.size()&&i<rankingValues.size();i++) {
	    	info+=String.format("%-10s %8.2f\n",rankingNames.get(i),rankingValues.get(i));
	    }
		return info;
	}
}
