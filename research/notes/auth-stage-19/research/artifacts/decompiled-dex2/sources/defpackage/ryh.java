package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class ryh implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public boolean d;
    public final /* synthetic */ Iterable e;

    public ryh(tyh tyhVar, byte b) {
        this.e = tyhVar;
        tyhVar.c++;
        this.b = tyhVar.b.size();
    }

    public void a() {
        switch (this.a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    tyh tyhVar = (tyh) this.e;
                    int i = tyhVar.c - 1;
                    tyhVar.c = i;
                    if (i <= 0 && tyhVar.d) {
                        tyhVar.d = false;
                        ArrayList arrayList = tyhVar.b;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            if (arrayList.get(size) == null) {
                                arrayList.remove(size);
                            }
                        }
                    }
                }
                break;
        }
    }

    public void b() {
        uyh uyhVar = this.e;
        if (!this.d) {
            this.d = true;
            uyh.a(uyhVar);
        }
        uyhVar.b++;
        this.b = uyhVar.a.size();
        this.d = false;
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                int i = this.c;
                while (i < this.b && ((g8n) this.e).a.get(i) == null) {
                    i++;
                }
                if (i < this.b) {
                    return true;
                }
                a();
                return false;
            case 1:
                int i2 = this.c;
                while (i2 < this.b && ((tyh) this.e).b.get(i2) == null) {
                    i2++;
                }
                if (i2 < this.b) {
                    return true;
                }
                a();
                return false;
            case 2:
                uyh uyhVar = this.e;
                int i3 = this.c;
                while (i3 < this.b && uyhVar.a.get(i3) == null) {
                    i3++;
                }
                if (i3 < this.b) {
                    return true;
                }
                if (!this.d) {
                    this.d = true;
                    uyh.a(uyhVar);
                }
                return false;
            default:
                tyh tyhVar = (tyh) this.e;
                int i4 = this.c;
                while (i4 < this.b && tyhVar.b.get(i4) == null) {
                    i4++;
                }
                if (i4 < this.b) {
                    return true;
                }
                if (!this.d) {
                    this.d = true;
                    tyh.a(tyhVar);
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((g8n) this.e).a;
                while (true) {
                    int i = this.c;
                    if (i < this.b && arrayList.get(i) == null) {
                        this.c++;
                    }
                }
                int i2 = this.c;
                if (i2 < this.b) {
                    this.c = i2 + 1;
                    return arrayList.get(i2);
                }
                a();
                throw new NoSuchElementException();
            case 1:
                ArrayList arrayList2 = ((tyh) this.e).b;
                while (true) {
                    int i3 = this.c;
                    if (i3 < this.b && arrayList2.get(i3) == null) {
                        this.c++;
                    }
                }
                int i4 = this.c;
                if (i4 < this.b) {
                    this.c = i4 + 1;
                    return arrayList2.get(i4);
                }
                a();
                throw new NoSuchElementException();
            case 2:
                uyh uyhVar = this.e;
                ArrayList arrayList3 = uyhVar.a;
                while (true) {
                    int i5 = this.c;
                    if (i5 < this.b && arrayList3.get(i5) == null) {
                        this.c++;
                    }
                }
                int i6 = this.c;
                if (i6 < this.b) {
                    this.c = i6 + 1;
                    return arrayList3.get(i6);
                }
                if (!this.d) {
                    this.d = true;
                    uyh.a(uyhVar);
                }
                throw new NoSuchElementException();
            default:
                tyh tyhVar = (tyh) this.e;
                ArrayList arrayList4 = tyhVar.b;
                while (true) {
                    int i7 = this.c;
                    if (i7 < this.b && arrayList4.get(i7) == null) {
                        this.c++;
                    }
                }
                int i8 = this.c;
                if (i8 < this.b) {
                    this.c = i8 + 1;
                    return arrayList4.get(i8);
                }
                if (!this.d) {
                    this.d = true;
                    tyh.a(tyhVar);
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ryh(tyh tyhVar) {
        this.e = tyhVar;
        tyhVar.c++;
        this.b = tyhVar.b.size();
    }

    public ryh(g8n g8nVar) {
        this.e = g8nVar;
        this.b = g8nVar.a.size();
    }

    public ryh(uyh uyhVar) {
        this.e = uyhVar;
        uyhVar.b++;
        this.b = uyhVar.a.size();
    }
}
