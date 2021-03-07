package com.fikranakbar.bisamasak

object CooksData {
    private val cookNames = arrayOf(
            "Bihun Bumbu Bawang Simpel",
            "Nasi Goreng Kampung",
            "Ikan Asin Balado",
            "Cumi Sambal Hijau",
            "Sambal Bajak",
            "Telor Sambal Hijau",
            "Sayur Asem",
            "Sayur Bayam",
            "Mi Dog Dog",
            "Mi Instant Kangkung Spicy")

    private val cookDescriptions = arrayOf(
            "Masakan Bihun putih dengan bumbu yang sederhana ini cukup menggugah selera di pagi hari. Lengkap dengan lauk telur dan sayur tomatnya akan membuat hari anda bersemangat.",
            "Tak kalah enak dengan nasi goreng jenis lain. Tambahan ikan teri yang digoreng hingga krispi membuat nasi goreng ini memiliki tambahan tekstur kriuk dan rasa gurih asin yang cocok dengan nasi goreng",
            "Racikan ikan asin yang satu ini tidak kalah menggiurkan. Rasa balado yang terdiri dari pedas dan manis tercampur sempurna dengan ikan asin dan membuatnya banyak rasa. Sangat cocok dihidangkan untuk makanan santap siang",
            "Seafood dengan olahan sambal hijau sudah banyak variannya. Akan tetapi olahan cumi sambal hijau yang satu ini tidak boleh diabaikan, karena resep yang satu ini akan menggoyang lidah anda",
            "Resep Ulegan cabe rawit merah yang tak biasa. Bajakan cabai di cowek ini akan menemani santapan siang lainnya dengan rasa yang tak biasa. Bersiaplah untuk membuat selera makan anda meningkat pesat",
            "Telor ceplok sudah sering kita jumpai pada menu sehari-hari. Dengan tambahan sedikit sambal hijau, telor ceplok tersebut bisa menjadi hidangan yang luar biasa",
            "Jejipangan, kacang panjang, dan potongan jagung bercampur padu dalam sebuah sayur asem dengan resep yang unik dan rasa yang akan menyegarkan pagi anda.",
            "Masakan bayam yang kerap kali menjadi sarapan di pagi hari. Sayuran bayam serta wortel dalam racikan yang segar sangat cocok untuk disantap di pagi hari.",
            "Dari pada membeli mie goreng dari sebuah restoran, kenapa kita tidak membuatnya sendiri. Resep ini dijamin akan membuat masakan mie dog-dog anda mengundang banyak orang untuk memakannya.",
            "Mie kuah yang satu ini sangatlah unik. Saking uniknya, kita bahkan sulit menjumpainya di sebuah restoran. Dengan begitu silahkan coba resep unik ini dengan bahan yang mudah didapat."
    )

