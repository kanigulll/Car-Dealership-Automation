# Car-Dealership-Automation
Java Swing - Araç Galeri Otomasyon Sistemi

Bu proje, bir araç satış galerisinin günlük operasyonlarını yönetmek için geliştirilmiş, **Java Swing** tabanlı bir masaüstü uygulamasıdır. Veri kalıcılığı için **MySQL** kullanılmış ve **DAO (Data Access Object)** tasarım desenine sadık kalınmıştır.

##  Kullanılan Teknolojiler
* **Dil:** Java (SE)
* **Arayüz (GUI):** Java Swing & AWT
* **Veritabanı:** MySQL
* **Veritabanı Bağlantısı:** JDBC

##  Mimari Yapı
Proje, veritabanı işlemleri ile arayüz kodlarını birbirinden ayırmak için **DAO Design Pattern** kullanılarak geliştirilmiştir:
* **Model:** `Car`, `User`, `Customer` gibi veri taşıyıcı sınıflar.
* **DAO:** `CarDAO`, `UserDAO` gibi veritabanı sorgularını (CRUD) yöneten sınıflar.
* **GUI:** `MainFrame`, `LoginPanel` gibi kullanıcı arayüzü bileşenleri.

##  Özellikler
* **Kullanıcı Yönetimi:** Admin/Personel kayıt ve güvenli giriş sistemi.
* **Stok Yönetimi:** Yeni araç ekleme, araç detaylarını görüntüleme ve listeleme.
* **Satış İşlemleri:** Müşteri bilgileriyle araç satışı yapma ve satış kaydı oluşturma.
* **Raporlama:** Satılan araçların geçmişini görüntüleme.

##  Kurulum
1.  MySQL veritabanında `gallery_db` (veya kodda belirtilen isimde) bir veritabanı oluşturun.
2.  `DBConnection.java` dosyasındaki kullanıcı adı ve şifre alanlarını kendi yerel veritabanınıza göre güncelleyin.
3.  Projeyi favori IDE'nizde (IntelliJ/Eclipse/NetBeans) çalıştırın.
