edad = int(input("Ingresa tu edad: "))

if edad < 18:
    print("Eres menor de edad.")
elif edad < 65:
    print("Eres adulto.")
else:
    print("Eres adulto mayor.")