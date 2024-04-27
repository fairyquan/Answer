package scp;

import java.util.*;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        //创建广播电台，放入map
        HashMap<String, HashSet<String>> broadcasts = new HashMap<>();
        //将各个电台放入
        HashSet<String> set1 = new HashSet<>();
        set1.add("北京");
        set1.add("上海");
        set1.add("天津");
        HashSet<String> set2 = new HashSet<>();
        set2.add("广州");
        set2.add("北京");
        set2.add("深圳");
        HashSet<String> set3 = new HashSet<>();
        set3.add("成都");
        set3.add("上海");
        set3.add("杭州");
        HashSet<String> set4 = new HashSet<>();
        set4.add("上海");
        set4.add("天津");
        HashSet<String> set5 = new HashSet<>();
        set5.add("杭州");
        set5.add("大连");

        //加入到map
        broadcasts.put("k1",set1);
        broadcasts.put("k2",set2);
        broadcasts.put("k3",set3);
        broadcasts.put("k4",set4);
        broadcasts.put("k5",set5);

        //创建一个存放所有城市的集合，就遍历集合就行
        HashSet<String> allAreas = new HashSet<>();
        for(Map.Entry<String, HashSet<String>> entry: broadcasts.entrySet())
        {
            HashSet<String> set = entry.getValue();
            allAreas.addAll(set);
        }

        System.out.println(allAreas);

        //创建一个ArrayList存放选择后的 电台的集合
        ArrayList<String> selects = new ArrayList<>();
        //保存每次 当前覆盖的地区和未覆盖到的地区的交集，用retainAll()方法
        HashSet<String> tempSet = new HashSet<>();
        HashSet<String> value = new HashSet<>();
        //创建一个指针maxKey,存放交集最大的key
        String maxKey = null;

        while (allAreas.size() != 0){ //allAreas 不为空就表示没覆盖到所有地区
            maxKey = null;
            //找到maxKey
            for (String key : broadcasts.keySet()) {
                tempSet.clear();
                value.clear();
                //存放Key覆盖的地区
                value.addAll(broadcasts.get(key));
                //求当前key覆盖的地区和allAreas的交集
                value.retainAll(allAreas);
                //下面两步是取出maxKey覆盖地区和allAreas的交集
                if (maxKey != null) {
                    tempSet.addAll(broadcasts.get(maxKey));
                    tempSet.retainAll(allAreas);
                }

                if (value.size() > 0 && (maxKey == null || (value.size() > tempSet.size()))){
                    maxKey = key;
                }
            }
            if (maxKey != null) {
                selects.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));
            }
        }

        System.out.println(selects);
    }
}

