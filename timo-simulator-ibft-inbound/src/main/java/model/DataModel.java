package model;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DataModel {

    @JsonProperty("MTI")
    private String mti;

    @JsonProperty("FST_BITMAP")
    private String fstBitMap;

    @JsonProperty("DE001_SND_BITMAP")
    private String de001SndBitMap;

    @JsonProperty("DE002_PAN")
    private String de002Pan;

    @JsonProperty("DE003_PROC_CD")
    private String de003ProcCd;

    @JsonProperty("DE004_TRN_AMT")
    private String de004TrnAmt;

    @JsonProperty("DE005_STL_AMT")
    private String de005StlAmt;

    @JsonProperty("DE006_BIL_AMT")
    private String de006BilAmt;

    @JsonProperty("DE007_TRN_DT")
    private String de007TrnDt;

    @JsonProperty("DE009_STL_CONV_RT")
    private String de009StlConvRt;

    @JsonProperty("DE010_BIL_CONV_RT")
    private String de010BilConvRt;

    @JsonProperty("DE011_TRACE_NO")
    private String de011TraceNo;

    @JsonProperty("DE012_LOC_TRN_TIME")
    private String de012LocTrnTime;

    @JsonProperty("DE013_LOC_TRN_DATE")
    private String de013LocTrnDate;

    @JsonProperty("DE014_EXP_DATE")
    private String de014ExpDate;

    @JsonProperty("DE015_STL_DATE")
    private String de015StlDate;

    @JsonProperty("DE018_MER_CAT_CD")
    private String de018MerCatCd;

    @JsonProperty("DE019_ACQ_CTRY_CD")
    private String de019AcqCtryCd;

    @JsonProperty("DE022_POS_MODE")
    private String de022PosMode;

    @JsonProperty("DE023_CRD_SEQ_NO")
    private String de023CrdSeqNo;

    @JsonProperty("DE025_POS_COND_CD")
    private String de025PosCndCd;

    @JsonProperty("DE026_PIN_CAP_CD")
    private String de026PinCapCd;

    @JsonProperty("DE032_ACQ_CD")
    private String de032AcqCd;

    @JsonProperty("DE035_TRK2_DAT")
    private String de035Trk2Dat;

    @JsonProperty("DE036_TRK3_DAT")
    private String de036Trk3Dat;

    @JsonProperty("DE037_REL_REF_NO")
    private String de037RelRefNo;

    @JsonProperty("DE038_AUTH_ID_RES")
    private String de038AuthIdRes;

    @JsonProperty("DE039_RES_CD")
    private String de039ResCd;

    @JsonProperty("DE041_CRD_ACPT_TRM")
    private String de041CrdAcptTrm;

    @JsonProperty("DE042_CRD_ACPT_ID")
    private String de042CrdAcptId;

    @JsonProperty("DE043_CRD_ACPT_LOC")
    private String de043CrdAcptLoc;

    @JsonProperty("DE045_TRK1_DAT")
    private String de045Trk1Dat;

    @JsonProperty("DE048_ADD_PRV_INF")
    private String de048AddPrvInf;

    @JsonProperty("DE049_TRN_CCY")
    private String de049TrnCcy;

    @JsonProperty("DE050_STL_CCY")
    private String de050StlCcy;

    @JsonProperty("DE051_BIL_CCY")
    private String de051BIlCcy;

    @JsonProperty("DE052_PIN")
    private String de052Pin;

    @JsonProperty("DE053_SECU_INFORM")
    private String de053SecuInform;

    @JsonProperty("DE054_ADD_AMT")
    private String de054AddAmt;

    @JsonProperty("DE055_EMV_DAT")
    private String de055EmvDat;

    @JsonProperty("DE060_CNL_TP")
    private String de060CnlTp;

    @JsonProperty("DE062_NAP_SVC_CD")
    private String de062NapSvcCd;

    @JsonProperty("DE063_TRN_REF_NO")
    private String de063TrnRefNo;

    @JsonProperty("DE070_NET_MGT_CD")
    private String de070NetMgtCd;

    @JsonProperty("DE090_ORG_TRN_KEY")
    private String de090OrgTrnKey;

    @JsonProperty("DE100_BEN_CD")
    private String de100BenCd;

    @JsonProperty("DE102_SND_ACC_INF")
    private String de102SndAccInf;

    @JsonProperty("DE103_RCV_ACC_INF")
    private String de103RcvAccInf;

    @JsonProperty("DE104_TRN_CONT")
    private String de104TrnCont;

    @JsonProperty("DE105_NEW_PIN")
    private String de105NewPin;

    @JsonProperty("DE120_BEN_INF")
    private String de120BenInf;

    @JsonProperty("DE128_MAC_DAT")
    private String de128MacDat;
}

