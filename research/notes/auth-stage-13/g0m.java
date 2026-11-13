package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.methods.f;
import com.yandex.passport.internal.util.o;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public abstract class g0m implements f {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final boolean c;

    public /* synthetic */ g0m(String str, boolean z, int i) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public void a() {
        this.b.getValue();
    }

    public Parcelable b(Bundle bundle) {
        switch (this.a) {
            case 1:
                String str = (String) this.b;
                mqd.z(bundle, "bundle");
                if (this.c) {
                    bundle.setClassLoader(o.class.getClassLoader());
                }
                if (!bundle.containsKey(str)) {
                    return null;
                }
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable != null) {
                    return parcelable;
                }
                throw new IllegalStateException("can't get required parcelable ".concat(str).toString());
            default:
                mqd.z(bundle, "bundle");
                if (this.c) {
                    bundle.setClassLoader(o.class.getClassLoader());
                }
                String str2 = (String) this.b;
                Parcelable parcelable2 = bundle.getParcelable(str2);
                if (parcelable2 != null) {
                    return parcelable2;
                }
                throw new IllegalStateException(("can't get required parcelable " + str2).toString());
        }
    }

    public /* bridge */ /* synthetic */ Object c(Bundle bundle) {
        switch (this.a) {
            case 1:
                break;
        }
        return b(bundle);
    }

    public void d(Bundle bundle, Object obj) {
        switch (this.a) {
            case 1:
                Parcelable parcelable = (Parcelable) obj;
                if (parcelable != null) {
                    bundle.putParcelable((String) this.b, parcelable);
                }
                break;
            default:
                Parcelable parcelable2 = (Parcelable) obj;
                mqd.z(parcelable2, "value");
                bundle.putParcelable((String) this.b, parcelable2);
                break;
        }
    }

    public String getKey() {
        switch (this.a) {
            case 1:
                break;
        }
        return (String) this.b;
    }

    public g0m(boolean z) {
        this.a = 3;
        this.c = z;
        this.b = lo7.B(new iy9(this, 13));
    }

    public g0m(String str) {
        this.a = 2;
        this.b = str;
        this.c = false;
    }
}
