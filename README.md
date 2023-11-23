# Java Dosya İşlemleri Örnekleri

Bu proje, Java programlama dilinde dosya işlemleri için kullanılan temel sınıfların ve örneklerin yer aldığı bir repo'dur. Proje, dosya okuma, yazma, dosya stream'leri ve diğer temel dosya işlemleri üzerine örnekler içermektedir.

Java'da "file stream" veya "dosya akışları" genellikle dosya işleme operasyonları için kullanılan bir terimdir. Java'da dosya işleme işlemleri için kullanılan temel sınıflardan bazıları FileInputStream, FileOutputStream, FileReader, ve FileWriter gibi sınıflardır.
Streamler veri akışını temsil ederler.


**FileInputStream ve FileOutputStream:**

•	FileInputStream ve FileOutputStream, düşük seviyeli byte tabanlı dosya işlemleri için kullanılır.

•	FileInputStream, bir dosyadan veri okumak için kullanılır.

•	FileOutputStream, bir dosyaya veri yazmak için kullanılır

**FileReader ve FileWriter:**

•	FileReader ve FileWriter, yüksek seviyeli karakter tabanlı dosya işlemleri için kullanılır.

•	FileReader, bir dosyadan karakter verisi okumak için kullanılır.

•	FileWriter, bir dosyaya karakter verisi yazmak için kullanılır.



**File/Path Sınıfları**
Java'da File ve Path sınıfları, dosya ve dizin işlemleri için kullanılan farklı sınıflardır. Ancak, Path sınıfı, Java 7 ve sonrasında, File sınıfına göre daha modern bir alternatif olarak sunulmuştur. İşlevsellik açısından bazı farklılıklar ve avantajlar bulunmaktadır.

**File** = java file sınıfı dosyaları ve dizileri soyut bir şekilde tanımlar. File sınıfı; dosya/dizi yaratma, dosya arama, dosya silme maksatlarıyla kullanılır.

**Path** = Dosya sisteminde yer alan yolun(path) programatik olarak tanımlanmış halidir. File sınıfı ile birlikte dosyalar ve dizinler üzerinde işlem yapmak için kullanılır



## Dosya İşlemleri

1. **Dosya Okuma (File Reading)**: Bir dosyadan veri okuma işlemlerini içerir.

2. **Dosya Yazma (File Writing)**: Bir dosyaya veri yazma işlemlerini içerir.

3. **Dosya Stream'leri (File Streams)**: FileInputStream ve FileOutputStream gibi dosya stream'leri kullanılarak dosya okuma ve yazma işlemleri.

## Nasıl Kullanılır

Her dosya işlemi örneği için ayrı bir dizin bulunmaktadır. İlgili dizine giderek, dosya işleminin temel özellikleri ve kullanım örnekleri için talimatları takip edebilirsiniz.
