package com.korail.talk.network;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseDao extends ExecuteDao implements IBaseDao {
    private BaseRequest mBaseRequest;
    private BaseResponse mBaseResponse;
    private IBase mIBase;
    private IBaseResult mIBaseResult;
    private boolean mIsNotShowDialog;
    private boolean mIsViewFinish;
    private boolean mIsCancelable = true;
    private String mMacroErrorMsg = "";
    NetfunnelDao mNetfunnelDao = null;
    private final List<String> mErrorMsgCdList = new ArrayList();

    @Override // com.korail.talk.network.IBaseDao
    public IBase getBase() {
        return this.mIBase;
    }

    @Override // com.korail.talk.network.IBaseDao
    public List<String> getErrorMsgCdNotShowDialog() {
        return this.mErrorMsgCdList;
    }

    @Override // com.korail.talk.network.IBaseDao
    public IBaseResult getINetworkResult() {
        return this.mIBaseResult;
    }

    @Override // com.korail.talk.network.IBaseDao
    public String getMacroShowDialog() {
        return this.mMacroErrorMsg;
    }

    @Override // com.korail.talk.network.IBaseDao
    public NetfunnelDao getNetfunnelDao() {
        return this.mNetfunnelDao;
    }

    @Override // com.korail.talk.network.IBaseDao
    public <T extends BaseRequest> T getRequest() {
        return (T) this.mBaseRequest;
    }

    @Override // com.korail.talk.network.IBaseDao
    public <T extends BaseResponse> T getResponse() {
        return (T) this.mBaseResponse;
    }

    @Override // com.korail.talk.network.IBaseDao
    public boolean isFinishView() {
        return this.mIsViewFinish;
    }

    @Override // com.korail.talk.network.IBaseDao
    public boolean isLoadingCancelable() {
        return this.mIsCancelable;
    }

    @Override // com.korail.talk.network.IBaseDao
    public boolean isNotShowDialog() {
        return this.mIsNotShowDialog;
    }

    @Override // com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return true;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setBase(IBase iBase) {
        this.mIBase = iBase;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setErrorMsgCdNotShowDialog(String str) {
        this.mErrorMsgCdList.add(str);
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setFinishView(boolean z8) {
        this.mIsViewFinish = z8;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setINetworkResult(IBaseResult iBaseResult) {
        this.mIBaseResult = iBaseResult;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setLoadingCancelable(boolean z8) {
        this.mIsCancelable = z8;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setMacroShowDialog(String str) {
        this.mMacroErrorMsg = str;
    }

    public void setNetfunnelDao(NetfunnelDao netfunnelDao) {
        this.mNetfunnelDao = netfunnelDao;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setNotShowDialog(boolean z8) {
        this.mIsNotShowDialog = z8;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setRequest(BaseRequest baseRequest) {
        this.mBaseRequest = baseRequest;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setResponse(BaseResponse baseResponse) {
        this.mBaseResponse = baseResponse;
    }

    @Override // com.korail.talk.network.IBaseDao
    public void setErrorMsgCdNotShowDialog(List<String> list) {
        this.mErrorMsgCdList.addAll(list);
    }
}
