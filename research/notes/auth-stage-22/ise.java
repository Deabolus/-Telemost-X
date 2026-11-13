package defpackage;

import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class ise implements qck {
    public final ool a;
    public final quc b;
    public final ike c;

    public ise(ool oolVar, quc qucVar, ike ikeVar) {
        mqd.z(oolVar, "httpRetrierFactory");
        mqd.z(qucVar, "apiCallFactory");
        mqd.z(ikeVar, "logicPrefs");
        this.a = oolVar;
        this.b = qucVar;
        this.c = ikeVar;
    }

    @Override // defpackage.qck
    public final cw3 a(tco tcoVar, String str, String str2, pck pckVar, String str3, boolean z, String str4, String str5, String str6) {
        mqd.z(str2, "deviceModel");
        mqd.z(pckVar, "pushToken");
        mqd.z(str3, "deviceId");
        String string = ((SharedPreferences) this.c.get()).getString("oauth_token", null);
        vc1 vc1Var = string != null ? new vc1(string) : null;
        if (vc1Var == null) {
            cw3.T.getClass();
            return hlk.b;
        }
        le1 le1Var = new le1(this, str, str2, pckVar, str3, z, str4, str5, str6, vc1Var, tcoVar);
        ool oolVar = this.a;
        oolVar.getClass();
        return oolVar.q(UUID.randomUUID().toString(), le1Var, saa.c);
    }

    @Override // defpackage.qck
    public final cw3 b(pe9 pe9Var, String str, boolean z) {
        String string = ((SharedPreferences) this.c.get()).getString("oauth_token", null);
        vc1 vc1Var = string != null ? new vc1(string) : null;
        if (vc1Var == null) {
            cw3.T.getClass();
            return hlk.b;
        }
        be1 be1Var = new be1(this, str, z, vc1Var, pe9Var);
        ool oolVar = this.a;
        oolVar.getClass();
        return oolVar.q(UUID.randomUUID().toString(), be1Var, saa.c);
    }
}