    private val cookIngredients = arrayOf(
            "- 100 gram bihun.\n" +
                    "- 1 sdt garam.\n" +
                    "- 2 siung bawang putih.\n" +
                    "- 3 siung bawang merah.\n" +
                    "- lada bubuk dan kaldu bubuk secukupnya.\n" +
                    "- minyak secukupnya.\n" +
                    "- 1 batang daun bawang, iris tipis.",
            "- Nasi putih 1 secukupnya.\n" +
                    "- Ikan teri, dibelah, kemudian goreng hingga kriuk.\n" +
                    "- Telur 2 butir.\n" +
                    "- Daun bawang iris.\n" +
                    "- Bawang putih 6 siung iris.\n" +
                    "- Bawang merah 3 siung iris.\n" +
                    "- Sedikit terasi.\n" +
                    "- cabai merah 5 buah iris.\n" +
                    "- cabai rawit 20 buah iris.\n" +
                    "- Garam/penyedap.\n" +
                    "- Kecap dan saus sambal.",
            "- minyak goreng secukupnya.\n" +
                    "- 100 gram ikan asin pakang.\n" +
                    "- 1 sdt garam.\n" +
                    "- 10 buah cabai merah (halus).\n" +
                    "- 8 sdm gula pasir (bisa disesuaikan selera).\n" +
                    "- 4 siung bawang putih (halus).\n" +
                    "- 50 cc air putih (halus).\n" +
                    "- 2 sdm asam jawa (diseduh air hangat).\n" +
                    "- 5 butir bawang merah (halus).",
            "- cumi 500 gr\n" +
                    "- pokak secukupnya\n" +
                    "- garam/penyedap\n" +
                    "- bombay iris secukupnya\n" +
                    "- potongan tomat/dadu\n" +
                    "- air jeruk nipis\n" +
                    "- daun jeruk nipis\n" +
                    "- bamer 12-15 buah ukuran kecil (halus).\n" +
                    "- baput 1 siung (halus).\n" +
                    "- cabai hijau 1 ons (halus).",
            "- Segenggam cabai rawit.\n" +
                    "- 8 Cabai merah keriting.\n" +
                    "- 5 Siung bawang putih.\n" +
                    "- Garam secukupnya.\n" +
                    "- Minyak panas secukupnya.",
            "- 10 butir telur, rebus dan kupas kulitnya.\n" +
                    "- 4 siung bawang putih.\n" +
                    "- garam secukupnya.\n" +
                    "- 10 buah cabai hijau besar.\n" +
                    "- 1 ruas jari lengkuas.\n" +
                    "- 5 buah cabai rawit hijau.\n" +
                    "- 6 siung bawang merah.\n" +
                    "- 2 buah tomat hijau.\n" +
                    "- 1 batang serai, memarkan.\n" +
                    "- 1 lembar daun salam.\n" +
                    "- gula secukupnya.\n" +
                    "- 4 sdm minyak goreng.\n" +
                    "- 1 blok (2 cm) terasi.",
            "- 3 lembar daun salam.\n" +
                    "- 6 buah melinjo.\n" +
                    "- 50 gram tetelan sapi.\n" +
                    "- 1 ikat kacang panjang.\n" +
                    "- 3 cabai hijau besar.\n" +
                    "- 1 sendok makan gula merah.\n" +
                    "- 3 buah jagung manis (dipotong jadi 3 atau 4 bagian).\n" +
                    "- 1 buah labu siam ukuran sedang (buang kulitnya lalu potong dadu).\n" +
                    "- 1 genggam daun melinjo muda.\n" +
                    "- 3 sendok makan kacang tanah.\n" +
                    "- 1 ruas jari lengkuas.\n" +
                    "- 3 sendok makan air asam.\n" +
                    "- 2 liter air.\n" +
                    "- 5 siung bawang merah (halus).\n" +
                    "- 4 siung bawang putih (halus).\n" +
                    "- 2 butir kemiri (halus).\n" +
                    "- 2 buah cabai merah (halus).\n" +
                    "- 1 sendok teh terasi bakar (halus).\n" +
                    "- Garam secukupnya (halus).",
            "- 2 siung bawang putih, iris halus.\n" +
                    "- 2 sdt garam.\n" +
                    "- 300 gr daun bayam.\n" +
                    "- 1 sdt gula pasir.\n" +
                    "- 100 gr wortel, iris bulat tipis.\n" +
                    "- 1 liter air.\n" +
                    "- 4 butir bawang merah, iris halus.\n" +
                    "- 2 lembar daun salam.",
            "- 2 bungkus mi instan ayam bawang.\n" +
                    "- 1/2 buah tomat.\n" +
                    "- caisim.\n" +
                    "- 2 butir telur.\n" +
                    "- kecap manis.\n" +
                    "- 2 siung bawang putih (halus).\n" +
                    "- 3 buah bawang merah (halus).\n" +
                    "- 3 buah cabai merah (halus).\n" +
                    "- 2 buah cabai rawit (halus).\n" +
                    "- garam dan gula (halus).",
            "- 1 bungkus mi instan.\n" +
                    "- kangkung secukupnya.\n" +
                    "- 1 butir telur.\n" +
                    "- 5 butir bakso.\n" +
                    "- 2 cumi cilik, potong-potong.\n" +
                    "- 1/2 buah tomat, potong-potong.\n" +
                    "- saus sambal.\n" +
                    "- saus tiram.\n" +
                    "- garam dan gula.\n" +
                    "- 10 buah cabai rawit (kasar).\n" +
                    "- 2 siung bawang putih (kasar).\n" +
                    "- 1 butir kemiri, sangrai (kasar).")

