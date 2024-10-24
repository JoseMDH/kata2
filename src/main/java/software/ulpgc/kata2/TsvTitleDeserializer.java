package software.ulpgc.kata2;

import java.util.Arrays;
import java.util.List;

public class TsvTitleDeserializer implements TitleDeserializer {
    @Override
    public Title deserialize(String line) {
        return deserialize(line.split("\t"));
    }

    private Title deserialize(String[] split) {
        return new Title(split[0],
                split[1],
                split[2],
                split[3],
                toBoolean(split[4]),
                toInt(split[5]),
                toInt(split[6]),
                toInt(split[7]),
                split[8]);
    }

    private int toInt(String value) {
        if (value.equals("\\N")) return 0;
        return Integer.parseInt(value);
    }

    private boolean toBoolean(String value) {
        return value.equals("1");
    }
}
