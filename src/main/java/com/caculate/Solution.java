package com.caculate;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> intervalList=new ArrayList<Interval>();
        Interval tempInterval=null;

        for(Interval interval:intervals){
            if((interval.start<=newInterval.start && interval.end>=newInterval.start) ){
                if(tempInterval==null){
                    tempInterval=new Interval(interval.start,newInterval.end);
                }else{
                    tempInterval=new Interval(tempInterval.start,newInterval.end);
                }

            }else if(interval.start>=newInterval.end && interval.end<=newInterval.end){
                if(tempInterval==null){
                    tempInterval=new Interval(newInterval.start,interval.end);
                }else{
                    tempInterval=new Interval(interval.start,tempInterval.end);
                }
            }else{
                intervalList.add(interval);
            }
        }

        intervalList.add(tempInterval);
        Collections.sort(intervalList, new Comparator<Interval>() {
            //@Override
            public int compare(Interval lhs, Interval rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs.start < rhs.start ? -1 : (lhs.start > rhs.start) ? 1 : 0;
            }
        });

        return intervalList;
    }
}


class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}