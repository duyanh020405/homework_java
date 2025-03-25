package btvn.bt7;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        for (Integer num : list) {
            if (num < 0) return true;
        }
        return false;
    }

}

