package ua.lviv.iot.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.shop.BaseShopManagerTest;
import ua.lviv.iot.shop.model.AbstractGoodsForKids;
import ua.lviv.iot.shop.writer.ShopWriter;

public class ShopWriterTest extends BaseShopManagerTest {

    @Test
    public void testFileWriter() {
        try (Writer csvWriter = new FileWriter("objects.csv")) {
            ShopWriter writer = new ShopWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(sweaters);
        } catch (Exception e) {
            fail("test failed unexcpectedly");
        }
    }

    @Test
    public void testProperTextFormatting() {
        try (Writer csvWriter = new StringWriter()) {
            ShopWriter writer = new ShopWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(sweaters);
            String expectedLine = "";
            for (AbstractGoodsForKids sweater : sweaters) {
                expectedLine += sweater.getHeaders() + sweater.toCSV();
            }
            assertEquals(expectedLine, csvWriter.toString());
        } catch (Exception e) {
            fail("the test failed unexpectedly - try to write to the file...");
        }
    }
}
