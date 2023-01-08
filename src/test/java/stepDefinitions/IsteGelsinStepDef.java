package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.IsteGelsinPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class IsteGelsinStepDef {

    IsteGelsinPage page= new IsteGelsinPage();

    @Given("Kullanici {string} gider")
    public void kullaniciGider(String url) {

        getDriver().get(ConfigReader.getProperty(url));

       try {
           ReusableMethods.waitFor(5);
           ReusableMethods.jsScrollClick(page.reklamSonrakiButon);
           ReusableMethods.jsScrollClick(page.reklamSonrakiButon);
           ReusableMethods.jsScrollClick(page.reklamTamamButon);
           ReusableMethods.jsScrollClick(page.dahaSonraButon);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /*
        Bu kısımda kodların try-catch kullanılmasının sebebi:
        Try-catch bloğu, bir programın çalışması sırasında oluşabilecek hataları (exceptions) yakalamak
        ve bu hataların programın çalışmasını etkilememesi için kullanılır.
        Bu sayede program, hatayı fark edip onu yakalayarak hatayı önler veya hatayı giderir.
        Try-catch bloğu genellikle bir "try" bloğu ve bir "catch" bloğu olmak üzere iki bölümden oluşur.
        Try bloğu, hatalı olabilecek kod parçacıklarını içerir. Catch bloğu ise try bloğunda oluşabilecek
        hataları yakalar ve bu hatalarla nasıl başa çıkılacağını belirler.
         */

    }
    @Then("Kullanici Giris yap veya Uye ol butonunun gorunur oldugunu dogrular ve butona  tiklar")
    public void kullaniciGirisYapVeyaUyeOlButonununGorunurOldugunuDogrularVeButonaTiklar() {
        assertTrue(page.loginButon.isDisplayed());
        page.loginButon.click();
    }

    @Then("Kullanici hoş geldin ve sms onayi metninin gorunur oldugunu dogrular")
    public void kullaniciHoşGeldinVeSmsOnayiMetnininGorunurOldugunuDogrular() throws IOException {

        page.cerezKapat.click();

        assertTrue(page.hosGeldinText.isDisplayed());
        assertTrue(page.smsOnayText.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshotWebElement("SmsOnay",page.smsOnay);
    }

    @Then("Kullanici telefon numarasi alaninin {string} olarak default geldigini dogrular")
    public void kullaniciTelefonNumarasiAlanininOlarakDefaultGeldiginiDogrular(String Kod) throws IOException {

        ReusableMethods.getScreenshotWebElement("Kod+90",page.phoneNumber);
        assertEquals(Kod,page.phoneNumber.getAttribute("value"));

    }

    @Then("Kullanici telefon  numarasini girer ve devam et butonuna tiklar")
    public void kullaniciTelefonNumarasiniGirerVeDevamEtButonunaTiklar() {

        page.phoneNumber.sendKeys(ConfigReader.getProperty("phoneNumber"));
        page.devamEtButon.click();

    }

    @Then("Kullanici otp ekraninin açıldigini dogrular ve otp dogru girilir")
    public void kullaniciOtpEkranininAçıldiginiDogrularVeOtpDogruGirilir() {
        assertTrue(page.dogrulamaKodu.isDisplayed());
    }

    @Then("Kullanici alisverise basla butonuna tiklar")
    public void kullaniciAlisveriseBaslaButonunaTiklar() throws InterruptedException {
        ReusableMethods.waitFor(10);
        ReusableMethods.waitForVisibility(page.alisveriseBasla,3);
        page.alisveriseBasla.click();
        //page.dahaSonraButton.click();//

        /*
        Bu aşamada login olma işlemine manuel olarak devam edilmesi gerekliydi.
        Çünkü Login olma işlemni gerçek telefon ve telefona gelen bir OTP koduyla yapılıyor.
         */
    }

    @Then("Kullanici arama kutusuna istedigi bir urun ismini girer")
    public void kullaniciAramaKutusunaIstedigiBirUrunIsminiGirer() {

        page.aramaButonu.sendKeys("Meyveli Soda" );
        ReusableMethods.jsScrollClick(page.aramaclick);

        //   boolean inputEntered = false;
        //   for (WebElement each:page.otpIsSelected) {
        //       ReusableMethods.waitForVisibility(each,3);
        //       if (each.getText().isEmpty()) {
        //           continue;
        //       }
        //       each.click();
        //       inputEntered = true;
        //   }
//
        //   if (inputEntered) {
        //       while (!page.alisveriseBasla.isDisplayed()) {
        //           ReusableMethods.waitForVisibility(page.alisveriseBasla,10);
        //       }
        //       page.alisveriseBasla.click();
        //       page.aramaButonu.sendKeys("Meyveli Soda" );
        //       ReusableMethods.jsScrollClick(page.aramaclick);
        //   }

        /*
        Yukarıdaki işlem otomasyon koşumu olarak gerçekleştirilmeye çalışıldı ama
        sitede OTP alanına otomasyonla herhangi bir veri girişi yapılamadığı için yoruma alındı.

        Bu kod, "otpIsSelected" dizisinin her bir elemanı için döngü oluşturur.
        Eğer herhangi bir elemanın metin özelliği boş değilse, o elemana tıklanır ve
        "inputEntered" değişkeni "true" olarak ayarlanır. Döngü sona erdikten sonra,
        "inputEntered" değişkeni "true" ise "alisveriseBasla" nesnesinin görünür
        olup olmadığı kontrol edilir. Eğer nesne görünür değilse, "alisveriseBasla"
        nesnesinin görünür olması beklenir ve "alisveriseBasla" nesnesine tıklanır.
        Daha sonra, "aramaButonu" nesnesine "Meyveli Soda" yazılır ve "aramaclick" nesnesine tıklanır.
         */

    }

    @Then("Kullanici onerilen siralamalardan fiyati artana gore secenegini secer")
    public void kullaniciOnerilenSiralamalardanFiyatiArtanaGoreSeceneginiSecer() {
        ReusableMethods.jsScrollClick(page.fiyatiArtanUrun);
        ReusableMethods.waitFor(3);

    }

    @And("Kullanici fiyati en dusuk olan urunu sepete ekler ve sepete ekledigini dogrular")
    public void kullaniciFiyatiEnDusukOlanUrunuSepeteEklerVeSepeteEklediginiDogrular() throws IOException {
        ReusableMethods.waitFor(3);
        page.arananUrunListesi.get(0).click();
        page.sepetBox.click();
        page.sepeteGitButon.click();
        ReusableMethods.waitFor(5);
        assertTrue(page.sepet.isDisplayed());
        ReusableMethods.waitFor(6);
        ReusableMethods.getScreenshotWebElement("Sepetteki Urun",page.sepet);
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}