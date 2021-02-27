package com.xworkz.rich;

import com.xworkz.rich.dao.RichDAO;
import com.xworkz.rich.dao.RichDAOImpl;
import com.xworkz.rich.entity.RichEntity;

public class RichEntityTester {
	
	public static void main(String[] args) {
		
		
		RichEntity richEntity=new RichEntity();
		richEntity.setName("Bill get");
		richEntity.setBusiness("OS");
		richEntity.setCountry("USA");
		richEntity.setMarried(true);
		richEntity.setNetWorthInBillion(134);
		richEntity.setRank(3);
		richEntity.setId(1);
		
		RichEntity richEntity1=new RichEntity();
		richEntity1.setName("Elon Musk");
		richEntity1.setBusiness("revolutionize transportation");
		richEntity1.setCountry("South Africa");
		richEntity1.setMarried(true);
		richEntity1.setNetWorthInBillion(100);
		richEntity1.setRank(2);
		richEntity1.setId(2);
		
		RichDAO richDAO=new RichDAOImpl();
		richDAO.create(richEntity);
		richDAO.create(richEntity1);
	}

}
