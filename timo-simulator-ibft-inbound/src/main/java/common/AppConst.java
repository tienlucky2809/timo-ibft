package common;


import java.util.Arrays;
import java.util.List;

public class AppConst {
    public static final String BANK_CODE = "KEBHANA";
    public static final String BRANCH_CODE = "HN";

    public static final String SESSION_PATTERN = "yyyyMMdd";

    public static final String IBFT_AMOUNT_LIMIT = "500000000";
    public static final String BVB_BANKCODE = "970454";
    public static final String IBFT_MTI_REQ = "0200";
    public static final String IBFT_MTI_RESP = "0210";
    public static final String NW_MTI_REQ = "0800";
    public static final String NW_MTI_RESP = "0810";
    public static final String DE007_PATTERN = "MMddHHmmss";
    public static final String ECOM_REVERSAL_MTI_REQ = "0420";
    public static final String ECOM_REVERSAL_MTI_RESP = "0430";

    public static final String TRN_STS_PND = "PND";
    public static final String TRN_STS_INIT = "INT";
    public static final String TRN_STS_ERR = "ERR";
    public static final String TRN_STS_NOR = "NOR";
    public static final String TRN_STS_RVS = "RVS";

    public static final String RECEIVE_MSG = "r";
    public static final String SEND_MSG = "s";

    public static final String OUTBOUND_TRN = "o";
    public static final String INBOUND_TRN = "i";

    public static final String NH_BRANCH = "5902";

    public static final String SYS_ERR_E00 = "E00"; // Normal

    public static final String SYS_ERR_E13 = "E13"; // Invalid amount
    public static final String SYS_ERR_E14 = "E14"; // Invalid Card number

    public static final String RPC_00 = "00"; // Normal/Success

    public static final String MSG_OUTBOUND_REQ = "CORE send message to NAPAS";

    public static final String DIR_CORE = "CORE";
    public static final String DIR_NAPAS = "NAPAS";

    public static final String SERVICE_IBFT = "IBFT";
    public static final String SERVICE_SWC = "SWC";

    public static final String TRN_TYPE_INQ = "I";
    public static final String TRN_TYPE_DEP = "D";

    public static final String ROLE_ACQ = "ACQ";
    public static final String ROLE_ISS = "ISS";
    public static final String ROLE_BNB = "BNB";

    public static final String DB_INSERT_SUCCESS = "00";
    public static final String DB_INSERT_ERROR = "11";
    public static final String DB_INSERT_DUPLICATE = "12";

    public static final String BIT_ON = "1";
    public static final String BIT_OFF = "0";

    public static final int SQL_ERROR_DUPLICATE = 1062;

    public static final List<String> TRN_TYPE_IF_INQ = Arrays.asList("IF_INQ", "TF_INQ", "CF_INQ");
    public static final List<String> TRN_TYPE_IF_DEP = Arrays.asList("IF_DEP", "TF_DEP", "CF_DEP");

    public static final String ENVIROMENT_TEST = "TEST";
    public static final String ENVIROMENT_LIVE = "LIVE";

    public static final String LENGTH_LLLL = "LLLL";
    public static final String LENGTH_LLL = "LLL";
    public static final String LENGTH_LL = "LL";

    public static final String INSERT_TYPE = "INSERT";
    // ---------------------------------------------------------------
    // RECON
    // ---------------------------------------------------------------
    // MD5
    //public static final String MD5_SECURITY_CODE = "970457";

    // NAPAS FIELD TYPE
    public static final String FIELD_CHAR = "CHAR";
    public static final String FIELD_NUM = "NUM";

    public static final String IDENTIFY_REGEX = "[]";
    public static final String CSR_REGEX = "\\[CSR\\]";
    public static final String CSR_NAME = "[CSR]";
    public static final String CSF_REGEX = "\\[CSF\\]";
    public static final String CSF_NAME = "[CSF]";
    public static final String TRN_DT_REGEX = "\\[DATE\\]";
    public static final String CORE_REGEX = "\\|";

    public static final String HEADER_RECORD = "HR";
    public static final String DETAIL_RECORD = "DR";
    public static final String TRAILER_RECORD = "TR";

    public static final String FILE_DAT = ".dat";
    public static final String FILE_PGP = ".pgp";
    public static final String FILE_PDF = ".pdf";

    public static final String RECON_TYPE_TC = "TC";
    public static final String RECON_TYPE_SL = "SL";
    public static final String RECON_TYPE_XL = "XL";

