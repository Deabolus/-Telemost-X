package defpackage;

import com.yandex.messaging.core.net.entities.TogglePushTokenData;
import com.yandex.messaging.core.net.entities.TogglePushTokenParams;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class me1 extends bff {
    public final /* synthetic */ qe1 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ pe9 l;

    public me1(qe1 qe1Var, String str, boolean z, pe9 pe9Var) {
        this.i = qe1Var;
        this.j = str;
        this.k = z;
        this.l = pe9Var;
    }

    public final boolean C(f7f f7fVar) {
        mqd.z(f7fVar, "error");
        return false;
    }

    public final void E(Object obj) {
        TogglePushTokenData togglePushTokenData = (TogglePushTokenData) obj;
        mqd.z(togglePushTokenData, "response");
        this.l.c0(togglePushTokenData);
    }

    public final g5l I() {
        return this.i.b.a(new TogglePushTokenParams(this.j, this.k), "toggle_push_token");
    }

    public final znc s(ocl oclVar) {
        return fde.j(this.i.b, "toggle_push_token", TogglePushTokenData.class, oclVar);
    }
}
