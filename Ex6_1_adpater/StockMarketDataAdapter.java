public class StockMarketDataAdapter implements CSVParser{

    private StockMarketDataParser stockMarketData;

    public StockMarketDataAdapter(StockMarketDataParser stockMarketData){
        this.stockMarketData = stockMarketData;
    }
    @Override
    public void parseCSV() {
        stockMarketData.parseFromCSV();
    }
    
}
