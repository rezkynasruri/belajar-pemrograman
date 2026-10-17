kode_benar = "0042"
Masukan_Kode = input("masukan kode:")

if kode_benar == Masukan_Kode:
    print("ACCESS GRANTED")
elif Masukan_Kode == 0:
    print("DEFAULT CODE DETECTED")
else:
    print("ACCEES DENIED")