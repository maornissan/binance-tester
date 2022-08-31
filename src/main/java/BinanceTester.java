import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.model.trade.MyTrade;

import java.util.List;

public class BinanceTester {

    public static void main(String... argv) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create("APIKEY", "API_SECRET",
                options);
        List<MyTrade> trades = syncRequestClient.getAccountTrades("BTCUSDT", null, null, null, 10);
        for(MyTrade trade: trades) {
            System.out.println(trade.toString());
        }
    }
}
