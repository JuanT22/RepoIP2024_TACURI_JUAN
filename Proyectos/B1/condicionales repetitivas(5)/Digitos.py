print("SUMA DE DIGITOS")
numero = int(input("Ingresa un número entero positivo: "))

suma = 0
while numero > 0:
    digito = numero % 10  # Obtener el último dígito
    suma = suma + digito
    numero = numero // 10  # Eliminar el último dígito

print("La suma de los dígitos es:", suma)