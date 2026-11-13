package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class ya1 extends ab1 {
    public static final /* synthetic */ y5e[] e = {new o8h(0, ya1.class, "masterTokenCheckJob", "getMasterTokenCheckJob()Lcom/yandex/messaging/Cancelable;")};
    public final nb1 c;
    public final rym d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(mwk mwkVar, nb1 nb1Var, po1 po1Var) {
        super(mwkVar, po1Var);
        mqd.z(mwkVar, "controller");
        mqd.z(nb1Var, "existingAuthUid");
        this.c = nb1Var;
        this.d = new rym(7);
    }

    @Override // defpackage.ab1
    public final void a() {
        mwk mwkVar = this.a;
        ne6.c(mwkVar.k);
        nb1 nb1Var = this.c;
        mqd.z(nb1Var, "authUid");
        Handler handler = new Handler(mwkVar.d.getLooper());
        gaa gaaVar = new gaa(new hwj(26));
        handler.post(new axd(mwkVar, nb1Var, gaaVar, 14));
        ew3 ew3Var = new ew3(new lne(handler, mwkVar, gaaVar, 13), 0);
        this.d.B(this, e[0], ew3Var);
    }

    @Override // defpackage.ab1, defpackage.cw3
    public final void cancel() {
        ne6.c(this.a.k);
        this.d.B(this, e[0], (cw3) null);
    }
}
