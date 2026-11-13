package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class bf1 {
    public final Looper a;
    public final ulf b;
    public final s91 c;
    public final mwk d;
    public final zmq e;
    public final y9a f;
    public final f2k g;

    public bf1(Looper looper, ulf ulfVar, s91 s91Var, mwk mwkVar, zmq zmqVar, y9a y9aVar, f2k f2kVar) {
        mqd.z(looper, "logicLooper");
        mqd.z(ulfVar, "httpRetrierFactory");
        mqd.z(s91Var, "authHeaderProvider");
        mqd.z(mwkVar, "registrationController");
        mqd.z(zmqVar, "userActionFailedObservable");
        mqd.z(y9aVar, "experimentConfig");
        mqd.z(f2kVar, "profileCurrentOrganizationStorage");
        this.a = looper;
        this.b = ulfVar;
        this.c = s91Var;
        this.d = mwkVar;
        this.e = zmqVar;
        this.f = y9aVar;
        this.g = f2kVar;
    }

    public final af1 a(String str, bff bffVar, taa taaVar) {
        mqd.z(str, "requestId");
        atl.s(this.a, Looper.myLooper(), null);
        return new af1(this, str, bffVar, taaVar);
    }
}
