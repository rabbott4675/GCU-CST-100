package chapterNine;

import ToolKit.Stock;

public class NineTwo {

	  public static void main(String[] args) {

	        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
	        stock1.setCurrentPrice(43.35);
	        stock1.setCurrentPrice(43.35);
	        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
	        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
	        System.out.println("current price: " + stock1.getCurrentPrice());
	        System.out.println("Percent changed: " + stock1.getChangePercent());

	    }

}
