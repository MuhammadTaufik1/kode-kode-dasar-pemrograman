// Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Variabel dan Operasi
int x = 5;
int y = 10;
int z = x + y;
System.out.println(z);

// Struktur Pemilihan
if (x > y) {
    System.out.println("x lebih besar dari y");
} else {
    System.out.println("x tidak lebih besar dari y");
}

// Struktur Perulangan
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// Fungsi
int tambah(int a, int b) {
    return a + b;
}

int hasil = tambah(3, 4);
System.out.println(hasil);
