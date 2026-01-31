package androidx.webkit.internal;

import G0.j;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f11067a;

    public d0(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f11067a = webSettingsBoundaryInterface;
    }

    public int getAttributionRegistrationBehavior() {
        return this.f11067a.getAttributionBehavior();
    }

    public int getDisabledActionModeMenuItems() {
        return this.f11067a.getDisabledActionModeMenuItems();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.f11067a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.f11067a.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.f11067a.getForceDarkBehavior();
    }

    public boolean getOffscreenPreRaster() {
        return this.f11067a.getOffscreenPreRaster();
    }

    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return this.f11067a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.f11067a.getSafeBrowsingEnabled();
    }

    public G0.e getUserAgentMetadata() {
        return V.c(this.f11067a.getUserAgentMetadataMap());
    }

    public G0.j getWebViewMediaIntegrityApiStatus() {
        return new j.a(this.f11067a.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.f11067a.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.f11067a.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z8) {
        this.f11067a.setAlgorithmicDarkeningAllowed(z8);
    }

    public void setAttributionRegistrationBehavior(int i8) {
        this.f11067a.setAttributionBehavior(i8);
    }

    public void setDisabledActionModeMenuItems(int i8) {
        this.f11067a.setDisabledActionModeMenuItems(i8);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z8) {
        this.f11067a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z8);
    }

    public void setForceDark(int i8) {
        this.f11067a.setForceDark(i8);
    }

    public void setForceDarkStrategy(int i8) {
        this.f11067a.setForceDarkBehavior(i8);
    }

    public void setOffscreenPreRaster(boolean z8) {
        this.f11067a.setOffscreenPreRaster(z8);
    }

    public void setRequestedWithHeaderOriginAllowList(Set<String> set) {
        this.f11067a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void setSafeBrowsingEnabled(boolean z8) {
        this.f11067a.setSafeBrowsingEnabled(z8);
    }

    public void setUserAgentMetadata(G0.e eVar) {
        this.f11067a.setUserAgentMetadataFromMap(V.a(eVar));
    }

    public void setWebViewMediaIntegrityApiStatus(G0.j jVar) {
        this.f11067a.setWebViewMediaIntegrityApiStatus(jVar.getDefaultStatus(), jVar.getOverrideRules());
    }
}
