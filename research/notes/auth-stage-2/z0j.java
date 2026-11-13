package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class z0j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1j b;

    public /* synthetic */ z0j(b1j b1jVar, int i) {
        this.a = i;
        this.b = b1jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oxk oxkVar;
        switch (this.a) {
            case 0:
                b1j b1jVar = this.b;
                Handler handler = b1jVar.a;
                try {
                    Object objO = b1jVar.e.o(b1jVar.b);
                    if (objO == null) {
                        handler.post(new z0j(b1jVar, 1));
                    } else {
                        handler.post(new rtf(19, b1jVar, objO));
                    }
                } catch (a91 | b91 unused) {
                    handler.post(new z0j(b1jVar, 2));
                    return;
                } catch (Exception e) {
                    handler.post(new rtf(20, b1jVar, e));
                    return;
                }
                break;
            case 1:
                this.b.a(null);
                break;
            default:
                b1j b1jVar2 = this.b;
                atl.s(b1jVar2.a.getLooper(), Looper.myLooper(), null);
                atl.t(null, b1jVar2.g);
                b1jVar2.g = false;
                b1jVar2.d.j(b1jVar2.e.name(), "passport_relogin_required", "method");
                if (!b1jVar2.h && (oxkVar = b1jVar2.c) != null) {
                    atl.s(oxkVar.a, Looper.myLooper(), null);
                    oxkVar.d = true;
                    ryh ryhVar = oxkVar.c;
                    ryhVar.b();
                    while (ryhVar.hasNext()) {
                        rxk rxkVar = (rxk) ryhVar.next();
                        atl.s((Looper) rxkVar.e.c, Looper.myLooper(), null);
                        rxkVar.a.post(new qxk(rxkVar, 2));
                    }
                    break;
                }
                break;
        }
    }
}
