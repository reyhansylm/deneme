import json

class Sistem():

    def __init__(self):
        self.durum=True
        self.veriler=self.veri_al()


    def menu_goster(self):
        print("""
        
        1-Giris Yap
        2-Kayit Ol
        3-Sifremi Unuttum
        4-Cikis
        """)

    def veri_al(self):

        try:
            with open("kullanicilar.json", "r") as dosya:
                veriler = json.load(dosya)
        except FileNotFoundError:
            with open("kullanicilar.json", "w") as dosya:
                dosya.write("{}")
            with open("kullanicilar.json", "r") as dosya:
                veriler = json.load(dosya)
        return veriler

    def menu_secim(self):
        while True:
            try:
                secim = int(input("Seciminizi yapiniz: "))
                break
            except ValueError:
                print("Lutfen sayi giriniz:\n")
        return secim



    def giris_yap(self):
        kadi=input("Kullanici adini giriniz: ")
        sifre=input("Sifre giriniz: ")

        durumm=self.kontrol_et(kadi,sifre)

        if durumm:
            self.giris_basarili()
        else:
            self.giris_basarisiz()



    def kayit_ol(self):
        kadi = input("Kullanici adini giriniz: ")
        sifre = input("Sifre giriniz: ")
        tsifre = input("Sifrenizi tekrar giriniz: ")
        email=input("E-mail adresinizi giriniz: ")

        while True:
            if sifre==tsifre:
                break
            else:
                print("Sifreler uyusmuyor.Tekrar giriniz: ")
                sifre = input("Sifre giriniz: ")
                tsifre = input("Sifrenizi tekrar giriniz: ")
        durumm=self.kayit_varmi(kadi,email)

        if durumm:
            print("Bu kullanici adi veya e-posta sistemde kayitli")
        else:
            print("Kaydiniz olusturuldu ")

    def sifremi_unuttum(self):
        pass

    def cikis(self):
        self.durum=False

    def kontrol_et(self,kadi,sifre):
       self.veriler=self.veri_al()

       for i in self.veriler["kullanicilar"]:
           if i["kadi"] == kadi and i["sifre"] == sifre:
               return True
       return False


    def giris_basarili(self):
        print("Hos Geldiniz: ")

        self.durum=False

    def giris_basarisiz(self):
        print("Bilgiler Hatali")

    def kayit_varmi(self,kadi,email):
        self.veriler=self.veri_al()
        try:
            for i in self.veriler["kullanicilar"]:
                if i["kadi"] == kadi and i["email"] == email:
                    return True
        except KeyError:
            return False
        return False

    def calistir(self):
        self.menu_goster()
        secim=self.menu_secim()


        if secim==1:
            self.giris_yap()
        if secim==2:
            self.kayit_ol()
        if secim==3:
            self.sifremi_unuttum()
        if secim==4:
            self.cikis()

    def kaydet(self,kadi,sifre,email):
        self.veriler=self.veri_al()

        try:
            self.veriler["kullanicilar"].append({"kadi": kadi, "sifre": sifre, "email": email})
        except KeyError:
            self.veriler["kullanicilar"]={"kadi": kadi, "sifre": sifre, "email": email}

        with open("kullanicilar.json","w") as dosya:
            json.dump(self.veriler,dosya)





sistem=Sistem()

while sistem.durum:
    sistem.calistir()
