package com.tunisianDeveloper.code.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.tunisianDeveloper.code.domain.Data;

public class ServiceToWriteInExcel {

	
	StringBuilder sb=new StringBuilder();
	public void writeIn(Data data)
	{
		Object [][] flux=data.getFlux();
		for(int i=0; i<flux.length;i++)
		{
			sb.append("\r\n");
			for(int j=0;j< flux[i].length;j++)
			{
				sb.append(flux[i][j]).append(";");
			}
		}
		try {
			PrintWriter printWriter=new PrintWriter(new File("result.csv") );
			printWriter.write(sb.toString());
			printWriter.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
