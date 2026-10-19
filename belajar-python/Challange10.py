percobaan = 5
kode_benar = "0042"
Masukan_Kode = input("Masukan kode:")

if kode_benar == Masukan_Kode:
    print(f"ACCESS GRANTED, percobaan tersedia: {percobaan}")
elif Masukan_Kode == "0000":
    print(f"DEFAULT CODE DETECTED, percobaan tersedia: {percobaan}")
else:
    print(f"ACCESS DENIED, percobaan tersedia: {percobaan}")