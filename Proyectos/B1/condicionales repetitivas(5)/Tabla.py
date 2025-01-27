numero = int(input("Ingresa un número para mostrar su tabla de multiplicar: "))

contador = 1
while contador <= 10:
    resultado = numero * contador
    print(numero, "x", contador, "=", resultado)
    contador += 1