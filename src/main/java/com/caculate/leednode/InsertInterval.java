package com.caculate.leednode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> intervalList=new ArrayList<Interval>();
        Interval tempInterval=null;
        boolean isNewIntervalIn=true;

        for(Interval interval:intervals){
            if(interval.start<=newInterval.start && interval.end>=newInterval.end){
                tempInterval=new Interval(interval.start,interval.end);
                intervalList.add(tempInterval);
                isNewIntervalIn=false;
            }else if((interval.start<=newInterval.start && interval.end>=newInterval.start) ){
                if(tempInterval==null){
                    tempInterval=new Interval(interval.start,newInterval.end);
                    intervalList.add(tempInterval);
                    isNewIntervalIn=false;
                }else{

                    intervalList.remove(tempInterval);
                    tempInterval=new Interval(tempInterval.start,newInterval.end);
                    intervalList.add(tempInterval);
                }
            }else if(interval.start<=newInterval.end && interval.end>=newInterval.end){
                if(tempInterval==null){
                    tempInterval=new Interval(newInterval.start,interval.end);
                    intervalList.add(tempInterval);
                    isNewIntervalIn=false;
                }else{
                    intervalList.remove(tempInterval);
                    tempInterval=new Interval(tempInterval.start,interval.end);
                    intervalList.add(tempInterval);
                }
            }else if(interval.start>=newInterval.start && interval.end<=newInterval.end){
                if(tempInterval==null){
                    tempInterval=new Interval(newInterval.start,newInterval.end);
                    intervalList.add(tempInterval);
                    isNewIntervalIn=false;
                }else{
                    intervalList.remove(tempInterval);
                    tempInterval=new Interval(tempInterval.start,newInterval.end);
                    intervalList.add(tempInterval);
                }

            }else{
                intervalList.add(interval);
            }
        }

        if(intervals.size()==0 || isNewIntervalIn){
            intervalList.add(newInterval);
        }

        for(int x=0;x<intervalList.size();x++){
            for(int y=x+1;y<intervalList.size();y++){
                Interval temp=new Interval();
                if(intervalList.get(y).start<intervalList.get(x).start){
                    temp.start=intervalList.get(y).start;
                    temp.end=intervalList.get(y).end;

                    intervalList.get(y).start=intervalList.get(x).start;
                    intervalList.get(y).end=intervalList.get(x).end;

                    intervalList.get(x).start=temp.start;
                    intervalList.get(x).end=temp.end;


                }
            }

        }




        return intervalList;
    }
}

class Interval {
     int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}
