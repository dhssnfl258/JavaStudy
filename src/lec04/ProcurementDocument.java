package lec04;

public class ProcurementDocument {

    public int procureRequestDocumentQty;
    public int orderRequestDocumentQty;
    public int orderDocumentQty;
    public int contractDocumentQty;
    public int estimateDocumentQty;

    public int totalDocumentQtyDailyMake(){
        int totalDocument = procureRequestDocumentQty + orderRequestDocumentQty
                + orderDocumentQty + contractDocumentQty + estimateDocumentQty;
        return totalDocument;
    }

    public int staticValueCalculateDailyDocument(){
        int totalDocumentCnt = 0;

        totalDocumentCnt = 10 + 5 + 1 + 3+ 5;

        return totalDocumentCnt;
    }
}
