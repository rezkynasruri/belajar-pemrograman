Login = int(input("masukan login:"))
Batas_Login = 5
Batas_Warning = 4
if Login < Batas_Warning:
    print("NORMAL")
elif Login < Batas_Login:
    print("SUSPICIOUS")
else:
    print('ACCOUNT LOCKED')