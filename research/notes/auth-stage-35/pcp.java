package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class pcp implements iea {
    public final /* synthetic */ int a;
    public final y8k b;
    public final y8k c;
    public final y8k d;

    public /* synthetic */ pcp(y8k y8kVar, y8k y8kVar2, y8k y8kVar3, int i) {
        this.a = i;
        this.b = y8kVar;
        this.c = y8kVar2;
        this.d = y8kVar3;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new mcp((mpb) this.b.get(), (kyb) this.c.get(), (we6) this.d.get());
            case 1:
                return new rhp(new k45(), (x20) this.b.get(), n68.a(this.c), (String) this.d.get());
            case 2:
                return new ylp((Activity) this.b.get(), (lop) this.c.get(), (obm) this.d.get());
            case 3:
                return new vmp((Activity) this.b.get(), (xmp) this.c.get(), (oep) this.d.get());
            case 4:
                return new top((d2c) this.b.get(), (bn4) this.c.get(), (we6) this.d.get());
            case 5:
                return new cup((Activity) this.b.get(), (fz1) this.c.get(), n68.a(this.d));
            case 6:
                return new e1q((q9j) this.b.get(), (n4l) this.c.get(), (ne6) this.d.get());
            case 7:
                return new q1q((pr1) this.b.get(), (y9a) this.c.get(), n68.a(this.d));
            case 8:
                return new teq(n68.a(this.b), (Looper) this.c.get(), (x20) this.d.get());
            case 9:
                return new bmq((qe1) this.b.get(), (ne6) this.c.get(), (pr1) this.d.get());
            case 10:
                return new eqq((bib) this.b.get(), (hqq) this.c.get(), (qp0) this.d.get());
            case 11:
                return new xuq((qp0) this.b.get(), (e4f) this.c.get(), n68.a(this.d));
            case 12:
                return new ivq(new k45(), (n4l) this.b.get(), (vt5) this.c.get(), (w5i) this.d.get());
            case 13:
                return new ewq(n68.a(this.b), n68.a(this.c), (c2k) this.d.get());
            case 14:
                return new qlr((Context) this.b.get(), (y9a) this.c.get(), (ayp) this.d.get());
            case 15:
                return new awr((Context) this.b.get(), (x20) this.c.get(), (y9a) this.d.get());
            case 16:
                return new wxr((ne6) this.b.get(), n68.a(this.c), n68.a(this.d));
            case 17:
                return new n2s((qp0) this.b.get(), (mwk) this.c.get(), (k4k) this.d.get());
            case 18:
                return new s3s((x20) this.b.get(), (ne6) this.c.get(), (hih) this.d.get());
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return new y8q((bf1) this.b.get(), (quc) this.c.get(), (hu7) this.d.get());
            case 20:
                return new y8q((lfg) this.b.get(), (ihg) this.c.get(), n68.a(this.d));
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return new q5s((x20) this.b.get(), (z5s) this.c.get(), (lfg) this.d.get());
            default:
                ike ikeVarA = n68.a(this.b);
                return new t5s((ne6) this.d.get(), (we6) this.c.get(), ikeVarA);
        }
    }
}
