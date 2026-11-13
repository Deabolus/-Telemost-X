package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class xa1 extends ab1 {
    public static final /* synthetic */ y5e[] e = {new o8h(0, xa1.class, "job", "getJob()Lcom/yandex/messaging/Cancelable;")};
    public final nb1 c;
    public final rym d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(mwk mwkVar, nb1 nb1Var) {
        super(mwkVar, null);
        mqd.z(nb1Var, "existingAuthUid");
        this.c = nb1Var;
        rym rymVar = new rym(7);
        this.d = rymVar;
        wpm wpmVar = mwkVar.l;
        ks6 ks6Var = (ks6) wpmVar.b;
        Looper looper = (Looper) ks6Var.i.get();
        g1j g1jVarJ = ks6Var.j();
        bs6 bs6Var = (bs6) wpmVar.c;
        ike ikeVarA = n68.a(bs6Var.F0);
        ike ikeVarA2 = n68.a((tn3) wpmVar.d);
        ike ikeVarA3 = n68.a((tr1) wpmVar.e);
        Context context = ks6Var.a.a;
        rld.q(context);
        hu7 hu7Var = new hu7(context);
        zmq zmqVar = (zmq) bs6Var.r0.get();
        n2d n2dVar = (n2d) ks6Var.L0.get();
        ne6 ne6Var = (ne6) ks6Var.k.get();
        x71 x71Var = new x71(looper, g1jVarJ, ikeVarA, ikeVarA2, ikeVarA3, hu7Var, zmqVar, n2dVar, ne6Var);
        tc1 tc1Var = new tc1();
        ne6.c(ne6Var);
        rymVar.B(this, e[0], new d1j(x71Var, nb1Var, tc1Var, this));
    }

    @Override // defpackage.ab1, defpackage.cw3
    public final void cancel() {
        this.d.B(this, e[0], (cw3) null);
    }
}
