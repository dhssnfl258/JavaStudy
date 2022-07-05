package ver2_lec07.collectionframework.samplecode.service.impl;

import ver2_lec07.collectionframework.samplecode.impl.CallDataRepositoryImpl;
import ver2_lec07.collectionframework.samplecode.service.CallDataService;

public class CallDataServiceImpl implements CallDataService  {


    CallDataRepositoryImpl callDataRepositoryImpl = null;

    public CallDataServiceImpl(){
        System.out.println("CallDataService 기본생성");
        callDataRepositoryImpl = CallDataRepositoryImpl.getInstance();
    }
    @Override
    public Object getNationData(String nationName) {
        return callDataRepositoryImpl.getNationData(nationName);
    }

    @Override
    public String getIndustryData(int paramIndex) {
        return callDataRepositoryImpl.getIndustryData(paramIndex);
    }
}
