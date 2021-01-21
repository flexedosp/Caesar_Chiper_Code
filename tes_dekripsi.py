# Program Python yang menggambarkan teknik Caesar Chiper

def encrypt(text,s): 
    result = "" 
  
    for i in range(len(text)): 
        if(text[i]==" "):
            result += " "
        else :
            char = text[i] 

            # Mendekripsi huruf kapital
            if (char.isupper()): 
                result += chr((ord(char) - s - 65) % 26 + 65)
            
            # Mendekripsi angka
            elif(char.isnumeric()):
                result += chr((ord(char) - s - 48) % 10 + 48)
  
            # Mendekripsi huruf kecil
            elif(char.islower()): 
                result += chr((ord(char) - s - 97) % 26 + 97) 
  
    return result 
  
#check the above function 
text = "Jevm 43"
s = 4
print("Text  : " + text) 
print ("Shift : " + str(s)) 
print ("Cipher: " + encrypt(text,s))