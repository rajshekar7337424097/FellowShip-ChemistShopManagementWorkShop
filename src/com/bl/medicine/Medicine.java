package com.bl.medicine;


import java.util.Arrays;
import java.util.Date;

public class Medicine {
	
	enum Type {
		HOMEIOPATHY, ALLOPATHY, AYURVEDIC
	}
	
		String companyName;
		Date mfgDate;
		Date ExpiryDate;
		String[] composition;
		Type medicineType;
		
		@Override
		public String toString() {
			return "Medicine [brand=" + companyName + ", mfgDate=" + mfgDate + ",medicineType="+ medicineType +" ExpiryDate=" + ExpiryDate + ", composition="
					+ Arrays.toString(composition) + "]";
		}
}
