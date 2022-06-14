package info.sjd;

import info.sjd.model.SessionItem;
import info.sjd.service.FileService;
import info.sjd.util.DigitUtil;

public class AppRunner {
    public static void main(String[] args) {
        SessionItem sessionItem = new SessionItem(
                System.currentTimeMillis(),
                DigitUtil.getRandomNumberInRange(1000000, 10000000),
                "222.333.444.55"

        );
        FileService.writeTextToFile(sessionItem.toString(), false, "test.txt");
    }
}
