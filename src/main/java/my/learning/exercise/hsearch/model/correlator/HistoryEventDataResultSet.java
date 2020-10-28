//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package my.learning.exercise.hsearch.model.correlator;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class HistoryEventDataResultSet {
    private List<HistoryEvent> historyEventList;
    private int totalRecordsCount = -1;

    public HistoryEventDataResultSet() {
    }

    public List<HistoryEvent> getHistoryEventList() {
        return this.historyEventList;
    }

    public void setHistoryEventList(List<HistoryEvent> historyEventList) {
        this.historyEventList = historyEventList;
    }

    public int getTotalRecordsCount() {
        return this.totalRecordsCount;
    }

    public void setTotalRecordsCount(int totalRecordsCount) {
        this.totalRecordsCount = totalRecordsCount;
    }
}
