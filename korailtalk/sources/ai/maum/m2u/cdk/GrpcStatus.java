package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.utils.LogUtil;
import io.grpc.J0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class GrpcStatus {
    private int errorCode;
    private byte[] errorDetail;
    private String errorMessage;
    private Object errorObject;

    public GrpcStatus() {
        this.errorCode = 0;
        this.errorMessage = null;
        this.errorDetail = null;
        this.errorObject = null;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public byte[] getErrorDetail() {
        return this.errorDetail;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Object getErrorObject() {
        return this.errorObject;
    }

    public GrpcStatus(J0 j02) throws Throwable {
        this.errorCode = j02.getCode().value();
        if (j02.getCause() != null) {
            this.errorMessage = j02.getCause().getMessage();
        } else {
            this.errorMessage = j02.getDescription();
        }
        Throwable cause = j02.getCause();
        if (cause != null) {
            StringWriter stringWriter = new StringWriter();
            cause.printStackTrace(new PrintWriter(stringWriter));
            LogUtil.e("GrpcStatus", stringWriter.toString());
        } else {
            this.errorDetail = this.errorMessage.getBytes();
        }
        this.errorObject = null;
    }
}
