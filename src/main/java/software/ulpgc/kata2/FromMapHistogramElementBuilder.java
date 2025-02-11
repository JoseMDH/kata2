package software.ulpgc.kata2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FromMapHistogramElementBuilder implements HistogramElementsBuilder{
    private final Map<String, Integer> data;

    public FromMapHistogramElementBuilder(Map<String, Integer> data) {
        this.data = data;
    }

    @Override
    public List<HistogramElement> build() {
        List<HistogramElement> histogramElements = new ArrayList<>();
        for (String i: data.keySet()) {
            histogramElements.add(new HistogramElement(i, data.get(i)));
        }
        return histogramElements;
    }
}
