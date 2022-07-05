package ver2_lec07.collectionframework.samplecode.main;

import ver2_lec07.collectionframework.samplecode.service.CallDataService;
import ver2_lec07.collectionframework.samplecode.service.impl.CallDataServiceImpl;

public class MainMethod {
    public static CallDataServiceImpl callDataService = new CallDataServiceImpl();

    public static void main(String[] args) {
        String industryData = callDataService.getIndustryData(1);
        System.out.println("getIndustryData ::: " + industryData);

        Object getNationName = callDataService.getNationData("국가1");
        System.out.println("getNationName ::: " + getNationName);

    }
}
