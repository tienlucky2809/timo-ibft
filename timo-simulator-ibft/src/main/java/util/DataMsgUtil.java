package util;


import com.cedarsoftware.util.io.JsonWriter;
import model.DataModel;
import org.apache.commons.lang3.StringUtils;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class DataMsgUtil {

    private static final String PATH_FIELDS = "D:\\timo\\code\\timo-simulator-ibft-inbound\\src\\main\\resources\\fields.xml";
//        private static final String PATH_FIELDS = "/tiendg/fields.xml";

    public static String buildDataMsg(DataModel dataModel) throws Exception {
        System.out.println("source fields : " + PATH_FIELDS);
        try {
            // Load package from resources directory.
            GenericPackager packager = new   GenericPackager(PATH_FIELDS);
            ISOMsg isoMsg = new ISOMsg();
            isoMsg.setPackager(packager);

            if (!StringUtils.isBlank(dataModel.getMti())) isoMsg.set(0, dataModel.getMti());
            if (!StringUtils.isBlank(dataModel.getDe002Pan())) isoMsg.set(2, dataModel.getDe002Pan());
            if (!StringUtils.isBlank(dataModel.getDe003ProcCd())) isoMsg.set(3, dataModel.getDe003ProcCd());
            if (!StringUtils.isBlank(dataModel.getDe004TrnAmt())) isoMsg.set(4, dataModel.getDe004TrnAmt());
            if (!StringUtils.isBlank(dataModel.getDe005StlAmt())) isoMsg.set(5, dataModel.getDe005StlAmt());
            if (!StringUtils.isBlank(dataModel.getDe006BilAmt())) isoMsg.set(6, dataModel.getDe006BilAmt());
            if (!StringUtils.isBlank(dataModel.getDe007TrnDt())) isoMsg.set(7, dataModel.getDe007TrnDt());
            if (!StringUtils.isBlank(dataModel.getDe009StlConvRt())) isoMsg.set(9, dataModel.getDe009StlConvRt());
            if (!StringUtils.isBlank(dataModel.getDe010BilConvRt())) isoMsg.set(10, dataModel.getDe010BilConvRt());
            if (!StringUtils.isBlank(dataModel.getDe011TraceNo())) isoMsg.set(11, dataModel.getDe011TraceNo());
            if (!StringUtils.isBlank(dataModel.getDe012LocTrnTime())) isoMsg.set(12, dataModel.getDe012LocTrnTime());
            if (!StringUtils.isBlank(dataModel.getDe013LocTrnDate())) isoMsg.set(13, dataModel.getDe013LocTrnDate());
            if (!StringUtils.isBlank(dataModel.getDe014ExpDate())) isoMsg.set(14, dataModel.getDe014ExpDate());
            if (!StringUtils.isBlank(dataModel.getDe015StlDate())) isoMsg.set(15, dataModel.getDe015StlDate());
            if (!StringUtils.isBlank(dataModel.getDe018MerCatCd())) isoMsg.set(18, dataModel.getDe018MerCatCd());
            if (!StringUtils.isBlank(dataModel.getDe019AcqCtryCd())) isoMsg.set(19, dataModel.getDe019AcqCtryCd());
            if (!StringUtils.isBlank(dataModel.getDe022PosMode())) isoMsg.set(22, dataModel.getDe022PosMode());
            if (!StringUtils.isBlank(dataModel.getDe023CrdSeqNo())) isoMsg.set(23, dataModel.getDe023CrdSeqNo());
            if (!StringUtils.isBlank(dataModel.getDe025PosCndCd())) isoMsg.set(25, dataModel.getDe025PosCndCd());
            if (!StringUtils.isBlank(dataModel.getDe026PinCapCd())) isoMsg.set(26, dataModel.getDe026PinCapCd());
            if (!StringUtils.isBlank(dataModel.getDe032AcqCd())) isoMsg.set(32, dataModel.getDe032AcqCd());
            if (!StringUtils.isBlank(dataModel.getDe035Trk2Dat())) isoMsg.set(35, dataModel.getDe035Trk2Dat());
            if (!StringUtils.isBlank(dataModel.getDe036Trk3Dat())) isoMsg.set(36, dataModel.getDe036Trk3Dat());
            if (!StringUtils.isBlank(dataModel.getDe037RelRefNo())) isoMsg.set(37, dataModel.getDe037RelRefNo());
            if (!StringUtils.isBlank(dataModel.getDe038AuthIdRes())) isoMsg.set(38, dataModel.getDe038AuthIdRes());
            if (!StringUtils.isBlank(dataModel.getDe039ResCd())) isoMsg.set(39, dataModel.getDe039ResCd());
            if (!StringUtils.isBlank(dataModel.getDe041CrdAcptTrm())) isoMsg.set(41, dataModel.getDe041CrdAcptTrm());
            if (!StringUtils.isBlank(dataModel.getDe042CrdAcptId())) isoMsg.set(42, dataModel.getDe042CrdAcptId());
            if (!StringUtils.isBlank(dataModel.getDe043CrdAcptLoc())) isoMsg.set(43, dataModel.getDe043CrdAcptLoc());
            if (!StringUtils.isBlank(dataModel.getDe045Trk1Dat())) isoMsg.set(45, dataModel.getDe045Trk1Dat());
            if (!StringUtils.isBlank(dataModel.getDe048AddPrvInf())) {
                String strTmp = dataModel.getDe048AddPrvInf().replace('|', (char) 13);
//                isoMsg.set(48, dataModel.getDe048AddPrvInf());
                isoMsg.set(48,strTmp);
            }
            if (!StringUtils.isBlank(dataModel.getDe049TrnCcy())) isoMsg.set(49, dataModel.getDe049TrnCcy());
            if (!StringUtils.isBlank(dataModel.getDe050StlCcy())) isoMsg.set(50, dataModel.getDe050StlCcy());
            if (!StringUtils.isBlank(dataModel.getDe051BIlCcy())) isoMsg.set(51, dataModel.getDe051BIlCcy());
            if (!StringUtils.isBlank(dataModel.getDe052Pin())) isoMsg.set(52, dataModel.getDe052Pin());
            if (!StringUtils.isBlank(dataModel.getDe053SecuInform())) isoMsg.set(53, dataModel.getDe053SecuInform());
            if (!StringUtils.isBlank(dataModel.getDe054AddAmt())) isoMsg.set(54, dataModel.getDe054AddAmt());
            if (!StringUtils.isBlank(dataModel.getDe055EmvDat())) isoMsg.set(55, dataModel.getDe055EmvDat());
            if (!StringUtils.isBlank(dataModel.getDe060CnlTp())) isoMsg.set(60, dataModel.getDe060CnlTp());
            if (!StringUtils.isBlank(dataModel.getDe062NapSvcCd())) isoMsg.set(62, dataModel.getDe062NapSvcCd());
            if (!StringUtils.isBlank(dataModel.getDe063TrnRefNo())) isoMsg.set(63, dataModel.getDe063TrnRefNo());
            if (!StringUtils.isBlank(dataModel.getDe070NetMgtCd())) isoMsg.set(70, dataModel.getDe070NetMgtCd());
            if (!StringUtils.isBlank(dataModel.getDe090OrgTrnKey())) isoMsg.set(90, dataModel.getDe090OrgTrnKey());
            if (!StringUtils.isBlank(dataModel.getDe100BenCd())) isoMsg.set(100, dataModel.getDe100BenCd());
            if (!StringUtils.isBlank(dataModel.getDe102SndAccInf())) isoMsg.set(102, dataModel.getDe102SndAccInf());
            if (!StringUtils.isBlank(dataModel.getDe103RcvAccInf())) isoMsg.set(103, dataModel.getDe103RcvAccInf());
            if (!StringUtils.isBlank(dataModel.getDe104TrnCont())) isoMsg.set(104, dataModel.getDe104TrnCont());
            if (!StringUtils.isBlank(dataModel.getDe105NewPin())) isoMsg.set(105, dataModel.getDe105NewPin());
            if (!StringUtils.isBlank(dataModel.getDe120BenInf())) isoMsg.set(120, dataModel.getDe120BenInf());
            if (!StringUtils.isBlank(dataModel.getDe128MacDat())) isoMsg.set(128, dataModel.getDe128MacDat());

            byte[] result = isoMsg.pack();

            String dataMsg = new String(result);

            String header = StringUtils.leftPad(dataMsg.length() + "", 4, '0');

            return header + dataMsg;
        } catch (ISOException e) {
            e.printStackTrace();
            throw new Exception("Build data message Failed " + e);
        }

    }

    public static DataModel buildDataModel(String dataMsg) throws Exception {
        try {
            DataModel dataModel = new DataModel();
            dataMsg = dataMsg.substring(4);
            GenericPackager packager = new GenericPackager(PATH_FIELDS);
            ISOMsg isoMsg = new ISOMsg();
            isoMsg.setPackager(packager);
            isoMsg.unpack(dataMsg.getBytes(StandardCharsets.UTF_8));

            dataModel.setMti(isoMsg.getString(0));
            dataModel.setDe002Pan(isoMsg.getString(2));
            dataModel.setDe003ProcCd(isoMsg.getString(3));
            dataModel.setDe004TrnAmt(isoMsg.getString(4));
            dataModel.setDe005StlAmt(isoMsg.getString(5));
            dataModel.setDe006BilAmt(isoMsg.getString(6));
            dataModel.setDe007TrnDt(isoMsg.getString(7));
            dataModel.setDe009StlConvRt(isoMsg.getString(9));
            dataModel.setDe010BilConvRt(isoMsg.getString(10));
            dataModel.setDe011TraceNo(isoMsg.getString(11));
            dataModel.setDe012LocTrnTime(isoMsg.getString(12));
            dataModel.setDe013LocTrnDate(isoMsg.getString(13));
            dataModel.setDe014ExpDate(isoMsg.getString(14));
            dataModel.setDe015StlDate(isoMsg.getString(15));
            dataModel.setDe018MerCatCd(isoMsg.getString(18));
            dataModel.setDe019AcqCtryCd(isoMsg.getString(19));
            dataModel.setDe022PosMode(isoMsg.getString(22));
            dataModel.setDe023CrdSeqNo(isoMsg.getString(23));
            dataModel.setDe025PosCndCd(isoMsg.getString(25));
            dataModel.setDe026PinCapCd(isoMsg.getString(26));
            dataModel.setDe032AcqCd(isoMsg.getString(32));
            dataModel.setDe035Trk2Dat(isoMsg.getString(35));
            dataModel.setDe036Trk3Dat(isoMsg.getString(36));
            dataModel.setDe037RelRefNo(isoMsg.getString(37));
            dataModel.setDe038AuthIdRes(isoMsg.getString(38));
            dataModel.setDe039ResCd(isoMsg.getString(39));
            dataModel.setDe041CrdAcptTrm(isoMsg.getString(41));
            dataModel.setDe042CrdAcptId(isoMsg.getString(42));
            dataModel.setDe043CrdAcptLoc(isoMsg.getString(43));
            dataModel.setDe045Trk1Dat(isoMsg.getString(45));
//            dataModel.setDe048AddPrvInf(isoMsg.getString(48));
            if(!StringUtils.isBlank(isoMsg.getString(48))){
                dataModel.setDe048AddPrvInf(isoMsg.getString(48).replace((char)13, '|'));
            }
            dataModel.setDe049TrnCcy(isoMsg.getString(49));
            dataModel.setDe050StlCcy(isoMsg.getString(50));
            dataModel.setDe051BIlCcy(isoMsg.getString(51));
            dataModel.setDe052Pin(isoMsg.getString(52));
            dataModel.setDe053SecuInform(isoMsg.getString(53));
            dataModel.setDe054AddAmt(isoMsg.getString(54));
            dataModel.setDe055EmvDat(isoMsg.getString(55));
            dataModel.setDe060CnlTp(isoMsg.getString(60));
            dataModel.setDe062NapSvcCd(isoMsg.getString(62));
            dataModel.setDe063TrnRefNo(isoMsg.getString(63));
            dataModel.setDe070NetMgtCd(isoMsg.getString(70));
            dataModel.setDe090OrgTrnKey(isoMsg.getString(90));
            dataModel.setDe100BenCd(isoMsg.getString(100));
            dataModel.setDe102SndAccInf(isoMsg.getString(102));
            dataModel.setDe103RcvAccInf(isoMsg.getString(103));
            dataModel.setDe104TrnCont(isoMsg.getString(104));
            dataModel.setDe105NewPin(isoMsg.getString(105));
            dataModel.setDe120BenInf(isoMsg.getString(120));
            dataModel.setDe128MacDat(isoMsg.getString(128));
            return dataModel;

        } catch (ISOException e) {
            e.printStackTrace();
            throw new Exception("Build data model failed " + e);
        }
    }

//    public static void main(String[] args) throws Exception {
//        String dataMsg = "00630800822000010000000004000000000000000509073638035371069704XX301";
//        DataModel dataModel = DataMsgUtil.buildDataModel(dataMsg);
//        System.out.println(JsonWriter.objectToJson(dataModel));
//
//
//    }
}
