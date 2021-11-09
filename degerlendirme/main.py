#sayi1= int(input("Sayi 1 giriniz: "))
#sayi2= int(input("Sayi 2 giriniz: "))

#hip= (sayi1*sayi1)+ (sayi2*sayi2)
#print("Hipotenus degeri: ",hip)

# v=int(input("gerilim degeri gir: "))
# r=int(input("direnc degeri gir: "))
#
# ı=(v/r)
#
# print("Akim degeri: ",ı)

# kelimeler= {} #yani dict
#
# ing_kelime=input("Ogrendiginiz kelimeyi giriniz: ")
# print(ing_kelime)
#
# karsilik=input("Turkce karsiligini yaziniz: ")
# print(karsilik)
#
# kelimeler[ing_kelime]= karsilik
# print(kelimeler)

#
# adi= input("Ogrenci adi giriniz: ")
# vize= int(input("Vize notunu giriniz: "))
# final= int(input("Final notunu giriniz: "))
# toplam= (vize*0.4) + (final*0.6)
#
#
# if toplam>=88:
#     print("Notunuz {} AA aldiniz".format(toplam))
#
# elif toplam>=60:
#     print("Notunuz {} BB aldiniz".format(toplam))
#
# else:
#     print("Notunuz {} FF aldiniz.Kaldiniz".format(toplam))

# sayilar = [1,2,3,4,5,6,7,8]
#
# for k in sayilar:
#     print(k**2)
#
# liste= [(0,1),(2,3)]
#
# for x in liste:
#     print(x[0],x[1])

# sayi_gir=int(input("Sayi giriniz: "))
#
# fakt=1
#
# for i in range(1,sayi_gir+1):
#     fakt=fakt*i
#
#
# print(str(fakt))
#
# sahip_para=2000
#
# secimm=input("Giris icin 's' , Cikis icin 'a' harfine basiniz")
#
# if secimm == "s":
#
#     while True:
#      print("Hangi islemi yapmak istersiniz/n1-Para Cekme/n2-Para Yatirma/n3-Kart Bilgileri/n4-Kart Iade")
#      secim = int(input("Secim Yapiniz"))
#
#      if secim==1:
#         tutar=int(input("Cekmek istediginiz tutari giriniz: "))
#         if tutar>sahip_para:
#             print("Yetersiz bakiye")
#         else:
#             sahip_para-=tutar
#             print(str(sahip_para))
#
#      elif secim==2:
#         tutariki=int(input("Yatirmak istediginiz tutari giriniz: "))
#         sahip_para+=tutariki
#         print(str(sahip_para))
#
#      elif secim==3:
#         print("Iban no: 25675815166/nAd: Reyhan/nSoyad: Saylam")
#
#      else:
#         print("KARTI ALINIZ!!")
#         break
#
# else:
#     print("Cikis Yapildi")

# def sayibul(sayi):
#     if sayi%2==0:
#         return "Cift Sayi"
#     else:
#         return "Tek Sayi"
#
# print(sayibul(2))

#
# def tambolen(sayi):
#
#     boslist=[]
#     for i in range(1,sayi):
#        if sayi%i==0:
#            boslist.append(i)
#        else:
#            pass
#     return boslist
#
# print(tambolen(10))