package A6;

import a4.AbstractC0834a;
import com.google.firebase.iid.w;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public enum a {
    None(0),
    Quitend(100),
    Quit(101),
    Wait(102),
    SystemBusy(104),
    NetworkBusy(105),
    DataFound(106),
    AlreadyData(107),
    DataNotFound(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR),
    Running(110),
    Stopping(111),
    Stop(112),
    Braek(113),
    Success(200),
    Continue(201),
    ContinueDebug(202),
    TsBypass(300),
    TsBlock(Map.MapException.StatusCode.AUTH_IS_VAILD_FAILED_VALUE),
    TsIpBlock(Map.MapException.StatusCode.AUTH_INVALID_AUTH_TOKEN_VALUE),
    TsExpressNumber(Map.MapException.StatusCode.AUTH_FAILED_VALUE),
    TsErrorNoUservice(w.ERROR_UNKNOWN),
    TsErrorNoAction(Map.MapException.StatusCode.GRPC_STT_ERROR_VALUE),
    TsErrorAComplete(Map.MapException.StatusCode.GRPC_IDR_ERROR_VALUE),
    TsErrorWrongServer(Map.MapException.StatusCode.GRPC_TTS_ERROR_VALUE),
    TsErrorTooRecreate(Map.MapException.StatusCode.GRPC_AUTH_SIGN_IN_ERROR_VALUE),
    TsErrorNoKey(Map.MapException.StatusCode.GRPC_AUTH_SIGN_OUT_ERROR_VALUE),
    TsErrorInvalidID(Map.MapException.StatusCode.GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR_VALUE),
    TsErrorInvalidKey(Map.MapException.StatusCode.GRPC_AUTH_IS_VALID_ERROR_VALUE),
    TsErrorInvalidIdStr(Map.MapException.StatusCode.GRPC_AUTH_GET_USER_INFO_ERROR_VALUE),
    TsErrorDuplicate(Map.MapException.StatusCode.GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR_VALUE),
    TsErrorDelAction(Map.MapException.StatusCode.GRPC_AUTH_GET_USER_SETTINGS_ERROR_VALUE),
    TsErrorUserviceExist(Map.MapException.StatusCode.GRPC_ROUTER_OPEN_ERROR_VALUE),
    TsErrorActionExist(512),
    TsErrorLicenseOver(Map.MapException.StatusCode.GRPC_ROUTER_EVENT_ERROR_VALUE),
    TsErrorSize(Map.MapException.StatusCode.GRPC_ROUTER_CLOSE_ERROR_VALUE),
    TsErrorNoUserAction(Map.MapException.StatusCode.GRPC_ROUTER_FEEDBACK_ERROR_VALUE),
    ErrorAuth(900),
    ErrorNotFound(901),
    ErrorNoinit(902),
    ErrorCode(903),
    ErrorParam(904),
    ErrorData(905),
    ErrorUnknownType(906),
    ErrorAlready(907),
    ErrorService(908),
    ErrorExecution(909),
    ErrorSock(920),
    ErrorSockSend(921),
    ErrorSockRecv(922),
    ErrorNotFoundLocalIP(925),
    ErrorSockConnect(926),
    ErrorNoConnect(927),
    ErrorSockData(AbstractC0834a.MAX_CODEWORDS_IN_BARCODE),
    ErrorIO(991),
    ErrorArunning(992),
    ErrorPermission(993),
    ErrorExpiredTime(994),
    ErrorOverCounter(995),
    ErrorSecurity(996),
    ErrorSystemStopping(997),
    ErrorNotSupport(998),
    ErrorSystem(999);


    /* renamed from: a, reason: collision with root package name */
    private int f77a;

    a(int i8) {
        this.f77a = i8;
    }

    public static a toEnum(int i8) {
        a[] aVarArrValues = values();
        for (int i9 = 0; i9 < aVarArrValues.length; i9++) {
            if (aVarArrValues[i9].value() == i8) {
                return aVarArrValues[i9];
            }
        }
        return None;
    }

    public int value() {
        return this.f77a;
    }

    public static a toEnum(String str) {
        try {
            return toEnum(Integer.parseInt(str));
        } catch (Exception unused) {
            return ErrorData;
        }
    }
}
