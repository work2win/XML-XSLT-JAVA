package com.work2win;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Lists;



public class SampleStream {

	public static void main(String[] args) {
		meth();
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(23);
		l.add(143);
		l.add(233);
		l.add(134);
		l.add(23);
		Collections.sort(l);
		System.out.println("list"+l);
		
		
		
		
	}

	private static void meth() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Stream<Integer> stream;
		Set<Integer> se = new HashSet();
		se.add(1);se.add(111);se.add(1);se.add(13233);se.add(133);se.add(1);se.add(1);
		List<Integer> li = Lists.newArrayList(1,2,3,4,5);
		List names = Arrays.asList("Reflection","Collection","Stream");
		System.out.println(se);
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
		System.out.println(Stream.of("green","yellow", "blue").max((s1,s2)->s1.compareTo(s2)).filter(
				s->s.endsWith("n")).orElse("yello"));
		
	
		
	}

}
