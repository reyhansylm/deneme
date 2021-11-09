from random import choice
class Mp3Calar():

    def __init__(self,sarkilar=[]):
        self.sarkilar=sarkilar
        self.suancalan=""
        self.ses=100
        self.durum=True



    def sarki_sec(self):
        sayac = 1

        for i in self.sarkilar:
            print("{}){}".format(sayac, i))
            sayac += 1

        suancalan = int(input("Secmek istediginiz sarkinin numarasini giriniz: "))
        self.suancalan = self.sarkilar[suancalan - 1]

    def ses_artir(self):
        if self.ses == 100:
            pass
        else:
            self.ses += 10

    def ses_azalt(self):
        if self.ses == 100:
            pass
        else:
            self.ses -= 10

    def rastgele_sarki(self):
        rassarki = choice(self.sarkilar)
        self.suancalan = rassarki

    def sarki_ekle(self):
        sanatci = input("Sanatciyi/Grubu giriniz: ")
        sarki = input("Sarkiyi giriniz: ")
        self.sarkilar.append(sanatci + "-" + sarki)

    def sarki_sil(self):
        sayac = 1

        for i in self.sarkilar:
            print("{}){}".format(sayac, i))
            sayac += 1

        silineceksarki = int(input("Silmek istediginiz sarkinin numarasini giriniz: "))

        self.sarkilar.pop(silineceksarki - 1)

    def kapat(self):
        self.durum=False


    def menugoster(self):
         print("""
        Sarki Listesi: {}
        Suan Calan Sarki: {}
        Ses Duzeyi: {}

        1)SARKI SEC
        2)SES ARTIR
        3)SES AZALT
        4RASTGELE SARKİ
        5)SARKI EKLE
        6)SARKİ SİL
        7)KAPAT

        """.format(self.sarkilar,self.suancalan,self.ses))

    def secim(self):
        sec=int(input("Seciminizi yapiniz: "))

        while sec<1 or sec>7:
            sec=int(input("Lutfen 1-7 arsaında bir secim yapiniz: "))
        return sec

    def calistir(self):
        self.menugoster()

        sec=self.secim()

        if sec==1:
          self.sarki_sec()

        if sec==2:
         self.ses_artir()

        if sec==3:
            self.ses_azalt()

        if sec==4:
            self.rastgele_sarki()

        if sec==5:
           self.sarki_ekle()

        if sec==6:
             self.sarki_sil()

        if sec==7:
            self.kapat()



mp3calar=Mp3Calar()

while mp3calar.durum:
    mp3calar.calistir()

print("Program sonlandi")
