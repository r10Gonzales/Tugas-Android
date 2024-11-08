package com.riogonzales.recyclerviewrio

import java.util.ArrayList

object BooksData {
    private val bookName = arrayOf(
        "Sebuah Seni untuk Bersikap Bodo Amat",
        "Nanti Kita Cerita Tentang Hari Ini",
        "Detektif Conan 96",
        "The Life Changing Magic Of Tidying Up",
        "Dilan 2: Dia Adalah Dilanku Tahun 1991",
        "Filosofi Teras Filsafat Yunani-Romawi Kuno Untuk Mental Tangguh Masa Kini",
        "Pulang-Pergi",
        "The Power Of Habit (2019)",
        "Grit: Kekuatan Passion dan Kegigihan (Edisi Revisi)",
        "Sapiens"
    )

    private val bookDetails = arrayOf(
        "Selama beberapa tahun belakangan, Mark Manson—melalui blognya yang sangat popular telah " +
                "membantu mengoreksi harapan-harapan delusional kita, baik mengenai diri kita sendiri maupun dunia. Ia " +
                "kini menuangkan buah pikirnya yang keren itu di dalam buku hebat ini. Dalam hidup ini, kita hanya punya " +
                "kepedulian dalam jumlah yang terbatas. Makanya, Anda harus bijaksana dalam menentukan kepedulian " +
                "Anda. Manson menciptakan momen perbincangan yang serius dan mendalam, dibungkus dengan cerita- " +
                "cerita yang menghibur dan kekinian, serta humor yang cadas. Buku ini merupakan tamparan di wajah " +
                "yang menyegarkan untuk kita semua, supaya kita bisa mulai menjalani kehidupan yang lebih " +
                "memuaskan, dan apa adanya.",
        "Nanti kita cerita tentang hari ini.. Besok kita buat yang lebih baik lagi. @nkcthi Buku visual grafis, " +
                "yang menceritakan tentang perempuan bernama Awan (27th) yang takut akan lupa rasanya menjadi " +
                "muda, jadi dia membuat surat yang dia kirim untuk masa depan. Sebagai pengingat untuk dia dan " +
                "anaknya kelak. Berisikan kumpulan pesan dan cerita dari yang ia hadapi dan lihat. Awan mencoba " +
                "sederhanakan dari pelajaran yang dia hadapin di masa mudanya.",
        "Pertama kalinya Heiji Hattori berhadapan dengan si Kid Pencuri yang mengincar Fairy Lip! Di " +
                "kasus lain Makoto Kyogoku terlibat dalam insiden di lokasi syuting TV drama. . . ! ? Selanjutnya ada " +
                "informasi baru terkuaknya bos Organisasi Baju Hitam!!",
        "#1 New York Times best seller dan telah terjual lebih dari 5 Juta Kopi. Marie Kondo telah " +
                "memosisikan diri sebagai seorang master berbenah, kesatria yang berperang melawan situasi " +
                "berantakan.—The London Times Walaupun sudah susah payah merapikan rumah, apakah kertas-kertas " +
                "terus saja bertumpuk dan pakaian harus terus Anda jejal-jejalkan di lemari? Kenapa kita tidak bisa " +
                "menjaga kerapian rumah? Konsultan berbenah asal Jepang, Marie Kondo, memperkenalkan metode " +
                "merapikan yang ampuh tiada duanya, KonMari. Keampuhan metode yang kini semakin marak diterapkan " +
                "di Jepang dan telah dikemas dalam program televisi laris, Tidy Up with KonMari! ini, telah menular ke " +
                "seluruh dunia. Saking ampuhnya, tak seorang pun klien Kondo kembali ke kebiasaan berantakan (dan " +
                "calon kliennya harus masuk daftar tunggu selama tiga bulan).",
        "Tujuan pacaran adalah untuk putus. Bisa karena menikah, bisa karena berpisah. Pidi Baiq (1972-" +
                "2098). Jika aku berkata bahwa aku mencintainya, maka itu adalah sebuah pernyataan yang sudah cukup " +
                "lengkap.—Milea. Senakal-nakalnya anak geng motor, Lia, mereka shalat pada waktu ujian praktek " +
                "Agama. —Dilan",
        "Lebih dari 2000 tahun lalu, sebuah mazhab filsafat menemukan akar masalah dan juga solusi " +
                "dari banyak emosi negatif. Stoisisme, atau Filosofi Teras, adalah filsafat Yunani-Romawi kuno yang bisa " +
                "membantu kita mengatasi emosi negatif dan menghasilkan mental yang tangguh dalam menghadapi " +
                "naik-turun nya kehidupan. Jauh dari kesan filsafat sebagai topik berat dan mengawang-awang, Filosofi " +
                "Teras justru bersifat praktis dan relevan dengan kehidupan Generasi Milenial dan Gen-Z masa kini.",
        "Ada jodoh yang ditemukan lewat tatapan pertama. Ada persahabatan yang diawali lewat sapa " +
                "hangat. Bagaimana jika takdir bersama ternyata, diawali dengan pertarungan mematikan? Lantas semua " +
                "cerita berkelindan dengan, pengejaran demi pengejaran mencari jawaban? Pulang-Pergi",
        "Kebiasaan adalah Rahasia Keberhasilan. Travis, seorang pemuda broken home degan orang tua " +
                "pecandu obat, berkali-kali dipecat dari pekerjaan karena tidak bisa mengendalikan emosi. Namun " +
                "sesudah menjalani pelatihan pegawai Starbucks yang mengajarkan kekuatan tekad, Travis kini sukses " +
                "menjadi manajer dua cabang kafe terkenal itu. Seorang CEO baru memegang salah satu perusahaan " +
                "raksasa Amerika. Perintah pertamanya adalah menumbuhkan kepedulian keselamatan kerja-dan " +
                "hasilnya saham perusahaan itu, Alcoa, menjadi salah satu yang berkinerja terbaik di Dow Jones.",
        "Mengapa orang yang punya bakat alami sering gagal mencapai potensi mereka sementara " +
                "orang lain yang tidak terlalu berbakat bisa menggapai hal-hal yang menakjubkan? Dalam buku yang " +
                "harus dibaca oleh siapa saja yang ingin sukses ini, Angela Duckworth—seorang psikolog perintis— " +
                "menunjukkan bahwa rahasia untuk pencapaian yang luar biasa bukanlah bakat, tetapi perpaduan " +
                "istimewa antara hasrat (passion) dan kegigihan (perseverance) yang ia sebut ketabahan (grit).",
        "SELAMA dua setengah juta tahun, berbagai spesies manusia hidup dan punah di Bumi, sampai " +
                "akhirnya tersisa satu, Homo sapiens, Manusia Bijaksana, sejak seratusan ribu tahun lalu. Namun spesies " +
                "ini bisa menyebar ke seluruh dunia dan beranak-pinak hingga berjumlah 7 miliar, dan kini menjadi " +
                "kekuatan alam yang dapat mengubah kondisi planet. Apa penyebabnya? Sapiens membahas sisi yang " +
                "tak banyak diungkit buku sejarah atau evolusi manusia lain: bagaimana manusia berangkat dari sekadar " +
                "satu spesies hewan menjadi makhluk berperadaban, melalui tiga revolusi—Kognitif, Pertanian, dan " +
                "Sains. Telusuri peran bahasa, pertanian, sampai gosip dan fiksi dalam kesuksesan manusia, juga arti " +
                "kebahagiaan manusia dan ujung riwayat spesies kita. Menarik dan provokatif... membuat kita sadar " +
                "bahwa kita baru sebentar hadir di Bumi ini, bahwa pertanian dan sains baru-baru saja ada, dan " +
                "sebaiknya kita jangan menganggap enteng semua itu. - Presiden Barack Obama",
    )

