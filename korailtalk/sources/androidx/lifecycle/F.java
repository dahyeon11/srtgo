package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.K;
import java.io.IOException;
import java.lang.reflect.Constructor;
import k0.AbstractC5837a;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
public final class F extends K.d implements K.b {

    /* renamed from: a, reason: collision with root package name */
    private Application f9946a;

    /* renamed from: b, reason: collision with root package name */
    private final K.b f9947b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f9948c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1019h f9949d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.savedstate.a f9950e;

    public F() {
        this.f9947b = new K.a();
    }

    @Override // androidx.lifecycle.K.b
    public <T extends J> T create(Class<T> modelClass, AbstractC5837a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.get(K.c.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(C.SAVED_STATE_REGISTRY_OWNER_KEY) == null || extras.get(C.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.f9949d != null) {
                return (T) create(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.get(K.a.APPLICATION_KEY);
        boolean zIsAssignableFrom = C1012a.class.isAssignableFrom(modelClass);
        Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? G.findMatchingConstructor(modelClass, G.f9952b) : G.findMatchingConstructor(modelClass, G.f9951a);
        return constructorFindMatchingConstructor == null ? (T) this.f9947b.create(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) G.newInstance(modelClass, constructorFindMatchingConstructor, C.createSavedStateHandle(extras)) : (T) G.newInstance(modelClass, constructorFindMatchingConstructor, application, C.createSavedStateHandle(extras));
    }

    @Override // androidx.lifecycle.K.d
    public void onRequery(J viewModel) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f9949d != null) {
            androidx.savedstate.a aVar = this.f9950e;
            Intrinsics.checkNotNull(aVar);
            AbstractC1019h abstractC1019h = this.f9949d;
            Intrinsics.checkNotNull(abstractC1019h);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, aVar, abstractC1019h);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(Application application, InterfaceC6512d owner) {
        this(application, owner, null);
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    public F(Application application, InterfaceC6512d owner, Bundle bundle) {
        K.a aVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f9950e = owner.getSavedStateRegistry();
        this.f9949d = owner.getLifecycle();
        this.f9948c = bundle;
        this.f9946a = application;
        if (application != null) {
            aVar = K.a.Companion.getInstance(application);
        } else {
            aVar = new K.a();
        }
        this.f9947b = aVar;
    }

    public final <T extends J> T create(String key, Class<T> modelClass) throws NoSuchMethodException, SecurityException, IOException {
        T t8;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC1019h abstractC1019h = this.f9949d;
        if (abstractC1019h != null) {
            boolean zIsAssignableFrom = C1012a.class.isAssignableFrom(modelClass);
            Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || this.f9946a == null) ? G.findMatchingConstructor(modelClass, G.f9952b) : G.findMatchingConstructor(modelClass, G.f9951a);
            if (constructorFindMatchingConstructor == null) {
                return this.f9946a != null ? (T) this.f9947b.create(modelClass) : (T) K.c.Companion.getInstance().create(modelClass);
            }
            androidx.savedstate.a aVar = this.f9950e;
            Intrinsics.checkNotNull(aVar);
            SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(aVar, abstractC1019h, key, this.f9948c);
            if (zIsAssignableFrom && (application = this.f9946a) != null) {
                Intrinsics.checkNotNull(application);
                t8 = (T) G.newInstance(modelClass, constructorFindMatchingConstructor, application, savedStateHandleControllerCreate.getHandle());
            } else {
                t8 = (T) G.newInstance(modelClass, constructorFindMatchingConstructor, savedStateHandleControllerCreate.getHandle());
            }
            t8.e(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, savedStateHandleControllerCreate);
            return t8;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.K.b
    public <T extends J> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
