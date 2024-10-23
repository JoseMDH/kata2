package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Proyectos IS2\\title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        HashMap<String, Integer> stats = new HashMap<>();
        for (Title title : titles) {
            stats.put(title.getTitleType(), stats.getOrDefault(title.getTitleType(), 0) + 1);
        }
        StatsDisplayer histogramStatsDisplayer = new HistogramStatsDisplayer(new FromMapHistogramElementBuilder(stats));
        histogramStatsDisplayer.displayStats();

    }
}
