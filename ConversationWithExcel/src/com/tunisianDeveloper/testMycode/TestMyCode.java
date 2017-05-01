package com.tunisianDeveloper.testMycode;

import com.tunisianDeveloper.code.domain.Data;
import com.tunisianDeveloper.code.services.ServiceToWriteInExcel;

public class TestMyCode {

	public static void main(String[] args) {
		Data data=new Data();
		ServiceToWriteInExcel exp=new ServiceToWriteInExcel();
		data.setFlux(new Object[][]{{"nom","prenom","adresse"},{"khelifi","j","tunis"},{"djo","hunter","thala"}});
		exp.writeIn(data);

	}

}