    // HEADER
    public static final String NAPAS_REV = "REV";
    public static final String NAPAS_DATE = "DATE";
    // DETAIL
    public static final String NAPAS_MTI = "MTI";
    public static final String NAPAS_F2 = "F2";
    public static final String NAPAS_F3 = "F3";
    public static final String NAPAS_SVC = "SVC";
    public static final String NAPAS_TCC = "TCC";
    public static final String NAPAS_F4 = "F4";
    public static final String NAPAS_RTA = "RTA";
    public static final String NAPAS_F49 = "F49";
    public static final String NAPAS_F5 = "F5";
    public static final String NAPAS_F50 = "F50";
    public static final String NAPAS_F9 = "F9";
    public static final String NAPAS_F6 = "F6";
    public static final String NAPAS_RCA = "RCA";
    public static final String NAPAS_F51 = "F51";
    public static final String NAPAS_F10 = "F10";
    public static final String NAPAS_F11 = "F11";
    public static final String NAPAS_F12 = "F12";
    public static final String NAPAS_F13 = "F13";
    public static final String NAPAS_F15 = "F15";
    public static final String NAPAS_F18 = "F18";
    public static final String NAPAS_F22 = "F22";
    public static final String NAPAS_F25 = "F25";
    public static final String NAPAS_F41 = "F41";
    public static final String NAPAS_ACQ = "ACQ";
    public static final String NAPAS_ISS = "ISS";
    public static final String NAPAS_MID = "MID";
    public static final String NAPAS_BNB = "BNB";
    public static final String NAPAS_F102 = "F102";
    public static final String NAPAS_F103 = "F103";
    public static final String NAPAS_SVFISSNP = "SVFISSNP";
    public static final String NAPAS_IRFISSACQ = "IRFISSACQ";
    public static final String NAPAS_IRFISSBNB = "IRFISSBNB";
    public static final String NAPAS_SVFACQNP = "SVFACQNP";
    public static final String NAPAS_IRFACQISS = "IRFACQISS";
    public static final String NAPAS_IRFACQBNB = "IRFACQBNB";
    public static final String NAPAS_SVFBNBNP = "SVFBNBNP";
    public static final String NAPAS_IRFBNBISS = "IRFBNBISS";
    public static final String NAPAS_IRFBNBACQ = "IRFBNBACQ";
    public static final String NAPAS_F37 = "F37";
    public static final String NAPAS_F38 = "F38";
    public static final String NAPAS_TRN = "TRN";
    public static final String NAPAS_RRC = "RRC";
    public static final String NAPAS_RSV1 = "RSV1";
    public static final String NAPAS_RSV2 = "RSV2";
    public static final String NAPAS_RSV3 = "RSV3";
    public static final String NAPAS_CSR = "CSR";
    public static final String NAPAS_TRN_STS = "TRN_STS";
    public static final String NAPAS_NEW_STS = "NEW_STS";

    // TRAILER
    public static final String NAPAS_NOT = "NOT";
    public static final String NAPAS_CRE = "CRE";
    public static final String NAPAS_TIME = "TIME";
    public static final String NAPAS_CSF = "CSF";

    public static class TranStep {
        public static final String CORE_IBFT_SUCCESS = "00";
        public static final String CORE_IBFT_FAIL = "01";
        public static final String IBFT_NAPAS_SUCCESS = "10";
        public static final String IBFT_NAPAS_FAIL = "11";
        public static final String NAPAS_IBFT_SUCCESS = "20";
        public static final String NAPAS_IBFT_FAIL = "21";
        public static final String IBFT_CORE_SUCCESS = "30";
        public static final String IBFT_CORE_FAIL = "31";
    }

    public static class CreatedBy {
        public static final String NAPAS = "NAPAS";
        public static final String CORE_BANK = "CORE_BANK";
        public static final String SYSTEM = "SYSTEM";
    }

    public static class StepStatus {
        public static final String SUCCESS = "00";
        public static final String SENT = "01";
        public static final String TIME_OUT = "68";
    }

    public static class TransInOut {
        public static final String IN = "IN";
        public static final String OUT = "OUT";
    }

    public static class TransCate {
        public static final String IF_INQ = "IF_INQ";
        public static final String IF_DEP = "IF_DEP";
    }

    public static class ActivityStep {
        public static final String RECV_FROM_CORE = "RECV_FROM_CORE";
        public static final String RECV_FROM_NAPAS = "RECV_FROM_NAPAS";
        public static final String SEND_TO_CORE = "SEND_TO_CORE";
        public static final String SEND_TO_NAPAS = "SEND_TO_NAPAS";
        public static final String VALIDATE = "VALIDATE";
        public static final String AUTO_RESPONSE = "AUTO_RESPONSE";
        public static final String SYSTEM = "SYSTEM";
    }

    public static class ActivityStepStatus {
        public static final String INIT = "";
        public static final String SUCCESS = "00";
        public static final String ERROR = "01";
        public static final String TIMEOUT = "68";
    }

