package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Random;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class vlm extends dv1 {
    public final String g;
    public final long h;

    public vlm(bn4 bn4Var, String str, long j) {
        super(bn4Var, new wf(false));
        this.g = str;
        this.h = j;
    }

    @Override // defpackage.tn4
    public final void w(sc4 sc4Var, xr6 xr6Var) {
        bok bokVar = (bok) xr6Var.d.Q0.get();
        gkp gkpVarK = xr6Var.k();
        mqd.z(bokVar, "readMarkerController");
        String str = this.g;
        if (str == null) {
            str = gkpVarK.a.b;
        }
        mqd.z(str, "chatId");
        LinkedHashMap linkedHashMap = bokVar.b;
        Object aokVar = linkedHashMap.get(str);
        if (aokVar == null) {
            aokVar = new aok(bokVar, str);
            linkedHashMap.put(str, aokVar);
        }
        aok aokVar2 = (aok) aokVar;
        Handler handler = aokVar2.b;
        atl.s(handler.getLooper(), Looper.myLooper(), null);
        aokVar2.c.put(this.h, aokVar2);
        if (aokVar2.d == null && aokVar2.e == null) {
            znk znkVar = new znk(aokVar2, 0);
            Random random = new Random();
            int i = bok.e;
            int i2 = bok.d;
            handler.postDelayed(znkVar, random.nextInt(i - i2) + i2);
            aokVar2.d = znkVar;
        }
        g();
    }
}
