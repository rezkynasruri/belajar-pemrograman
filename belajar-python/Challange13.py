gagal_login = int(input("Masukkan jumlah login yang gagal: "))
kode = input("Masukkan kode akses: ")

if gagal_login >= 5 or kode == "000":
    print("ACCOUNT LOCKED")
elif gagal_login >= 3:
    print("SUSPICIOUS")
elif gagal_login < 3 and kode == "042":
    print("NORMAL")
else:
    print("ACCESS DENIED")