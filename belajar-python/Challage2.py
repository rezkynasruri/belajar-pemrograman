ussername = input("masukan ussername:")
batas_login = 10
gagal_login = int (input("masukan angka:"))
sisa_percobaan = batas_login - gagal_login
print(sisa_percobaan)
print(f"ussername {ussername}|" f"login gagal {gagal_login}|" f"sisa percobaan {sisa_percobaan}")