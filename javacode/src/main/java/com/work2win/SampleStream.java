package com.work2win;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Lists;



public class SampleStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream;
		List<Integer> li = Lists.newArrayList(1,2,3,4,5);
		List names = Arrays.asList("Reflection","Collection","Stream");
		
		List square = li.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(square);
		Map<Boolean, List<Integer>> m = li.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
		System.out.println(m);
		Set<Entry<Boolean, List<Integer>>> e = m.entrySet();
		for(Entry<Boolean, List<Integer>> en : e) {
			if(en.getKey())
				System.out.println("even"+en.getValue());
			else
				System.out.println("odd"+en.getValue());
		}
		
		List<Integer> l = Arrays.asList(1,2,3);
		System.out.println(l.stream().map(i-> i*i).collect(Collectors.toList()));
		
	}

}
