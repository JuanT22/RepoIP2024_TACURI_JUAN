suma = 0
numero = 1  # Inicializar con un valor diferente de 0 para que el bucle se ejecute al menos una vez

print("Ingresa números para sumarlos. Ingresa 0 para terminar.")

while numero != 0:
    try:
        numero = float(input("Ingresa un número: "))  # Permitir números decimales
        suma += numero
    except ValueError:
        print("Entrada inválida. Ingresa un número válido.")

print("La suma de los números ingresados es:", suma)