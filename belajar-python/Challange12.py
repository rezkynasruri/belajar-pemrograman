Masukan_angka = int(input("Masukan Angka:"))
if Masukan_angka < 3:
    print("NORMAL")
elif Masukan_angka >= 3 and Masukan_angka <5:
    print("SUSPICIOUS")
else:
    print("ACCOUNT LOCKED")