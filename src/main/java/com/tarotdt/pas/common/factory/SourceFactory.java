package com.tarotdt.pas.common.factory;

import com.tarotdt.pas.common.service.SourceService;
import com.tarotdt.pas.common.service.impl.DDBSService;
import com.tarotdt.pas.common.service.impl.H2Service;
import com.tarotdt.pas.common.util.FileUtil;

public class SourceFactory {
	
	public static SourceService getFileType() throws Exception{
		
		/*if(FileUtil.getProperties("dataSourceType").equals("db")){
			return new DDBSService();
		}else{*/
			return new H2Service();
		//}
	}

}