    private val bookAuthor = arrayOf(
        "Mark Manson",
        "Marchella Fp",
        "Aoyama Gosho",
        "Marie Kondo",
        "Pidi Baiq",
        "Henry Manampiring",
        "Tere Liye",
        "Charles Duhigg",
        "Angela Duckworth",
        "Yuval Noah Harari"
    )

    private val bookPhoto = arrayOf(
        "https://cdn.gramedia.com/uploads/items/9786024526986_Sebuah-Seni-Untuk-Bersikap-Bodo-Amat__w150_hauto.jpg",
        "https://cdn.gramedia.com/uploads/items/9786024248215_Nanti-Kita-Cerita-Tentang-Hari-Ini__w150_hauto.jpg",
        "https://cdn.gramedia.com/uploads/items/9786230005879_Cov_Conan_96__w150_hauto.jpg",
        "https://cdn.gramedia.com/uploads/items/9786022912446_The-Life-Changing-Magic-Of-Tidying-Up__w149_hauto.jpg",
        "https://cdn.gramedia.com/uploads/items/9786027870994_dilan-1991__w149_hauto.jpg",
        "https://cdn.gramedia.com/uploads/items/9786024125189_filosofi_teras.jpg",
        "https://cdn.gramedia.com/uploads/items/pulang-pergi_tere_liye.jpeg",
        "https://cdn.gramedia.com/uploads/items/img20190902_16534294.jpg",
        "https://cdn.gramedia.com/uploads/items/9786020620930_Grit_Kekuatan-Passion-dan-Kegigihan-Edisi-Revisi.jpg",
        "https://cdn.gramedia.com/uploads/items/591701404_sapiens.jpg"
    )

    val listData: ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in bookName.indices) {
                val book = Book()
                book.name = bookName[position]
                book.author = bookAuthor[position]
                book.detail = bookDetails[position]
                book.photo = bookPhoto[position]
                list.add(book)
            }
            return list
        }
}