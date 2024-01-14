public class App {

	public static void main(String[] args) {
		
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stockMarketData = new StockMarketDataAdapter(new StockMarketDataParser());
		parse(realEstate);
		parse(machineLearning);
		parse(stockMarketData);
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
