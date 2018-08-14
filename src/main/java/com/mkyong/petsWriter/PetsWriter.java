package com.mkyong.petsWriter;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.mkyong.pets.Pets;

public class PetsWriter implements ItemWriter<Pets>{

	@Override
	public void write(List<? extends Pets> pets) throws Exception {
		System.out.println(pets);
	}

}
