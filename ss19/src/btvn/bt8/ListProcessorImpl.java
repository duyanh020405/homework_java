package btvn.bt8;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {


    @Override
    public double sumOddNumbers(List<Integer> list) {
        double sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum ;
    }

    @Override
    public boolean checkOdd(List<Integer> list) {
        return ListProcessor.super.checkOdd(list);
    }
}
