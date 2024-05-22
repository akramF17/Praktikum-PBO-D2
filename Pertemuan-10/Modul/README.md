### Penjelasan Terkait Proyek 4 pada Class GuiSimple4

#### List
**Menyimpan Data:**
- `add(E e)`: Menambahkan elemen ke List pada index terakhir.

**Mengambil Data:**
- `get(int index)`: Mengambil elemen List pada index tertentu.
- Perulangan untuk setiap akses dalam List. Contoh: for (String item : listOfItems)

**Karakteristik:**
- Memungkinkan elemen duplikat.
- Elemen disimpan berdasarkan urutan masuk.
- Dapat diakses berdasarkan indeks.

**Kelebihan:**
- Akses acak yang cepat melalui indeks.
- Memungkinkan duplikasi elemen.

**Kekurangan:**
- Memiliki overhead penyimpanan untuk indeks.
- Performa dapat menurun jika sering melakukan operasi penambahan atau penghapusan elemen di tengah List.

#### Set
**Menyimpan Data:**
- `add(E e)`: Menambahkan elemen ke set jika dan hanya jika elemen e belum ada dalam set.

**Mengambil Data:**
- Perulangan untuk setiap akses dalam Set. Contoh: for (String item : setOfItems)

**Karakteristik:**
- Tidak memungkinkan elemen duplikat.
- Tidak menjamin urutan elemen (kecuali `LinkedHashSet` dan `TreeSet`).
- Elemen-elemen dalam set tidak memiliki indeks.

**Kelebihan:**
- Operasi pencarian (`contains`) biasanya lebih cepat daripada List.
- Menghindari duplikasi secara otomatis.

**Kekurangan:**
- Tidak dapat diakses berdasarkan indeks.
- Tidak ada urutan tertentu kecuali menggunakan implementasi tertentu seperti `LinkedHashSet` atau `TreeSet`.

#### Map
**Menyimpan Data:**
- `put(K key, V value)`: Menambahkan pasangan kunci-nilai ke dalam map. Jika kunci sudah ada, nilai lama akan digantikan dengan nilai baru.

**Mengambil Data:**
- `get(Object key)`: Mengambil nilai yang terkait dengan kunci tertentu.

**Karakteristik:**
- Menyimpan pasangan kunci-nilai.
- Kunci tidak boleh duplikat, tetapi nilai dapat duplikat.
- Tidak menjamin urutan elemen (kecuali `LinkedHashMap` dan `TreeMap`).

**Kelebihan:**
- Memungkinkan pencarian nilai cepat berdasarkan kunci.
- Menyediakan cara yang efektif untuk menghubungkan kunci dengan nilai.

**Kekurangan:**
- Tidak ada urutan tertentu kecuali menggunakan implementasi tertentu seperti `LinkedHashMap` atau `TreeMap`.
- Memiliki overhead tambahan untuk menyimpan pasangan kunci-nilai.