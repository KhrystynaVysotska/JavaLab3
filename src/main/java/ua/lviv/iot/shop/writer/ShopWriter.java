package ua.lviv.iot.shop.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.shop.model.AbstractGoodsForKids;

public class ShopWriter {
    private Writer csvWriter;

    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }

    public void writeToFile(List<AbstractGoodsForKids> goods) throws IOException {
        for (AbstractGoodsForKids good : goods) {
            csvWriter.write(good.getHeaders());
            csvWriter.write(good.toCSV());
        }
    }
}