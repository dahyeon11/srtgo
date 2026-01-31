package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.grpclib.constants.Const;
import ai.maum.m2u.cdk.utils.LogUtil;
import com.google.protobuf.C5230m0;
import maum.m2u.common.DeviceOuterClass;

/* loaded from: classes.dex */
public class MapSettings {
    private static String TAG = "MapSettings";
    private String authToken;
    public DeviceOuterClass.Device.Builder deviceBuilder;
    private String notifyObjectPrefix;
    private int pingInterval;
    private String serverIp;
    private int serverPort;
    private boolean useLog;
    private boolean useTls;

    public MapSettings() {
        String str = Const.EMPTY_STRING;
        this.serverIp = str;
        this.serverPort = 0;
        this.useTls = false;
        this.useLog = true;
        this.notifyObjectPrefix = str;
        this.pingInterval = 60;
        this.authToken = "";
        this.deviceBuilder = DeviceOuterClass.Device.newBuilder();
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public DeviceOuterClass.Device getDevice() {
        return this.deviceBuilder.build();
    }

    public String getNotifyObjectPrefix() {
        return this.notifyObjectPrefix;
    }

    public int getPingInterval() {
        return this.pingInterval;
    }

    public String getServerIp() {
        return this.serverIp;
    }

    public int getServerPort() {
        return this.serverPort;
    }

    public boolean isUseLog() {
        return this.useLog;
    }

    public boolean isUseTls() {
        return this.useTls;
    }

    public void setAuthToken(String str) {
        this.authToken = str;
    }

    public void setDevice(DeviceOuterClass.Device device) {
        this.deviceBuilder.clear().mergeFrom(device);
        LogUtil.i(TAG, "replace builder with prev object: " + this.deviceBuilder.toString());
    }

    public void setNotifyObjectPrefix(String str) {
        this.notifyObjectPrefix = str;
    }

    public void setPingInterval(int i8) {
        this.pingInterval = i8;
    }

    public void setServerIp(String str) {
        this.serverIp = str;
    }

    public void setServerPort(int i8) {
        this.serverPort = i8;
    }

    public void setUseLog(boolean z8) {
        this.useLog = z8;
    }

    public void setUseTls(boolean z8) {
        this.useTls = z8;
    }

    public void setDevice(String str) throws C5230m0 {
        DeviceOuterClass.Device.Builder builderNewBuilder = DeviceOuterClass.Device.newBuilder();
        E3.d.parser().merge(str, builderNewBuilder);
        this.deviceBuilder = builderNewBuilder;
        LogUtil.i(TAG, "replace builder with new json: " + str);
        LogUtil.i(TAG, "replace builder with new json, result: " + this.deviceBuilder.toString());
    }
}