    private val cookSteps = arrayOf(
            "1. Rendam bihun dengan air panas hingga empuk dan mengembang. Tiriskan\n" +
                    "2. Haluskan bawang putih dan bawang merah\n" +
                    "3. Tumis bumbu hingga matang, masukkan garam, kaldu bubuk dan lada bubuk. Aduk sebentar\n" +
                    "4. Masukkan bihun dan aduk rata dengan bumbu. Tabur daun bawang di akhir, aduk rata. Matikan api\n" +
                    "5. Bihun bumbu bawang siap disajikan.",
            "1. Tumis bawang putih, bawang merah hingga cabai merah, cabai rawit hingga kecoklatan\n" +
                    "2. Kemudian masukkan telur, aduk rata\n" +
                    "3. Masukkan nasi, sambil di aduk-aduk. Kemudian beri garam aduk terus hingga matang\n" +
                    "4. Terakhir masukkan kecap, saus dan daun bawang iris\n" +
                    "5. Aduk rata dan sajikan dengan ikan teri.",
            "1. Goreng ikan asin sampai menguning dengan api sedang, lalu sisihkan sebentar\n" +
                    "2. Tumis bumbu yang sudah dihaluskan, kemudian tambahkan asam jawa, gula pasir dan garam secukupnya\n" +
                    "3. Kalau sudah, kecilkan api, masukkan ikan asin pakang yang sudah digoreng tadi ke bumbu. Aduk sampai bumbu meresap sempurna.",
            "1. Bersihkan cuci, potong-potong.\n" +
                    "2. Sirami dengan air jeruk nipis dan garam diamkan 5 menit kemudian bilas, goreng cumi sebentar dan tiriskan\n" +
                    "3. Cuci pokak, goreng sebentar, sisihkan\n" +
                    "4. Ulek kasar cabai, garam/penyedap\n" +
                    "5. Panaskan minyak, masukkan bombai, potongan tomat sampai layu, masukkan cabai ulek dan daun jeruk\n" +
                    "6. Masukkan cumi dan pokak aduk-aduk sampai tercampur rata sajikan.",
            "1. Goreng cabai dan bawang sebentar saja, kemudian ulek kasar\n" +
                    "2. Beri garam secukupnya\n" +
                    "3. Terakhir siram pakai minyak goreng panas.",
            "1. Goreng telur rebus hingga berubah warna kekuningan. Angkat dan sisihkan\n" +
                    "2. Haluskan semua bahan seperti cabai hijau besar, cabai rawit, tomat, bawang merah, bawang putih, terasi, garam dan gula\n" +
                    "3. Panaskan minyak dan tumis bumbu halus hingga harum. Masukkan serai, daun salam dan lengkuas\n" +
                    "4. Masukkan telur dan aduk rata. Masak lagi hingga cabai hijau matang atau berkurang airnya.",
            "1. Potong semua sayur sesuai ukuran pas\n" +
                    "2. Potong daging tetelan bentuk dadu. Rebus sampai mendidih, masukkan melinjo, kacang tanah, dan jagung. Rebus sampai semua bahan empuk\n" +
                    "3. Masukkan bumbu yang sudah dihaluskan, lengkuas memar dan daun salam, serta cabai hijau\n" +
                    "4. Bumbui sayur asem dengan gula merah, air asam jawa dan garam\n" +
                    "5. Masukkan labu siam, kacang panjang dan daun melinjo. Masak sampai matang.",
            "1. Rebus air, lalu masukkan bawang merah, bawang putih, daun salam, dan temu kunci. Tunggu sampai layu\n" +
                    "2. Masukkan wortel, masak wortel setengah matang\n" +
                    "3. Masukkan daun bayam, didihkan lagi sebentar.",
            "1. Rebus mi sampai setengah matang, tiriskan\n" +
                    "2. Tumis bumbu halus sampai harum, masukkan telur tunggu agak matang lalu orak arik\n" +
                    "3. Masukkan sayuran dan air, lalu mi dan bumbu mi, kecap secukupnya, aduk rata koreksi rasa, tambahkan gula dan garam bila perlu\n" +
                    "4. Aduk rata, angkat dan sajikan.",
            "1. Tumis bumbu ulek dengan sedikit minyak, masukkan telur bikin orak arik lalu tambahkan cumi-cumi dan bakso + potongan tomat tuang segelas air\n" +
                    "2. Tunggu mendidih masukkan mi instan dan bumbunya + saus sambal, saus tiram dan masukan kangkung aduk rata bumbui sedikit garam dan gula\n" +
                    "3. Koreksi rasa dan angkat, siap disajikan."
    )

    private val cookImages = arrayOf(
            R.drawable.bihun_bumbu_bawang_simpel,
            R.drawable.nasi_goreng_kampung,
            R.drawable.ikan_asin_balado,
            R.drawable.cumi_sambal_hijau,
            R.drawable.sambal_bajak,
            R.drawable.telor_sambal_hijau,
            R.drawable.sayur_asem,
            R.drawable.sayur_bayam,
            R.drawable.mi_dog_dog,
            R.drawable.mi_instant_kangkung_spicy
    )

    private val cookIsFavorite = arrayOf(
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    )

    val listData: ArrayList<Cook>
        get() {
            val list = arrayListOf<Cook>()
            for (position in cookNames.indices) {
                val cook = Cook()
                cook.name = cookNames[position]
                cook.description = cookDescriptions[position]
                cook.ingredient = cookIngredients[position]
                cook.step = cookSteps[position]
                cook.photo = cookImages[position]
                cook.isFavorite = cookIsFavorite[position]

                list.add(cook)
            }
            return list
        }
}