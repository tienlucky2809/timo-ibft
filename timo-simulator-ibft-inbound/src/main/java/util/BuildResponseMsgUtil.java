package util;

import com.cedarsoftware.util.io.JsonWriter;
import lombok.extern.slf4j.Slf4j;
import model.DataModel;
import org.apache.commons.lang3.StringUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

@Slf4j
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

    public static String buildInbound0200() throws Exception {
        String msgInb0200 = "";


        Instant instant = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        LocalDateTime gmt7Dt = LocalDateTime.now();


        String ldtDateString = DateTimeUtil.toString(ldt, "yyyyMMdd");
        String ldtDateAndTimeString = DateTimeUtil.toString(ldt, "yyyyMMddHHmmss");
        String ldtDateAndTimeShortString = DateTimeUtil.toString(ldt, "MMddHHmmss");
        String ltdTimeString = DateTimeUtil.toString(ldt, "HHmmss");
        String gmt7DateString = DateTimeUtil.toString(gmt7Dt, "MMdd");
        String gmt7TimeString = DateTimeUtil.toString(gmt7Dt, "HHmmss");

        DataModel dataModel = new DataModel();
        dataModel.setMti("0200");
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        int refNo = rnd.nextInt(99);

        //
        dataModel.setDe002Pan("1500027012");
        dataModel.setDe003ProcCd("432020");
        dataModel.setDe004TrnAmt("000000100000");

        dataModel.setDe005StlAmt("");
        dataModel.setDe006BilAmt("");
        dataModel.setDe007TrnDt(ldtDateAndTimeShortString);
        dataModel.setDe009StlConvRt("");
        dataModel.setDe010BilConvRt("");
        dataModel.setDe011TraceNo(String.format("%06d", number));
        dataModel.setDe012LocTrnTime(gmt7TimeString);
        dataModel.setDe013LocTrnDate(gmt7DateString);
        dataModel.setDe014ExpDate("");
        dataModel.setDe015StlDate(gmt7DateString);
        dataModel.setDe018MerCatCd("");
        dataModel.setDe019AcqCtryCd("");
        dataModel.setDe022PosMode("000");
        dataModel.setDe023CrdSeqNo("");
        dataModel.setDe025PosCndCd("00");
        dataModel.setDe032AcqCd("970428");
        dataModel.setDe035Trk2Dat("");
        dataModel.setDe036Trk3Dat("");
        dataModel.setDe037RelRefNo(gmt7TimeString + dataModel.getDe011TraceNo());
        dataModel.setDe038AuthIdRes("");
        dataModel.setDe039ResCd("");
        dataModel.setDe041CrdAcptTrm("1032DAB1");
        dataModel.setDe042CrdAcptId("000000000000001");
        dataModel.setDe043CrdAcptLoc("DONG A   Bank          Hanoi         704");
        dataModel.setDe045Trk1Dat("");
        //
        dataModel.setDe048AddPrvInf("INBOUND|TIMO");
        dataModel.setDe049TrnCcy("704");
        dataModel.setDe050StlCcy("");
        dataModel.setDe051BIlCcy("");
        dataModel.setDe052Pin("");
        dataModel.setDe053SecuInform("");
        dataModel.setDe054AddAmt("");
        dataModel.setDe055EmvDat("");
        dataModel.setDe060CnlTp("04");
        //
        dataModel.setDe062NapSvcCd("IF_INQ");
        dataModel.setDe063TrnRefNo(refNo + ldtDateAndTimeString);
        dataModel.setDe070NetMgtCd("");
        dataModel.setDe090OrgTrnKey("");

        //
        if(dataModel.getDe003ProcCd().substring(4).equals("20")) dataModel.setDe100BenCd(("9704XX"));
        dataModel.setDe102SndAccInf("1500027012");
        dataModel.setDe103RcvAccInf("0720036366");
        dataModel.setDe104TrnCont("hanoi1");
        dataModel.setDe105NewPin("");
        dataModel.setDe120BenInf("");
        dataModel.setDe128MacDat("0123456789012345");

        System.out.println(JsonWriter.formatJson(JsonUtil.parseObjectToStringJson(dataModel)));
        msgInb0200 = DataMsgUtil.buildDataMsg(dataModel);
        return  msgInb0200;
    }

//    public static void main(String[] args) {
//        try{
//            System.out.println(buildInbound0200().replace((char) 13, '|'));
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
}
