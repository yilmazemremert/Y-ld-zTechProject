<h2 align=center style="color:white" > Yılmaz Emre MERT </h2>
<h2 align=center style="color:white" > QA Engineer </h2>
<h2 align=center style="color:white" > İste Gelsin Projesi </h2>
<br>
<h2 align=center style="color:white" >Proje Bilgisi </h2>
Yıldız Tech. ürünü olan https://www.istegelsin.com/ web uygulamasını selenium ' da Java ile gherkin dili ile çalışma yapıldı. 
Cucumber Framework kullanıldı. Bu framework ile iki farklı raporlama kullanıldı. Raporlar target klasörün altında görüntülenmesi sağlanıldı. 
Cucumber Framework kullanılmasının sebebi BDD odaklaklı olması ve None Technical sebebi ile tercih edildi. Class yapısına uygun çatı oluşturuldu.
Pages klasörün altında İste Gelsin Classın' da locator' lar tutuldu. Runner klasörün altında bulunan TestRunner ile tester koşumu sağlanabilmekte. 
Cucumber Options altında HTML raporlar, features alanında ise steplerin tutuldu yer olarak belirlendi. Tags alanında ise features altında olan Negatif - Pozitif test başlık adı 
ile çağrım sağlanıldı. 
<p></p>
<br>
<h3> Kullanılan Teknolojiler:</h3>
[github]: https://github.com/yilmazemremert
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png">
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/selenium/selenium.png">
<img src="https://github.com/devicons/devicon/blob/master/icons/cucumber/cucumber-plain.svg" title="Cucumber" alt="Cucumber" width="40" height="40"/>
<h3> Kullanılan Araçlar:</h3>
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/github/github.png">
<a href="https://www.jetbrains.com/idea/features/" target="_blank" rel=”noopener”> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQalKFwVDd0H7Xx8HaqWBbUmDRdrgxUoicGBZC0eIzTsww7Sev-ySXJ3in9Udv2R9CR3lo&usqp=CAU" alt="IntelliJ" width="40" height="40"/> </a>
<br>
<h2>Proje Raporları </h2>
--Pozitif Test
<br>
*Cucumber Reports: https://prnt.sc/ypwvS714eMeU
<br>
*Cucumber-html-reports: https://prnt.sc/iiCX7vV_OCUt
<br>
--Negatif Test
<br>
*Cucumber Reports: https://prnt.sc/fxunmLzY5XbE
<br>
*Cucumber-html-reports: https://prnt.sc/bLswFPiiIPih
<br>
<p></p>

<br>
<h2>Proje Örnek Senaryosu </h2>
--İstegelsin web sitesi başarılı ve başarısız login olma. 
<br>
--Eğer başarılı login olunmuşsa seçtiğiniz bir ürünü aratma,
<br>
--Çıkan ürün sonuçlarını En düşük fiyata göre sıralama,
<br>
--En düşük fiyatlı ürünü sepete ekleme,
<br>
--Her aşamanın assert kontrollerinin yapılması ve loglanması,
<br>
--Test sonuçları harici html otomasyon test rapor toollu kullanılarak görsel sonuçlar testler bittiğinde raporlanmalıdır.
<br>
--Senaryonun Schedule edilebilmesinin çalışmaya pozitif katkısı olacaktır.

<p></p>

<h2>Gerçekleşen Seneryo </h2>
--Site üzerinde başarılı login işlemi gerçekleşmeden de bir ürün aratılıp sepete eklenebiliyor. Fakat ödeme işlemine geçebilmek için login olunmasını isteniyor.
<br>
--Ayrıca yine sitede bazı Loading sorunları var bu sorunları otomasyonla aşabilmek amacıyla ReusableMethods class'ında yer alan wait methodları kullanıldı.
<br>
<p></p>
