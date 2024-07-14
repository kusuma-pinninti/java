
def encrypt(plainText, d):
 cipherText=""
 for x in plainText:
  if x.isupper():
    cipherText+=chr(ord("A") + (ord(x)-ord("A")+d) % 26)
  else:
   cipherText+=chr(ord("a") + (ord(x)-ord("a")+d) % 26)
 return cipherText
def decrypt(cipherText, d):
 decText=""
 for x in cipherText:
  if x.isupper():
   decText+=chr(ord("A") + (ord(x)-ord("A")-d) % 26)

  else:
   decText+=chr(ord("a") + (ord(x)-ord("a")-d) % 26)
 return decText
plainText=input("Enter the Plain Text: ")
d=int(input("Enter the Shift Value: "))
cipherText=encrypt(plainText, d)
print("Cipher Text is:", cipherText)
decText=decrypt(cipherText, d)
print("Decrypted Text:", decText)
