batas_login = 5
jumblah_login = int(input("masukan login:"))
jumbah = batas_login - jumblah_login
if jumblah_login < 5:
    print(f"ACOUNT AKTIF {jumbah}")
else:
    print(f"ACOUNT LOCKED {jumbah}")