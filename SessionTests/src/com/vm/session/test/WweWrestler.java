package com.vm.session.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class WweWrestler {
	 static long sumOfWeightOfWrestlers(ArrayList<Wwe> wrestlers1)
	 {
	  long sum=0;
	  sum= wrestlers1.stream().filter(s->s.getWeight()>200).collect(Collectors.summarizingInt(Wwe::getWeight)).getSum();
	  return sum;
	  
	 }
	 
	 static List firstNameOfWrestler(ArrayList<Wwe>wrestlers1)
	 {
	  List firstName=wrestlers1.stream().map(m->m.getFirstName()).collect(Collectors.toList());
	  return firstName;
	 }

	public static void main(String[] args) {
		
		List<Wwe> wrestler1=new ArrayList<Wwe>();
		
		wrestler1.add(new Wwe("bhanu","teja",185));
		wrestler1.add(new Wwe("abhi","kumar",220));
		wrestler1.add(new Wwe("venkat","sai",110));
		
		System.out.println(wrestler1);
		wrestler1.forEach(s->System.out.println(s));
		
		long count=wrestler1.stream().count();
		System.out.println("total elements: "+count);
		
		  System.out.println("Sum of all weight of all wrestlers whose weight is above 200: "+sumOfWeightOfWrestlers(wrestlers1));

		  
		  System.out.println("Wrestlers First Name: "+firstNameOfWrestler(wrestlers1));
		  System.out.println("Sort by First Name: ");
		  
		  wrestlers1.sorted(Comparator.comparing(Wwewrestlers1.stream().sorted(Comparator.comparing(Wwe::getfirstName)).forEach(System.out::println);
		  
		  
		  
		System.out.println("sort by name:");
		wrestler1.stream().sorted(Comparator.comparing(Wwe::getFirstName)).forEach(System.out::println);
	}

}
