package com.korail.talk.network;

import java.util.List;

/* loaded from: classes.dex */
public interface IBaseDao {
    BaseResponse executeDao();

    IBase getBase();

    List<String> getErrorMsgCdNotShowDialog();

    IBaseResult getINetworkResult();

    int getId();

    String getMacroShowDialog();

    NetfunnelDao getNetfunnelDao();

    <T extends BaseRequest> T getRequest();

    <T extends BaseResponse> T getResponse();

    boolean isFinishView();

    boolean isLoadingCancelable();

    boolean isNotShowDialog();

    boolean isPending();

    void setBase(IBase iBase);

    void setErrorMsgCdNotShowDialog(String str);

    void setErrorMsgCdNotShowDialog(List<String> list);

    void setFinishView(boolean z8);

    void setINetworkResult(IBaseResult iBaseResult);

    void setLoadingCancelable(boolean z8);

    void setMacroShowDialog(String str);

    void setNotShowDialog(boolean z8);

    void setRequest(BaseRequest baseRequest);

    void setResponse(BaseResponse baseResponse);
}
