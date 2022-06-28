package lec04;

public class ObjClass02 {

    public static void main(String[] args) {
        ProcurementDocument procurementDocument = new ProcurementDocument();

        procurementDocument.procureRequestDocumentQty = 10;
        procurementDocument.orderDocumentQty =3;
        procurementDocument.orderRequestDocumentQty = 5;
        procurementDocument.contractDocumentQty = 20;
        procurementDocument.estimateDocumentQty = 30;

        System.out.println(procurementDocument.procureRequestDocumentQty);
        System.out.println(procurementDocument.contractDocumentQty);

        int sum = procurementDocument.totalDocumentQtyDailyMake();
        System.out.println(sum);
    }
}
