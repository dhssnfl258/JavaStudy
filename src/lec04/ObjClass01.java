package lec04;

public class ObjClass01 {
//참조변수란?
    public static void main(String[] args) {

        ProcureItemVO procureItemVo = new ProcureItemVO();

        System.out.println("nothing:::"+procureItemVo.toString());

        procureItemVo.setId(1);
        procureItemVo.setName("옥수수");
        procureItemVo.setQuantity(3);
        procureItemVo.setPrice(10000);

        System.out.println("something:::"+procureItemVo.toString());

        ProcureItemVO procureItemvonull = null;

        System.out.println("null:::" + procureItemvonull);
        System.out.println("null:::" + procureItemVo);

    }
}
