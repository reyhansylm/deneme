from random import randint

oyundurumu=True


while oyundurumu:
    rastgelesayi=randint(1,101)
    tahmin = 7

    while True:

        if tahmin>0:
            tahminsayi=int(input("Tahmin ettiginiz sayiyi giriniz: "))
        else:
            print("Hakkiniz bitti sayi : {} ".format(rastgelesayi))
            break
        if tahminsayi != rastgelesayi:
            tahmin-=1
            if rastgelesayi>tahminsayi:
                print("Yukarı!!")
                print("Kalan hak {} ".format(tahmin))
            else:
                print("Asagi!!")
                print("Kalan hak {} ".format(tahmin))
        else:
            print("Tebrikler sayiyi buldunuz")
            break



