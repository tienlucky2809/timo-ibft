package util;

import model.DataModel;

public class BuildResponseMsgUtil {

    public static String build0810Msg(DataModel dataModel) throws Exception {
        dataModel.setMti("0810");
        dataModel.setDe039ResCd("00");
        return DataMsgUtil.buildDataMsg(dataModel);
    }

    public static String build0210Msg(DataModel dataModel) throws Exception {

        //bo qua bat key 43:inquiry va 92: deposit

        //thay mti
        dataModel.setMti("0210");

        //xoa de014
        dataModel.setDe014ExpDate(null);

        //thoi gian quyet toan == thoi gian chuyen tien
        dataModel.setDe015StlDate(dataModel.getDe013LocTrnDate());

        //xoa de22
        dataModel.setDe022PosMode(null);

        //xoa de25
        dataModel.setDe025PosCndCd(null);

        // them de038 cho giao dich thanh cong (6 ky tu)
        dataModel.setDe038AuthIdRes("012345");

        //them de039 ==00 cho giao dich thanh cong
        dataModel.setDe039ResCd("00");

        //xoa de042
        dataModel.setDe042CrdAcptId(null);

        //xoa de043
        dataModel.setDe043CrdAcptLoc(null);

        //them de063
        //ans…016, LLLVAR
        dataModel.setDe063TrnRefNo("0123456789012345");

        //them de120
        dataModel.setDe120BenInf("tiendg test inquiry");

        //them mac
        dataModel.setDe128MacDat("0123456789012345");

        return DataMsgUtil.buildDataMsg(dataModel);
    }
}