    public static class MsgType {
        public static final String REQ = "REQ";
        public static final String RESP = "RES";
    }

    public static class HTTPConfig {
        public static final String GET_METHOD = "GET";
        public static final String POST_METHOD = "POST";
        public static final String PUT_METHOD = "PUT";

        public static final String HTTP_STATUS_200 = "200";
        public static final String HTTP_STATUS_404 = "404";
        public static final String HTTP_STATUS_5XX = "5xx";
    }

    public static class SwcATMFunction {
        public static final String INQUIRY_BALANCE = "inquiry_balance";
        public static final String WITHDRAW_MONEY = "withdraw_money";
        public static final String MINI_STATEMENT = "mini_statement";
        public static final String ITFT_INQUIRY = "itft_inquiry";
        public static final String ITFT_DEP = "itft_dep";
        public static final String CHANGE_PIN = "change_pin";
        public static final String PURCHASE = "purchase";
        public static final String REVERT = "revert";
        public static final String KEY_EXCHANGE = "key_exchange";
    }

    public static class SwcDeProcCd {
        public static final String INQUIRY_BALANCE = "30";
        public static final String WITHDRAW_MONEY = "01";
        public static final String MINI_STATEMENT = "35";
        public static final String ITFT_INQUIRY = "39";
        public static final String ITFT_DEP = "40";
        public static final String CHANGE_PIN = "94";
        public static final String PURCHASE = "00";
        //public static final String REVERT = "revert";
        //public static final String KEY_EXCHANGE = "key_exchange";
    }

    public static class EcomDeProcCd {
        public static final String PURCHASE = "00";
        public static final String VERIFY = "05";
    }

    public static class EcomServiceCode {
        public static final String CARD_VERIFY = "EC_CARDVER";
        public static final String OTP_VERIFY = "EC_OTPVER";
        public static final String PURCHASE = "EC_PUR";
    }

    public static class EcomFunction {
        public static final String VERIFY = "verify";
        public static final String VERIFY_OTP = "verify_otp";
        public static final String VERIFY_CARD = "verify_card";
        public static final String PURCHASE = "purchase";
        public static final String REVERT = "revert";
    }

    public static class KeyType {
        private KeyType() {
        }

        public static final String LMK = "LMK";
        public static final String ZMK = "ZMK";
        public static final String ZPK = "ZPK";
        public static final String MAK = "MAK";
    }

    public static class KeyLength {
        private KeyLength() {
        }

        public static final String SINGLE_LENGTH = "16H";
        public static final String DOUBLE_LENGTH = "32H";
    }

    public static class NetworkMngCode {
        private NetworkMngCode() {
        }

        public static final String SIGN_ON = "001";
        public static final String SIGN_OFF = "002";
        public static final String ECHO_TEST = "301";
        public static final String KEY_EX = "161";

    }

    public static class SignType {
        private SignType() {
        }

        public static final String SIGN_ON = "SIGN_ON";
        public static final String SIGN_OFF = "SIGN_OFF";
    }

    public static class KebHanaBin {
        private KebHanaBin() {
        }

        public static final String HN_BIN = "970467";
        public static final String HCM_BIN = "970466";

    }

    public static class KebHanaBrCd {

        private KebHanaBrCd() {
        }

        public static final String HN_BRCD = "1032";
        public static final String HCM_BRCD = "0087";

        public static final String HN_BRCD_URL = "?BR_CD=1032";
        public static final String HCM_BRCD_URL = "?BR_CD=0087";
    }

    public static class De022ModePre {
        private De022ModePre() {
        }

        public static final String VL00 = "00";
        public static final String VL01 = "01";
        public static final String VL03 = "03";
        public static final String VL04 = "04";
        public static final String VL05 = "05"; //get PAN in Chip card
        public static final String VL07 = "07"; //get PAN in Chip card Contactless.
        public static final String VL08 = "08";
        public static final String VL81 = "81";
        public static final String VL91 = "91";
    }

    public static class De022ModeSuf {
        public static final String VL0 = "0";
        public static final String VL1 = "1";
        public static final String VL2 = "2";
        public static final String VL3 = "3";
        public static final String VL4 = "4";
        public static final String VL5 = "5";
        public static final String VL6 = "6";
        public static final String VL7 = "7";
        public static final String VL8 = "8";
        public static final String VL9 = "9";
    }

    public static class De018Pre {
        public static final String VL4 = "4";
        public static final String VL5 = "5";
    }

    public static final String de022_070 = "070";
    public static final String de022_071 = "071";
    public static final String de022_072 = "072";
    public static final String de022_079 = "079";
}
